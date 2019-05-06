package typings
package atIonicAngularLib.distUtilIonicDashRouterDashReuseDashStrategyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/util/ionic-router-reuse-strategy", "IonicRouteStrategy")
@js.native
class IonicRouteStrategy ()
  extends atAngularRouterLib.atAngularRouterMod.RouteReuseStrategy {
  def retrieve(_route: atAngularRouterLib.atAngularRouterMod.ActivatedRouteSnapshot): atAngularRouterLib.srcRouteUnderscoreReuseUnderscoreStrategyMod.DetachedRouteHandle | scala.Null = js.native
  def shouldAttach(_route: atAngularRouterLib.atAngularRouterMod.ActivatedRouteSnapshot): scala.Boolean = js.native
  def shouldDetach(_route: atAngularRouterLib.atAngularRouterMod.ActivatedRouteSnapshot): scala.Boolean = js.native
  def shouldReuseRoute(
    future: atAngularRouterLib.atAngularRouterMod.ActivatedRouteSnapshot,
    curr: atAngularRouterLib.atAngularRouterMod.ActivatedRouteSnapshot
  ): scala.Boolean = js.native
  def store(
    _route: atAngularRouterLib.atAngularRouterMod.ActivatedRouteSnapshot,
    _detachedTree: atAngularRouterLib.srcRouteUnderscoreReuseUnderscoreStrategyMod.DetachedRouteHandle
  ): scala.Unit = js.native
}

