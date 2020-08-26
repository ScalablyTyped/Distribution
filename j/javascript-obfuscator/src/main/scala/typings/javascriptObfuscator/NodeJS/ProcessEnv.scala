package typings.javascriptObfuscator.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessEnv extends js.Object {
  var BUILD_TIMESTAMP: js.UndefOr[String] = js.native
  var VERSION: js.UndefOr[String] = js.native
}

object ProcessEnv {
  @scala.inline
  def apply(): ProcessEnv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessEnv]
  }
  @scala.inline
  implicit class ProcessEnvOps[Self <: ProcessEnv] (val x: Self) extends AnyVal {
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
    def setBUILD_TIMESTAMP(value: String): Self = this.set("BUILD_TIMESTAMP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBUILD_TIMESTAMP: Self = this.set("BUILD_TIMESTAMP", js.undefined)
    @scala.inline
    def setVERSION(value: String): Self = this.set("VERSION", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVERSION: Self = this.set("VERSION", js.undefined)
  }
  
}

