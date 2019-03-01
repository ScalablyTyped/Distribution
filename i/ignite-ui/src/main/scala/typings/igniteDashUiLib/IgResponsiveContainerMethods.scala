package typings
package igniteDashUiLib

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
  def addCallback(callback: js.Function, owner: js.Object, reactionStep: scala.Double, reactionDirection: js.Object): scala.Unit
  /**
  	 * Destroys the ResponsiveContainer widget
  	 */
  def destroy(): scala.Unit
  /**
  	 * Removes a callback from the callbacks collection.
  	 *
  	 * @param callbackId The callback id to remove.
  	 */
  def removeCallback(callbackId: scala.Double): scala.Unit
  /**
  	 * Starts the automatic size check procedure
  	 */
  def startPoller(): scala.Unit
  /**
  	 * Stops the automatic size check procedure
  	 */
  def stopPoller(): scala.Unit
}

object IgResponsiveContainerMethods {
  @scala.inline
  def apply(
    addCallback: js.Function4[js.Function, js.Object, scala.Double, js.Object, scala.Unit],
    destroy: js.Function0[scala.Unit],
    removeCallback: js.Function1[scala.Double, scala.Unit],
    startPoller: js.Function0[scala.Unit],
    stopPoller: js.Function0[scala.Unit]
  ): IgResponsiveContainerMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addCallback")(addCallback)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("removeCallback")(removeCallback)
    __obj.updateDynamic("startPoller")(startPoller)
    __obj.updateDynamic("stopPoller")(stopPoller)
    __obj.asInstanceOf[IgResponsiveContainerMethods]
  }
}

