package typings.jstree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryStatic extends js.Object {
  /**
    * holds all jstree related functions and variables,
    * including the actual class and methods to create,
    * access and manipulate instances.
    * @property jstree
    * @type {JSTreeStatic}
    */
  var jstree: js.UndefOr[JSTreeStatic] = js.native
  /**
    * helpers
    */
  var vakata: js.UndefOr[VakataStatic] = js.native
}

object JQueryStatic {
  @scala.inline
  def apply(): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryStatic]
  }
  @scala.inline
  implicit class JQueryStaticOps[Self <: JQueryStatic] (val x: Self) extends AnyVal {
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
    def setJstree(value: JSTreeStatic): Self = this.set("jstree", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJstree: Self = this.set("jstree", js.undefined)
    @scala.inline
    def setVakata(value: VakataStatic): Self = this.set("vakata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVakata: Self = this.set("vakata", js.undefined)
  }
  
}

