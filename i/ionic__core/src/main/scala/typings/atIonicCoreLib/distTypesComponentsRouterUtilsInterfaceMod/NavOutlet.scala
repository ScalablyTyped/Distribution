package typings
package atIonicCoreLib.distTypesComponentsRouterUtilsInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavOutlet extends js.Object {
  def getRouteId(): js.Promise[js.UndefOr[RouteID]] = js.native
  def setRouteId(
    id: java.lang.String,
    params: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ComponentProps */ js.Any,
    direction: RouterDirection
  ): js.Promise[RouteWrite] = js.native
  def setRouteId(id: java.lang.String, params: js.UndefOr[scala.Nothing], direction: RouterDirection): js.Promise[RouteWrite] = js.native
}

