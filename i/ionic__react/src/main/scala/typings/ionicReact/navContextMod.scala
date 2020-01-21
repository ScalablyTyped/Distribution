package typings.ionicReact

import typings.ionicCore.interfaceMod.RouterDirection
import typings.ionicReact.ionicReactStrings.none
import typings.ionicReact.ionicReactStrings.pop
import typings.ionicReact.ionicReactStrings.push
import typings.ionicReact.ionicReactStrings.replace
import typings.react.mod.Context
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/contexts/NavContext", JSImport.Namespace)
@js.native
object navContextMod extends js.Object {
  @js.native
  trait NavContextState extends js.Object {
    var currentPath: js.UndefOr[String] = js.native
    def getPageManager(): js.Any = js.native
    def getStackManager(): js.Any = js.native
    def goBack(): Unit = js.native
    def goBack(defaultHref: String): Unit = js.native
    def hasIonicRouter(): Boolean = js.native
    def navigate(path: String): Unit = js.native
    def navigate(path: String, direction: RouterDirection): Unit = js.native
    def navigate(path: String, direction: none, ionRouteAction: pop): Unit = js.native
    def navigate(path: String, direction: none, ionRouteAction: push): Unit = js.native
    def navigate(path: String, direction: none, ionRouteAction: replace): Unit = js.native
    @JSName("navigate")
    def navigate_none(path: String, direction: none): Unit = js.native
    @JSName("navigate")
    def navigate_pop(path: String, direction: RouterDirection, ionRouteAction: pop): Unit = js.native
    @JSName("navigate")
    def navigate_push(path: String, direction: RouterDirection, ionRouteAction: push): Unit = js.native
    @JSName("navigate")
    def navigate_replace(path: String, direction: RouterDirection, ionRouteAction: replace): Unit = js.native
    def registerIonPage(page: HTMLElement): Unit = js.native
  }
  
  val NavContext: Context[NavContextState] = js.native
}

