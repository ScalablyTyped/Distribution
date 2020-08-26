package typings.htmltojsx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClass extends js.Object {
  var createClass: js.UndefOr[Boolean] = js.native
  /** as a string e.g. '    ' or '\t' */
  var indent: js.UndefOr[String] = js.native
  var outputClassName: js.UndefOr[String] = js.native
}

object CreateClass {
  @scala.inline
  def apply(): CreateClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClass]
  }
  @scala.inline
  implicit class CreateClassOps[Self <: CreateClass] (val x: Self) extends AnyVal {
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
    def setCreateClass(value: Boolean): Self = this.set("createClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateClass: Self = this.set("createClass", js.undefined)
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    @scala.inline
    def setOutputClassName(value: String): Self = this.set("outputClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputClassName: Self = this.set("outputClassName", js.undefined)
  }
  
}

