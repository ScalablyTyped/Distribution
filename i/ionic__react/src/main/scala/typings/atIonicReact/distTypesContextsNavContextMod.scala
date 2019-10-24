package typings.atIonicReact

import typings.atIonicCore.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
import typings.atIonicReact.atIonicReactStrings.none
import typings.atIonicReact.distTypesContextsNavContextMod.NavContextState
import typings.react.reactMod.Context
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/react/dist/types/contexts/NavContext", JSImport.Namespace)
@js.native
object distTypesContextsNavContextMod extends js.Object {
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
    @JSName("navigate")
    def navigate_none(path: String, direction: none): Unit = js.native
    def registerIonPage(page: HTMLElement): Unit = js.native
    def tabNavigate(url: String): Unit = js.native
  }
  
  val NavContext: Context[NavContextState] = js.native
}

