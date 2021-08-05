package typings.ionicReact

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicReact.routeActionMod.RouteAction
import typings.ionicReact.routerDirectionMod.RouterDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeInfoMod {
  
  trait RouteInfo[TOptions] extends StObject {
    
    var id: String
    
    var lastPathname: js.UndefOr[String] = js.undefined
    
    var params: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
    
    var pathname: String
    
    var prevRouteLastPathname: js.UndefOr[String] = js.undefined
    
    var pushedByRoute: js.UndefOr[String] = js.undefined
    
    var routeAction: js.UndefOr[RouteAction] = js.undefined
    
    var routeAnimation: js.UndefOr[AnimationBuilder] = js.undefined
    
    var routeDirection: js.UndefOr[RouterDirection] = js.undefined
    
    var routeOptions: js.UndefOr[TOptions] = js.undefined
    
    var search: String
    
    var tab: js.UndefOr[String] = js.undefined
  }
  object RouteInfo {
    
    inline def apply[TOptions](id: String, pathname: String, search: String): RouteInfo[TOptions] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteInfo[TOptions]]
    }
    
    extension [Self <: RouteInfo[?], TOptions](x: Self & RouteInfo[TOptions]) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLastPathname(value: String): Self = StObject.set(x, "lastPathname", value.asInstanceOf[js.Any])
      
      inline def setLastPathnameUndefined: Self = StObject.set(x, "lastPathname", js.undefined)
      
      inline def setParams(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPrevRouteLastPathname(value: String): Self = StObject.set(x, "prevRouteLastPathname", value.asInstanceOf[js.Any])
      
      inline def setPrevRouteLastPathnameUndefined: Self = StObject.set(x, "prevRouteLastPathname", js.undefined)
      
      inline def setPushedByRoute(value: String): Self = StObject.set(x, "pushedByRoute", value.asInstanceOf[js.Any])
      
      inline def setPushedByRouteUndefined: Self = StObject.set(x, "pushedByRoute", js.undefined)
      
      inline def setRouteAction(value: RouteAction): Self = StObject.set(x, "routeAction", value.asInstanceOf[js.Any])
      
      inline def setRouteActionUndefined: Self = StObject.set(x, "routeAction", js.undefined)
      
      inline def setRouteAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "routeAnimation", js.Any.fromFunction2(value))
      
      inline def setRouteAnimationUndefined: Self = StObject.set(x, "routeAnimation", js.undefined)
      
      inline def setRouteDirection(value: RouterDirection): Self = StObject.set(x, "routeDirection", value.asInstanceOf[js.Any])
      
      inline def setRouteDirectionUndefined: Self = StObject.set(x, "routeDirection", js.undefined)
      
      inline def setRouteOptions(value: TOptions): Self = StObject.set(x, "routeOptions", value.asInstanceOf[js.Any])
      
      inline def setRouteOptionsUndefined: Self = StObject.set(x, "routeOptions", js.undefined)
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      inline def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      inline def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
    }
  }
}
