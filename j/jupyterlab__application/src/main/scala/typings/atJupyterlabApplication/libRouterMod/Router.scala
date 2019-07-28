package typings.atJupyterlabApplication.libRouterMod

import typings.atJupyterlabApplication.libRouterMod.RouterNs.IOptions
import typings.atJupyterlabApplication.libTokensMod.IRouter
import typings.atJupyterlabApplication.libTokensMod.IRouterNs.ILocation
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application/lib/router", "Router")
@js.native
class Router protected () extends IRouter {
  /**
    * Create a URL router.
    */
  def this(options: IOptions) = this()
  var _routed: js.Any = js.native
  var _rules: js.Any = js.native
  /**
    * A signal emitted when the router routes a route.
    */
  @JSName("routed")
  val routed_Router: ISignal[this.type, ILocation] = js.native
  /**
    * Route a specific path to an action.
    *
    * #### Notes
    * If a pattern is matched, its command will be invoked with arguments that
    * match the `IRouter.ILocation` interface.
    */
  def route(): js.Promise[Unit] = js.native
}

