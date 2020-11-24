package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportingMenuObject extends js.Object {
  
  /**
    * The click handler for the menu item.
    */
  var onclick: js.UndefOr[EventCallbackFunction[Chart_]] = js.native
  
  /**
    * Indicates a separator line instead of an item.
    */
  var separator: js.UndefOr[Boolean] = js.native
  
  /**
    * The text for the menu item.
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * If internationalization is required, the key to a language string.
    */
  var textKey: js.UndefOr[String] = js.native
}
object ExportingMenuObject {
  
  @scala.inline
  def apply(): ExportingMenuObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportingMenuObject]
  }
  
  @scala.inline
  implicit class ExportingMenuObjectOps[Self <: ExportingMenuObject] (val x: Self) extends AnyVal {
    
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
    def setOnclick(value: EventCallbackFunction[Chart_]): Self = this.set("onclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    
    @scala.inline
    def setSeparator(value: Boolean): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextKey(value: String): Self = this.set("textKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextKey: Self = this.set("textKey", js.undefined)
  }
}
