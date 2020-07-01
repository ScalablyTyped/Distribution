package typings.ionicCore.interfaceMod

import typings.ionicCore.animationInterfaceMod.AnimationBuilder
import typings.ionicCore.mod.ComponentProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavOutlet extends js.Object {
  def getRouteId(): js.Promise[js.UndefOr[RouteID]] = js.native
  def setRouteId(id: String, params: js.UndefOr[ComponentProps[Null]], direction: RouterDirection): js.Promise[RouteWrite] = js.native
  def setRouteId(
    id: String,
    params: js.UndefOr[ComponentProps[Null]],
    direction: RouterDirection,
    animation: AnimationBuilder
  ): js.Promise[RouteWrite] = js.native
}

