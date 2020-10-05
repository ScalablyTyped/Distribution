package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StringDictionary
import typings.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Tooltip //////////////////////////////////////////////////
@js.native
trait TooltipOptions extends TooltipEvents {
  var classes: js.UndefOr[StringDictionary[String]] = js.native
  var content: js.UndefOr[js.Any] = js.native
   // () or string
  var disabled: js.UndefOr[Boolean] = js.native
  var hide: js.UndefOr[js.Any] = js.native
   // boolean, number, string or object
  var items: js.UndefOr[String | JQuery] = js.native
  var position: js.UndefOr[js.Any] = js.native
   // TODO
  var show: js.UndefOr[js.Any] = js.native
   // boolean, number, string or object
  var tooltipClass: js.UndefOr[String] = js.native
   // deprecated in jQuery UI 1.12
  var track: js.UndefOr[Boolean] = js.native
}

object TooltipOptions {
  @scala.inline
  def apply(): TooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipOptions]
  }
  @scala.inline
  implicit class TooltipOptionsOps[Self <: TooltipOptions] (val x: Self) extends AnyVal {
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
    def setClasses(value: StringDictionary[String]): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setContent(value: js.Any): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHide(value: js.Any): Self = this.set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setItems(value: String | JQuery): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setShow(value: js.Any): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setTooltipClass(value: String): Self = this.set("tooltipClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltipClass: Self = this.set("tooltipClass", js.undefined)
    @scala.inline
    def setTrack(value: Boolean): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
  }
  
}

