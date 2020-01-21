package typings.ionicAngular

import typings.ionicAngular.ionRouterOutletMod.IonRouterOutlet
import typings.ionicAngular.navControllerMod.NavController
import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/navigation/ion-back-button", JSImport.Namespace)
@js.native
object ionBackButtonMod extends js.Object {
  @js.native
  class IonBackButtonDelegate protected () extends js.Object {
    def this(routerOutlet: IonRouterOutlet, navCtrl: NavController) = this()
    var defaultHref: js.UndefOr[String | Null] = js.native
    var navCtrl: js.Any = js.native
    var routerOutlet: js.Any = js.native
    /**
      * @internal
      */
    def onClick(ev: Event_): Unit = js.native
  }
  
}

