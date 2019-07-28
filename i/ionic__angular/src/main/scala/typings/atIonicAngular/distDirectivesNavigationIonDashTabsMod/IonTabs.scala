package typings.atIonicAngular.distDirectivesNavigationIonDashTabsMod

import typings.atAngularCore.atAngularCoreMod.EventEmitter
import typings.atIonicAngular.Anon_Tab
import typings.atIonicAngular.distDirectivesNavigationIonDashRouterDashOutletMod.IonRouterOutlet
import typings.atIonicAngular.distDirectivesNavigationStackDashUtilsMod.StackEvent
import typings.atIonicAngular.distDirectivesProxiesMod.IonTabBar
import typings.atIonicAngular.distProvidersNavDashControllerMod.NavController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/navigation/ion-tabs", "IonTabs")
@js.native
class IonTabs protected () extends js.Object {
  def this(navCtrl: NavController) = this()
  var ionTabsDidChange: EventEmitter[Anon_Tab] = js.native
  var ionTabsWillChange: EventEmitter[Anon_Tab] = js.native
  var navCtrl: js.Any = js.native
  var outlet: IonRouterOutlet = js.native
  var tabBar: js.UndefOr[IonTabBar] = js.native
  def getSelected(): js.UndefOr[String] = js.native
  /**
    * @internal
    */
  def onPageSelected(detail: StackEvent): Unit = js.native
  def select(tab: String): js.Promise[Boolean] = js.native
}

