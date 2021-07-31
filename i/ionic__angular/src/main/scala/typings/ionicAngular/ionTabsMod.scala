package typings.ionicAngular

import typings.angularCore.mod.EventEmitter
import typings.ionicAngular.anon.Tab
import typings.ionicAngular.ionRouterOutletMod.IonRouterOutlet
import typings.ionicAngular.navControllerMod.NavController
import typings.ionicAngular.proxiesMod.IonTabBar
import typings.ionicAngular.stackUtilsMod.StackEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionTabsMod {
  
  @JSImport("@ionic/angular/directives/navigation/ion-tabs", "IonTabs")
  @js.native
  class IonTabs protected () extends StObject {
    def this(navCtrl: NavController) = this()
    
    def getSelected(): js.UndefOr[String] = js.native
    
    var ionTabsDidChange: EventEmitter[Tab] = js.native
    
    var ionTabsWillChange: EventEmitter[Tab] = js.native
    
    var navCtrl: js.Any = js.native
    
    /**
      * @internal
      */
    def onPageSelected(detail: StackEvent): Unit = js.native
    
    var outlet: IonRouterOutlet = js.native
    
    /**
      * When a tab button is clicked, there are several scenarios:
      * 1. If the selected tab is currently active (the tab button has been clicked
      *    again), then it should go to the root view for that tab.
      *
      *   a. Get the saved root view from the router outlet. If the saved root view
      *      matches the tabRootUrl, set the route view to this view including the
      *      navigation extras.
      *   b. If the saved root view from the router outlet does
      *      not match, navigate to the tabRootUrl. No navigation extras are
      *      included.
      *
      * 2. If the current tab tab is not currently selected, get the last route
      *    view from the router outlet.
      *
      *   a. If the last route view exists, navigate to that view including any
      *      navigation extras
      *   b. If the last route view doesn't exist, then navigate
      *      to the default tabRootUrl
      */
    def select(tab: String): js.Promise[Boolean] = js.native
    
    var tabBar: js.UndefOr[IonTabBar] = js.native
  }
}
