package typings.ionicCore.componentsMod.LocalJSX

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.navInterfaceMod.NavComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IonNavLink extends js.Object {
  
  /**
    * Component to navigate to. Only used if the `routerDirection` is `"forward"` or `"root"`.
    */
  var component: js.UndefOr[NavComponent] = js.native
  
  /**
    * Data you want to pass to the component as props. Only used if the `"routerDirection"` is `"forward"` or `"root"`.
    */
  var componentProps: js.UndefOr[ComponentProps[Null]] = js.native
  
  /**
    * The transition animation when navigating to another page.
    */
  var routerAnimation: js.UndefOr[AnimationBuilder] = js.native
  
  /**
    * The transition direction when navigating to another page.
    */
  var routerDirection: js.UndefOr[RouterDirection] = js.native
}
object IonNavLink {
  
  @scala.inline
  def apply(): IonNavLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IonNavLink]
  }
  
  @scala.inline
  implicit class IonNavLinkOps[Self <: IonNavLink] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: NavComponent): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setComponentNull: Self = this.set("component", null)
    
    @scala.inline
    def setComponentProps(value: ComponentProps[Null]): Self = this.set("componentProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponentProps: Self = this.set("componentProps", js.undefined)
    
    @scala.inline
    def setRouterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = this.set("routerAnimation", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRouterAnimation: Self = this.set("routerAnimation", js.undefined)
    
    @scala.inline
    def setRouterDirection(value: RouterDirection): Self = this.set("routerDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouterDirection: Self = this.set("routerDirection", js.undefined)
  }
}
