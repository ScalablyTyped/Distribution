package typings.jqueryCustomselect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQueryCustomSelectOption extends js.Object {
  var customClass: js.UndefOr[String] = js.native
  var mapClass: js.UndefOr[Boolean] = js.native
  var mapStyle: js.UndefOr[Boolean] = js.native
}

object JQueryCustomSelectOption {
  @scala.inline
  def apply(): JQueryCustomSelectOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryCustomSelectOption]
  }
  @scala.inline
  implicit class JQueryCustomSelectOptionOps[Self <: JQueryCustomSelectOption] (val x: Self) extends AnyVal {
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
    def setCustomClass(value: String): Self = this.set("customClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomClass: Self = this.set("customClass", js.undefined)
    @scala.inline
    def setMapClass(value: Boolean): Self = this.set("mapClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapClass: Self = this.set("mapClass", js.undefined)
    @scala.inline
    def setMapStyle(value: Boolean): Self = this.set("mapStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMapStyle: Self = this.set("mapStyle", js.undefined)
  }
  
}

