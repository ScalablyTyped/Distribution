package typings.ionicReact

import org.scalablytyped.runtime.StringDictionary
import typings.ionicCore.animationInterfaceMod.Animation
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicReact.routeActionMod.RouteAction
import typings.ionicReact.routerDirectionMod.RouterDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeInfoMod {
  
  @js.native
  trait RouteInfo[TOptions] extends StObject {
    
    var id: String = js.native
    
    var lastPathname: js.UndefOr[String] = js.native
    
    var params: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
    
    var pathname: String = js.native
    
    var prevRouteLastPathname: js.UndefOr[String] = js.native
    
    var pushedByRoute: js.UndefOr[String] = js.native
    
    var routeAction: js.UndefOr[RouteAction] = js.native
    
    var routeAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    var routeDirection: js.UndefOr[RouterDirection] = js.native
    
    var routeOptions: js.UndefOr[TOptions] = js.native
    
    var search: String = js.native
    
    var tab: js.UndefOr[String] = js.native
  }
  object RouteInfo {
    
    @scala.inline
    def apply[TOptions](id: String, pathname: String, search: String): RouteInfo[TOptions] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteInfo[TOptions]]
    }
    
    @scala.inline
    implicit class RouteInfoMutableBuilder[Self <: RouteInfo[_], TOptions] (val x: Self with RouteInfo[TOptions]) extends AnyVal {
      
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
