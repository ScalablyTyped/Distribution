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
    
    @scala.inline
    def apply[TOptions](id: String, pathname: String, search: String): RouteInfo[TOptions] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteInfo[TOptions]]
    }
    
    @scala.inline
    implicit class RouteInfoMutableBuilder[Self <: RouteInfo[?], TOptions] (val x: Self & RouteInfo[TOptions]) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastPathname(value: String): Self = StObject.set(x, "lastPathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastPathnameUndefined: Self = StObject.set(x, "lastPathname", js.undefined)
      
      @scala.inline
      def setParams(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevRouteLastPathname(value: String): Self = StObject.set(x, "prevRouteLastPathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevRouteLastPathnameUndefined: Self = StObject.set(x, "prevRouteLastPathname", js.undefined)
      
      @scala.inline
      def setPushedByRoute(value: String): Self = StObject.set(x, "pushedByRoute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPushedByRouteUndefined: Self = StObject.set(x, "pushedByRoute", js.undefined)
      
      @scala.inline
      def setRouteAction(value: RouteAction): Self = StObject.set(x, "routeAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteActionUndefined: Self = StObject.set(x, "routeAction", js.undefined)
      
      @scala.inline
      def setRouteAnimation(value: (/* baseEl */ js.Any, /* opts */ js.UndefOr[js.Any]) => Animation): Self = StObject.set(x, "routeAnimation", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRouteAnimationUndefined: Self = StObject.set(x, "routeAnimation", js.undefined)
      
      @scala.inline
      def setRouteDirection(value: RouterDirection): Self = StObject.set(x, "routeDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteDirectionUndefined: Self = StObject.set(x, "routeDirection", js.undefined)
      
      @scala.inline
      def setRouteOptions(value: TOptions): Self = StObject.set(x, "routeOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteOptionsUndefined: Self = StObject.set(x, "routeOptions", js.undefined)
      
      @scala.inline
      def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTab(value: String): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabUndefined: Self = StObject.set(x, "tab", js.undefined)
    }
  }
}
