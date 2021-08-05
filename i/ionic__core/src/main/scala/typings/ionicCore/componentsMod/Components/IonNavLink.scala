package typings.ionicCore.componentsMod.Components

import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicCore.mod.ComponentProps
import typings.ionicCore.navInterfaceMod.NavComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonNavLink extends StObject {
  
  /**
    * Component to navigate to. Only used if the `routerDirection` is `"forward"` or `"root"`.
    */
  var component: js.UndefOr[NavComponent] = js.undefined
  
  /**
    * Data you want to pass to the component as props. Only used if the `"routerDirection"` is `"forward"` or `"root"`.
    */
  var componentProps: js.UndefOr[ComponentProps[Null]] = js.undefined
  
  /**
    * The transition animation when navigating to another page.
    */
  var routerAnimation: js.UndefOr[AnimationBuilder] = js.undefined
  
  /**
    * The transition direction when navigating to another page.
    */
  var routerDirection: RouterDirection
}
object IonNavLink {
  
  inline def apply(routerDirection: RouterDirection): IonNavLink = {
    val __obj = js.Dynamic.literal(routerDirection = routerDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonNavLink]
  }
  
  extension [Self <: IonNavLink](x: Self) {
    
    inline def setComponent(value: NavComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentNull: Self = StObject.set(x, "component", null)
    
    inline def setComponentProps(value: ComponentProps[Null]): Self = StObject.set(x, "componentProps", value.asInstanceOf[js.Any])
    
    inline def setComponentPropsUndefined: Self = StObject.set(x, "componentProps", js.undefined)
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setRouterAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "routerAnimation", js.Any.fromFunction2(value))
    
    inline def setRouterAnimationUndefined: Self = StObject.set(x, "routerAnimation", js.undefined)
    
    inline def setRouterDirection(value: RouterDirection): Self = StObject.set(x, "routerDirection", value.asInstanceOf[js.Any])
  }
}
