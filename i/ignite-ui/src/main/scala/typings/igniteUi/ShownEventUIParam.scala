package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShownEventUIParam extends js.Object {
  
  /**
    * Gets the content that was shown as a string.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * Gets the element the popover showed for.
    */
  var element: js.UndefOr[String] = js.native
  
  /**
    * Gets a reference to the %%WidgetName%% widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the popover element showing.
    */
  var popover: js.UndefOr[String] = js.native
}
object ShownEventUIParam {
  
  @scala.inline
  def apply(): ShownEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShownEventUIParam]
  }
  
  @scala.inline
  implicit class ShownEventUIParamOps[Self <: ShownEventUIParam] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setPopover(value: String): Self = this.set("popover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopover: Self = this.set("popover", js.undefined)
  }
}
