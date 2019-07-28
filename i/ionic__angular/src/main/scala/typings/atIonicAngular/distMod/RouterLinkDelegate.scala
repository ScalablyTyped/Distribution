package typings.atIonicAngular.distMod

import typings.atAngularCommon.atAngularCommonMod.LocationStrategy
import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularRouter.atAngularRouterMod.Router
import typings.atAngularRouter.atAngularRouterMod.RouterLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist", "RouterLinkDelegate")
@js.native
class RouterLinkDelegate protected ()
  extends typings.atIonicAngular.distDirectivesNavigationRouterDashLinkDashDelegateMod.RouterLinkDelegate {
  def this(
    locationStrategy: LocationStrategy,
    navCtrl: typings.atIonicAngular.distProvidersNavDashControllerMod.NavController,
    elementRef: ElementRef[_],
    router: Router
  ) = this()
  def this(
    locationStrategy: LocationStrategy,
    navCtrl: typings.atIonicAngular.distProvidersNavDashControllerMod.NavController,
    elementRef: ElementRef[_],
    router: Router,
    routerLink: RouterLink
  ) = this()
}

