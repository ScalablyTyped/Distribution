package typings.ionicReact.outletPageManagerMod

import typings.ionicCore.componentsMod.global.HTMLIonRouterOutletElement
import typings.ionicReact.routeInfoMod.RouteInfo
import typings.react.mod.RefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutletPageManagerProps extends js.Object {
  
  var StackManager: js.Any = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var forwardedRef: js.UndefOr[RefObject[HTMLIonRouterOutletElement]] = js.native
  
  var routeInfo: js.UndefOr[RouteInfo[_]] = js.native
}
object OutletPageManagerProps {
  
  @scala.inline
  def apply(StackManager: js.Any): OutletPageManagerProps = {
    val __obj = js.Dynamic.literal(StackManager = StackManager.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutletPageManagerProps]
  }
  
  @scala.inline
  implicit class OutletPageManagerPropsOps[Self <: OutletPageManagerProps] (val x: Self) extends AnyVal {
    
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
    def setStackManager(value: js.Any): Self = this.set("StackManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setForwardedRef(value: RefObject[HTMLIonRouterOutletElement]): Self = this.set("forwardedRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForwardedRef: Self = this.set("forwardedRef", js.undefined)
    
    @scala.inline
    def setRouteInfo(value: RouteInfo[_]): Self = this.set("routeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteInfo: Self = this.set("routeInfo", js.undefined)
  }
}
