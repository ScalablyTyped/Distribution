package typings
package atIonicAngularLib.distDirectivesNavigationIonDashTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/navigation/ion-tabs", "IonTabs")
@js.native
class IonTabs protected () extends js.Object {
  def this(navCtrl: atIonicAngularLib.distProvidersNavDashControllerMod.NavController) = this()
  var ionTabsDidChange: atAngularCoreLib.atAngularCoreMod.EventEmitter[atIonicAngularLib.Anon_Tab] = js.native
  var ionTabsWillChange: atAngularCoreLib.atAngularCoreMod.EventEmitter[atIonicAngularLib.Anon_Tab] = js.native
  var navCtrl: js.Any = js.native
  var outlet: atIonicAngularLib.distDirectivesNavigationIonDashRouterDashOutletMod.IonRouterOutlet = js.native
  var tabBar: js.UndefOr[atIonicAngularLib.distDirectivesProxiesMod.IonTabBar] = js.native
  def getSelected(): js.UndefOr[java.lang.String] = js.native
  /**
    * @internal
    */
  def onPageSelected(detail: atIonicAngularLib.distDirectivesNavigationStackDashUtilsMod.StackEvent): scala.Unit = js.native
  def select(tab: java.lang.String): js.Promise[scala.Boolean] = js.native
}

