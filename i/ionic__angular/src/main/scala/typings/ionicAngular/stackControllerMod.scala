package typings.ionicAngular

import typings.angularCommon.mod.Location
import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.NgZone
import typings.angularRouter.mod.ActivatedRoute
import typings.angularRouter.mod.Router
import typings.ionicAngular.navControllerMod.NavController
import typings.ionicAngular.stackUtilsMod.RouteView
import typings.ionicAngular.stackUtilsMod.StackEvent
import typings.ionicCore.componentsMod.global.HTMLIonRouterOutletElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stackControllerMod {
  
  @JSImport("@ionic/angular/directives/navigation/stack-controller", "StackController")
  @js.native
  class StackController protected () extends StObject {
    def this(
      tabsPrefix: String,
      containerEl: HTMLIonRouterOutletElement,
      router: Router,
      navCtrl: NavController,
      zone: NgZone,
      location: Location
    ) = this()
    def this(
      tabsPrefix: Unit,
      containerEl: HTMLIonRouterOutletElement,
      router: Router,
      navCtrl: NavController,
      zone: NgZone,
      location: Location
    ) = this()
    
    /* private */ var activeView: js.Any = js.native
    
    def canGoBack(deep: Double): Boolean = js.native
    def canGoBack(deep: Double, stackId: String): Boolean = js.native
    
    /* private */ var containerEl: js.Any = js.native
    
    def createView(ref: ComponentRef[js.Any], activatedRoute: ActivatedRoute): RouteView = js.native
    
    def destroy(): Unit = js.native
    
    def endBackTransition(shouldComplete: Boolean): Unit = js.native
    
    def getActiveStackId(): js.UndefOr[String] = js.native
    
    def getExistingView(activatedRoute: ActivatedRoute): js.UndefOr[RouteView] = js.native
    
    def getLastUrl(): RouteView = js.native
    def getLastUrl(stackId: String): RouteView = js.native
    
    /**
      * @internal
      */
    def getRootUrl(): RouteView = js.native
    def getRootUrl(stackId: String): RouteView = js.native
    
    /* private */ var getStack: js.Any = js.native
    
    /* private */ var insertView: js.Any = js.native
    
    /* private */ var location: js.Any = js.native
    
    /* private */ var navCtrl: js.Any = js.native
    
    /* private */ var nextId: js.Any = js.native
    
    def pop(deep: Double): js.Promise[Boolean] = js.native
    def pop(deep: Double, stackId: String): js.Promise[Boolean] = js.native
    
    /* private */ var router: js.Any = js.native
    
    /* private */ var runningTask: js.Any = js.native
    
    def setActive(enteringView: RouteView): js.Promise[StackEvent] = js.native
    
    /* private */ var skipTransition: js.Any = js.native
    
    def startBackTransition(): js.Promise[Boolean | Unit] = js.native
    
    /* private */ var tabsPrefix: js.Any = js.native
    
    /* private */ var transition: js.Any = js.native
    
    /* private */ var views: js.Any = js.native
    
    /* private */ @JSName("wait")
    var wait_FStackController: js.Any = js.native
    
    /* private */ var zone: js.Any = js.native
  }
}
