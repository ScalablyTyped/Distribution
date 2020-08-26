package typings.materialDesignLite.MaterialDesignLite

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentConfigPublic extends js.Object {
  var classAsString: String = js.native
  var cssClass: String = js.native
  var widget: js.UndefOr[String | Boolean] = js.native
}

object ComponentConfigPublic {
  @scala.inline
  def apply(classAsString: String, cssClass: String): ComponentConfigPublic = {
    val __obj = js.Dynamic.literal(classAsString = classAsString.asInstanceOf[js.Any], cssClass = cssClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfigPublic]
  }
  @scala.inline
  implicit class ComponentConfigPublicOps[Self <: ComponentConfigPublic] (val x: Self) extends AnyVal {
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
    def setClassAsString(value: String): Self = this.set("classAsString", value.asInstanceOf[js.Any])
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidget(value: String | Boolean): Self = this.set("widget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidget: Self = this.set("widget", js.undefined)
  }
  
}

