package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogButtonOptions
  extends /* attr */ StringDictionary[js.Any] {
  var click: js.UndefOr[js.Function1[/* eventObject */ JQueryEventObject, _]] = js.native
  var icons: js.UndefOr[js.Any] = js.native
  var showText: js.UndefOr[String | Boolean] = js.native
  var text: js.UndefOr[String] = js.native
}

object DialogButtonOptions {
  @scala.inline
  def apply(): DialogButtonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogButtonOptions]
  }
  @scala.inline
  implicit class DialogButtonOptionsOps[Self <: DialogButtonOptions] (val x: Self) extends AnyVal {
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
    def setClick(value: /* eventObject */ JQueryEventObject => _): Self = this.set("click", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    @scala.inline
    def setIcons(value: js.Any): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setShowText(value: String | Boolean): Self = this.set("showText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowText: Self = this.set("showText", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

