package typings.lightship.lightshipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightshipType extends js.Object {
  /* Checks if server is in SERVER_IS_READY state */
  def isServerReady(): Boolean
  /* Checks if server is in SERVER_IS_SHUTTING_DOWN state */
  def isServerShuttingDown(): Boolean
  /**
    * Registers teardown functions that are called when shutdown is initialized.
    * All registered shutdown handlers are executed in the order they have been registered.
    * After all shutdown handlers have been executed, Lightship asks `process.exit()` to terminate the process synchronously.
    */
  def registerShutdownHandler(shutdownHandler: ShutdownHandlerType): Unit
  /* Changes server state to SERVER_IS_SHUTTING_DOWN and initialises the shutdown of the application.*/
  def shutdown(): js.Promise[Unit]
  /* Changes server state to SERVER_IS_NOT_READY. */
  def signalNotReady(): Unit
  /* Changes server state to SERVER_IS_READY. */
  def signalReady(): Unit
}

object LightshipType {
  @scala.inline
  def apply(
    isServerReady: () => Boolean,
    isServerShuttingDown: () => Boolean,
    registerShutdownHandler: ShutdownHandlerType => Unit,
    shutdown: () => js.Promise[Unit],
    signalNotReady: () => Unit,
    signalReady: () => Unit
  ): LightshipType = {
    val __obj = js.Dynamic.literal(isServerReady = js.Any.fromFunction0(isServerReady), isServerShuttingDown = js.Any.fromFunction0(isServerShuttingDown), registerShutdownHandler = js.Any.fromFunction1(registerShutdownHandler), shutdown = js.Any.fromFunction0(shutdown), signalNotReady = js.Any.fromFunction0(signalNotReady), signalReady = js.Any.fromFunction0(signalReady))
  
    __obj.asInstanceOf[LightshipType]
  }
}

