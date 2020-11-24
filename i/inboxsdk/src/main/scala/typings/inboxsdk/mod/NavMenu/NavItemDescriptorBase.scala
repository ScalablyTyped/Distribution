package typings.inboxsdk.mod.NavMenu

import typings.inboxsdk.anon.PreventDefault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavItemDescriptorBase extends js.Object {
  
  var accessory: js.UndefOr[
    CreateAccessoryDescriptor | IconButtonAccessoryDescriptor | DropdownButtonAccessoryDescriptor
  ] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var expanderForegroundColor: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var onClick: js.UndefOr[js.Function1[/* event */ PreventDefault, Unit]] = js.native
  
  var orderHint: js.UndefOr[Double] = js.native
  
  var routeID: js.UndefOr[String] = js.native
  
  var routeParams: js.UndefOr[js.Object] = js.native
  
  var `type`: js.UndefOr[NavItemTypes] = js.native
}
object NavItemDescriptorBase {
  
  @scala.inline
  def apply(name: String): NavItemDescriptorBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavItemDescriptorBase]
  }
  
  @scala.inline
  implicit class NavItemDescriptorBaseOps[Self <: NavItemDescriptorBase] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessory(
      value: CreateAccessoryDescriptor | IconButtonAccessoryDescriptor | DropdownButtonAccessoryDescriptor
    ): Self = this.set("accessory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessory: Self = this.set("accessory", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setExpanderForegroundColor(value: String): Self = this.set("expanderForegroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanderForegroundColor: Self = this.set("expanderForegroundColor", js.undefined)
    
    @scala.inline
    def setOnClick(value: /* event */ PreventDefault => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOrderHint(value: Double): Self = this.set("orderHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderHint: Self = this.set("orderHint", js.undefined)
    
    @scala.inline
    def setRouteID(value: String): Self = this.set("routeID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteID: Self = this.set("routeID", js.undefined)
    
    @scala.inline
    def setRouteParams(value: js.Object): Self = this.set("routeParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteParams: Self = this.set("routeParams", js.undefined)
    
    @scala.inline
    def setType(value: NavItemTypes): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
