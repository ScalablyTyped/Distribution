package typings
package atJupyterlabApplicationLib.libRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRouter extends js.Object {
  /**
    * The base URL for the router.
    */
  val base: java.lang.String = js.native
  /**
    * The command registry used by the router.
    */
  val commands: atPhosphorCommandsLib.atPhosphorCommandsMod.CommandRegistry = js.native
  /**
    * The parsed current URL of the application.
    */
  val current: atJupyterlabApplicationLib.libRouterMod.IRouterNs.ILocation = js.native
  /**
    * A signal emitted when the router routes a route.
    */
  val routed: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IRouter, atJupyterlabApplicationLib.libRouterMod.IRouterNs.ILocation] = js.native
  /**
    * If a matching rule's command resolves with the `stop` token during routing,
    * no further matches will execute.
    */
  val stop: atPhosphorCoreutilsLib.atPhosphorCoreutilsMod.Token[scala.Unit] = js.native
  /**
    * Navigate to a new path within the application.
    *
    * @param path - The new path or empty string if redirecting to root.
    *
    * @param options - The navigation options.
    */
  def navigate(path: java.lang.String): scala.Unit = js.native
  def navigate(path: java.lang.String, options: atJupyterlabApplicationLib.libRouterMod.IRouterNs.INavOptions): scala.Unit = js.native
  /**
    * Register a rule that maps a path pattern to a command.
    *
    * @param options - The route registration options.
    *
    * @returns A disposable that removes the registered rule from the router.
    */
  def register(options: atJupyterlabApplicationLib.libRouterMod.IRouterNs.IRegisterOptions): atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable = js.native
  /**
    * Cause a hard reload of the document.
    */
  def reload(): scala.Unit = js.native
  /**
    * Route a specific path to an action.
    *
    * @param url - The URL string that will be routed.
    *
    * #### Notes
    * If a pattern is matched, its command will be invoked with arguments that
    * match the `IRouter.ILocation` interface.
    */
  def route(url: java.lang.String): scala.Unit = js.native
}

