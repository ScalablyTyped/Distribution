package typings.lightship.lightshipMod

import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LightshipType extends js.Object {
  val server: Server = js.native
  def createBeacon(): BeaconControllerType = js.native
  def createBeacon(context: BeaconContextType): BeaconControllerType = js.native
  /* Checks if server is in SERVER_IS_READY state */
  def isServerReady(): Boolean = js.native
  /* Checks if server is in SERVER_IS_SHUTTING_DOWN state */
  def isServerShuttingDown(): Boolean = js.native
  /**
    * Registers teardown functions that are called when shutdown is initialized.
    * All registered shutdown handlers are executed in the order they have been registered.
    * After all shutdown handlers have been executed, Lightship asks `process.exit()` to terminate the process synchronously.
    */
  def registerShutdownHandler(shutdownHandler: ShutdownHandlerType): Unit = js.native
  /* Changes server state to SERVER_IS_SHUTTING_DOWN and initialises the shutdown of the application.*/
  def shutdown(): js.Promise[Unit] = js.native
  /* Changes server state to SERVER_IS_NOT_READY. */
  def signalNotReady(): Unit = js.native
  /* Changes server state to SERVER_IS_READY. */
  def signalReady(): Unit = js.native
}

