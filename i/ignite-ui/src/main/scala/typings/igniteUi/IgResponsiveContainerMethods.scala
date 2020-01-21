package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgResponsiveContainerMethods extends js.Object {
  /**
  	 * Adds a callback to the callback collection.
  	 *
  	 * @param callback The function to call when requirements are met.
  	 * @param owner The owner object of the function.
  	 * @param reactionStep The sensitivity of the size change recognition.
  	 * @param reactionDirection The dimensions the changes of which to be traced.
  	 */
  def addCallback(callback: js.Function, owner: js.Object, reactionStep: Double, reactionDirection: js.Object): Unit
  /**
  	 * Destroys the ResponsiveContainer widget
  	 */
  def destroy(): Unit
  /**
  	 * Removes a callback from the callbacks collection.
  	 *
  	 * @param callbackId The callback id to remove.
  	 */
  def removeCallback(callbackId: Double): Unit
  /**
  	 * Starts the automatic size check procedure
  	 */
  def startPoller(): Unit
  /**
  	 * Stops the automatic size check procedure
  	 */
  def stopPoller(): Unit
}

object IgResponsiveContainerMethods {
  @scala.inline
  def apply(
    addCallback: (js.Function, js.Object, Double, js.Object) => Unit,
    destroy: () => Unit,
    removeCallback: Double => Unit,
    startPoller: () => Unit,
    stopPoller: () => Unit
  ): IgResponsiveContainerMethods = {
    val __obj = js.Dynamic.literal(addCallback = js.Any.fromFunction4(addCallback), destroy = js.Any.fromFunction0(destroy), removeCallback = js.Any.fromFunction1(removeCallback), startPoller = js.Any.fromFunction0(startPoller), stopPoller = js.Any.fromFunction0(stopPoller))
  
    __obj.asInstanceOf[IgResponsiveContainerMethods]
  }
}

