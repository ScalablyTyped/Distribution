package typings.atIonicAngular.distDirectivesNavigationStackDashUtilsMod

import typings.atAngularRouter.atAngularRouterMod.ActivatedRoute
import typings.atAngularRouter.atAngularRouterMod.Router
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/navigation/stack-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def computeStackId(prefixUrl: js.UndefOr[scala.Nothing], url: String): js.UndefOr[String] = js.native
  def computeStackId(prefixUrl: js.Array[String], url: String): js.UndefOr[String] = js.native
  def destroyView(): Unit = js.native
  def destroyView(view: RouteView): Unit = js.native
  def getUrl(router: Router, activatedRoute: ActivatedRoute): String = js.native
  def insertView(
    views: js.Array[RouteView],
    view: RouteView,
    direction: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify RouterDirection */ js.Any
  ): js.Array[RouteView] = js.native
  def isTabSwitch(enteringView: RouteView): Boolean = js.native
  def isTabSwitch(enteringView: RouteView, leavingView: RouteView): Boolean = js.native
  def toSegments(path: String): js.Array[String] = js.native
}

