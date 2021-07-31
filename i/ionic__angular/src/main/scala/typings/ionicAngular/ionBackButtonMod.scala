package typings.ionicAngular

import typings.ionicAngular.configMod.Config
import typings.ionicAngular.ionRouterOutletMod.IonRouterOutlet
import typings.ionicAngular.navControllerMod.NavController
import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionBackButtonMod {
  
  @JSImport("@ionic/angular/directives/navigation/ion-back-button", "IonBackButtonDelegate")
  @js.native
  class IonBackButtonDelegate protected () extends StObject {
    def this(routerOutlet: IonRouterOutlet, navCtrl: NavController, config: Config) = this()
    
    var config: js.Any = js.native
    
    var defaultHref: js.UndefOr[String | Null] = js.native
    
    var navCtrl: js.Any = js.native
    
    /**
      * @internal
      */
    def onClick(ev: Event): Unit = js.native
    
    var routerAnimation: js.UndefOr[AnimationBuilder] = js.native
    
    var routerOutlet: js.Any = js.native
  }
}
