package typings.ionicCore

import typings.ionicCore.interfaceMod.RouteChain
import typings.ionicCore.interfaceMod.RouterDirection
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/core/dist/types/components/router/utils/dom", JSImport.Namespace)
@js.native
object domMod extends js.Object {
  def readNavState(): js.Promise[AnonIds] = js.native
  def readNavState(root: HTMLElement): js.Promise[AnonIds] = js.native
  def waitUntilNavNode(): js.Promise[_] = js.native
  def writeNavState(root: js.UndefOr[scala.Nothing], chain: RouteChain, direction: RouterDirection, index: Double): js.Promise[Boolean] = js.native
  def writeNavState(
    root: js.UndefOr[scala.Nothing],
    chain: RouteChain,
    direction: RouterDirection,
    index: Double,
    changed: Boolean
  ): js.Promise[Boolean] = js.native
  def writeNavState(root: HTMLElement, chain: RouteChain, direction: RouterDirection, index: Double): js.Promise[Boolean] = js.native
  def writeNavState(root: HTMLElement, chain: RouteChain, direction: RouterDirection, index: Double, changed: Boolean): js.Promise[Boolean] = js.native
}

