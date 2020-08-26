package typings.grunt.grunt.util

import typings.grunt.anon.Custom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * {@link http://gruntjs.com/api/grunt.util#grunt.util.spawn}
  */
@js.native
trait ISpawnOptions extends js.Object {
  /**
    * An array of arguments to pass to the command.
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  /**
    * The command to execute. It should be in the system path.
    */
  var cmd: js.UndefOr[String] = js.native
  /**
    * If this value is set and an error occurs, it will be used as the value
    * and null will be passed as the error value.
    */
  var fallback: js.UndefOr[js.Any] = js.native
  /**
    * If specified, the same grunt bin that is currently running will be
    * spawned as the child command, instead of the "cmd" option.
    * Defaults to false.
    */
  var grunt: js.UndefOr[Boolean] = js.native
  /**
    * Additional options for the Node.js child_process spawn method.
    */
  var opts: js.UndefOr[Custom] = js.native
}

object ISpawnOptions {
  @scala.inline
  def apply(): ISpawnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISpawnOptions]
  }
  @scala.inline
  implicit class ISpawnOptionsOps[Self <: ISpawnOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setCmd(value: String): Self = this.set("cmd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCmd: Self = this.set("cmd", js.undefined)
    @scala.inline
    def setFallback(value: js.Any): Self = this.set("fallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFallback: Self = this.set("fallback", js.undefined)
    @scala.inline
    def setGrunt(value: Boolean): Self = this.set("grunt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrunt: Self = this.set("grunt", js.undefined)
    @scala.inline
    def setOpts(value: Custom): Self = this.set("opts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpts: Self = this.set("opts", js.undefined)
  }
  
}

