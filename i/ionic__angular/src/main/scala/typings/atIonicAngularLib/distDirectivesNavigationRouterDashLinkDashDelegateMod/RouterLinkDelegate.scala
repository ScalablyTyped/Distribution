package typings
package atIonicAngularLib.distDirectivesNavigationRouterDashLinkDashDelegateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/navigation/router-link-delegate", "RouterLinkDelegate")
@js.native
class RouterLinkDelegate protected () extends js.Object {
  def this(locationStrategy: atAngularCommonLib.atAngularCommonMod.LocationStrategy, navCtrl: atIonicAngularLib.distProvidersNavDashControllerMod.NavController, elementRef: atAngularCoreLib.atAngularCoreMod.ElementRef[_], router: atAngularRouterLib.atAngularRouterMod.Router) = this()
  def this(locationStrategy: atAngularCommonLib.atAngularCommonMod.LocationStrategy, navCtrl: atIonicAngularLib.distProvidersNavDashControllerMod.NavController, elementRef: atAngularCoreLib.atAngularCoreMod.ElementRef[_], router: atAngularRouterLib.atAngularRouterMod.Router, routerLink: atAngularRouterLib.atAngularRouterMod.RouterLink) = this()
  var elementRef: js.Any = js.native
  var locationStrategy: js.Any = js.native
  var navCtrl: js.Any = js.native
  var router: js.Any = js.native
  var routerDirection: atIonicCoreLib.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection = js.native
  var routerLink: js.UndefOr[js.Any] = js.native
  var subscription: js.UndefOr[js.Any] = js.native
  var updateTargetUrlAndHref: js.Any = js.native
  def ngOnChanges(): js.Any = js.native
  def ngOnDestroy(): js.Any = js.native
  def ngOnInit(): scala.Unit = js.native
  /**
    * @internal
    */
  def onClick(ev: stdLib.UIEvent): scala.Unit = js.native
}

