package typings
package atJupyterlabApplicationLib.libRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/application/lib/router", "Router")
@js.native
class Router protected () extends IRouter {
  /**
    * Create a URL router.
    */
  def this(options: atJupyterlabApplicationLib.libRouterMod.RouterNs.IOptions) = this()
  var _routed: js.Any = js.native
  var _rules: js.Any = js.native
  /**
    * A signal emitted when the router routes a route.
    */
  @JSName("routed")
  val routed_Router: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabApplicationLib.libRouterMod.IRouterNs.ILocation] = js.native
  /**
    * Route a specific path to an action.
    *
    * #### Notes
    * If a pattern is matched, its command will be invoked with arguments that
    * match the `IRouter.ILocation` interface.
    */
  def route(): scala.Unit = js.native
}

