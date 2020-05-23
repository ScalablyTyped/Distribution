package typings.ionicCore.interfaceMod

import typings.ionicCore.mod.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavOutlet extends js.Object {
  def getRouteId(): js.Promise[js.UndefOr[RouteID]]
  def setRouteId(id: String, params: js.UndefOr[ComponentProps[Null]], direction: RouterDirection): js.Promise[RouteWrite]
}

object NavOutlet {
  @scala.inline
  def apply(
    getRouteId: () => js.Promise[js.UndefOr[RouteID]],
    setRouteId: (String, js.UndefOr[ComponentProps[Null]], RouterDirection) => js.Promise[RouteWrite]
  ): NavOutlet = {
    val __obj = js.Dynamic.literal(getRouteId = js.Any.fromFunction0(getRouteId), setRouteId = js.Any.fromFunction3(setRouteId))
    __obj.asInstanceOf[NavOutlet]
  }
}

