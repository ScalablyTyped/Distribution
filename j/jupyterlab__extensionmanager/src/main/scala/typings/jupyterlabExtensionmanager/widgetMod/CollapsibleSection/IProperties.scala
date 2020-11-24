package typings.jupyterlabExtensionmanager.widgetMod.CollapsibleSection

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * React properties for collapsible section component.
  */
@js.native
trait IProperties extends js.Object {
  
  /**
    * If true, the section will be collapsed and will not respond
    * to open nor close actions.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * If given, this will be diplayed instead of the children.
    */
  var errorMessage: js.UndefOr[String | Null] = js.native
  
  /**
    * If true, the section will be opened if not disabled.
    */
  var forceOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * The header string for section list.
    */
  var header: String = js.native
  
  /**
    * Any additional elements to add to the header.
    */
  var headerElements: js.UndefOr[ReactNode] = js.native
  
  /**
    * Whether the view will be expanded or collapsed initially, defaults to open.
    */
  var isOpen: js.UndefOr[Boolean] = js.native
  
  /**
    * Handle collapse event.
    */
  var onCollapse: js.UndefOr[js.Function1[/* isOpen */ Boolean, Unit]] = js.native
}
object IProperties {
  
  @scala.inline
  def apply(header: String): IProperties = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProperties]
  }
  
  @scala.inline
  implicit class IPropertiesOps[Self <: IProperties] (val x: Self) extends AnyVal {
    
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
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setErrorMessageNull: Self = this.set("errorMessage", null)
    
    @scala.inline
    def setForceOpen(value: Boolean): Self = this.set("forceOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceOpen: Self = this.set("forceOpen", js.undefined)
    
    @scala.inline
    def setHeaderElements(value: ReactNode): Self = this.set("headerElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderElements: Self = this.set("headerElements", js.undefined)
    
    @scala.inline
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpen: Self = this.set("isOpen", js.undefined)
    
    @scala.inline
    def setOnCollapse(value: /* isOpen */ Boolean => Unit): Self = this.set("onCollapse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnCollapse: Self = this.set("onCollapse", js.undefined)
  }
}
