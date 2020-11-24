package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgPopoverHeaderTemplate
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Controls whether the popover renders a functional close button
    */
  var closeButton: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the content for the popover header
    */
  var title: js.UndefOr[String] = js.native
}
object IgPopoverHeaderTemplate {
  
  @scala.inline
  def apply(): IgPopoverHeaderTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgPopoverHeaderTemplate]
  }
  
  @scala.inline
  implicit class IgPopoverHeaderTemplateOps[Self <: IgPopoverHeaderTemplate] (val x: Self) extends AnyVal {
    
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
    def setCloseButton(value: Boolean): Self = this.set("closeButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseButton: Self = this.set("closeButton", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
