package typings.ionicAngular.mod

import typings.angularCommon.mod.LocationStrategy
import typings.angularCore.mod.ElementRef
import typings.angularRouter.mod.Router
import typings.angularRouter.mod.RouterLink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular", "RouterLinkDelegate")
@js.native
class RouterLinkDelegate protected ()
  extends typings.ionicAngular.routerLinkDelegateMod.RouterLinkDelegate {
  def this(
    locationStrategy: LocationStrategy,
    navCtrl: typings.ionicAngular.navControllerMod.NavController,
    elementRef: ElementRef[js.Any],
    router: Router
  ) = this()
  def this(
    locationStrategy: LocationStrategy,
    navCtrl: typings.ionicAngular.navControllerMod.NavController,
    elementRef: ElementRef[js.Any],
    router: Router,
    routerLink: RouterLink
  ) = this()
}
