package typings.ionicReact

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicReact.ionicReactStrings.none
import typings.ionicReact.ionicReactStrings.pop
import typings.ionicReact.ionicReactStrings.push
import typings.ionicReact.ionicReactStrings.replace
import typings.ionicReact.routeInfoMod.RouteInfo
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navContextMod {
  
  @JSImport("@ionic/react/dist/types/contexts/NavContext", "NavContext")
  @js.native
  val NavContext: Context[NavContextState] = js.native
  
  @js.native
  trait NavContextState extends StObject {
    
    def changeTab(tab: String, path: String): Unit = js.native
    def changeTab(tab: String, path: String, routeOptions: js.Any): Unit = js.native
    
    def getIonRedirect(): js.Any = js.native
    
    def getIonRoute(): js.Any = js.native
    
    def getPageManager(): js.Any = js.native
    
    def getStackManager(): js.Any = js.native
    
    def goBack(): Unit = js.native
    def goBack(route: String): Unit = js.native
    def goBack(route: String, animationBuilder: AnimationBuilder): Unit = js.native
    def goBack(route: Unit, animationBuilder: AnimationBuilder): Unit = js.native
    def goBack(route: RouteInfo[js.Any]): Unit = js.native
    def goBack(route: RouteInfo[js.Any], animationBuilder: AnimationBuilder): Unit = js.native
    
    def hasIonicRouter(): Boolean = js.native
    
    def navigate(
      path: String,
      direction: js.UndefOr[RouterDirection | none],
      ionRouteAction: js.UndefOr[push | replace | pop],
      animationBuilder: js.UndefOr[AnimationBuilder],
      options: js.UndefOr[js.Any],
      tab: js.UndefOr[String]
    ): Unit = js.native
    
    def resetTab(tab: String, originalHref: String): Unit = js.native
    def resetTab(tab: String, originalHref: String, originalRouteOptions: js.Any): Unit = js.native
    
    var routeInfo: js.UndefOr[RouteInfo[js.Any]] = js.native
    
    def setCurrentTab(tab: String, routeInfo: RouteInfo[js.Any]): Unit = js.native
  }
}
