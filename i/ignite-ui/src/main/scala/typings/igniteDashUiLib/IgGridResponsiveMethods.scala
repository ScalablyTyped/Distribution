package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridResponsiveMethods extends js.Object {
  /**
  	 * Destroys the responsive widget.
  	 */
  def destroy(): scala.Unit
  /**
  	 * Returns the currently active responsive mode.
  	 */
  def getCurrentResponsiveMode(): scala.Unit
}

object IgGridResponsiveMethods {
  @scala.inline
  def apply(destroy: js.Function0[scala.Unit], getCurrentResponsiveMode: js.Function0[scala.Unit]): IgGridResponsiveMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("getCurrentResponsiveMode")(getCurrentResponsiveMode)
    __obj.asInstanceOf[IgGridResponsiveMethods]
  }
}

