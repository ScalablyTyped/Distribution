package typings.atIonicAngular.distDirectivesNavigationIonDashBackDashButtonMod

import typings.atIonicAngular.distDirectivesNavigationIonDashRouterDashOutletMod.IonRouterOutlet
import typings.atIonicAngular.distProvidersNavDashControllerMod.NavController
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/navigation/ion-back-button", "IonBackButtonDelegate")
@js.native
class IonBackButtonDelegate protected () extends js.Object {
  def this(routerOutlet: IonRouterOutlet, navCtrl: NavController) = this()
  var defaultHref: js.UndefOr[String | Null] = js.native
  var navCtrl: js.Any = js.native
  var routerOutlet: js.Any = js.native
  /**
    * @internal
    */
  def onClick(ev: Event): Unit = js.native
}

