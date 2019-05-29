package typings
package atIonicAngularLib.distDirectivesNavigationStackDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/navigation/stack-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def computeStackId(prefixUrl: js.UndefOr[scala.Nothing], url: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def computeStackId(prefixUrl: js.Array[java.lang.String], url: java.lang.String): js.UndefOr[java.lang.String] = js.native
  def destroyView(): scala.Unit = js.native
  def destroyView(view: RouteView): scala.Unit = js.native
  def getUrl(
    router: atAngularRouterLib.atAngularRouterMod.Router,
    activatedRoute: atAngularRouterLib.atAngularRouterMod.ActivatedRoute
  ): java.lang.String = js.native
  def insertView(
    views: js.Array[RouteView],
    view: RouteView,
    direction: atIonicCoreLib.distTypesComponentsRouterUtilsInterfaceMod.RouterDirection
  ): js.Array[RouteView] = js.native
  def isTabSwitch(enteringView: RouteView): scala.Boolean = js.native
  def isTabSwitch(enteringView: RouteView, leavingView: RouteView): scala.Boolean = js.native
  def toSegments(path: java.lang.String): js.Array[java.lang.String] = js.native
}

