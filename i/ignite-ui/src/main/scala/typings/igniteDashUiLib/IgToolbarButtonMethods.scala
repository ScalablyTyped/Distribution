package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgToolbarButtonMethods extends js.Object {
  /**
  	 * Activate toolbar button
  	 *
  	 * @param event
  	 */
  def activate(event: js.Object): scala.Unit
  /**
  	 * Deactivate toolbar button
  	 *
  	 * @param event
  	 */
  def deactivate(event: js.Object): scala.Unit
  /**
  	 * Destroy the widget.
  	 */
  def destroy(): scala.Unit
  /**
  	 * Toggle toolbar button
  	 */
  def toggle(): scala.Unit
  /**
  	 * Returns the element that represents this widget.
  	 */
  def widget(): js.Object
}

object IgToolbarButtonMethods {
  @scala.inline
  def apply(
    activate: js.Function1[js.Object, scala.Unit],
    deactivate: js.Function1[js.Object, scala.Unit],
    destroy: js.Function0[scala.Unit],
    toggle: js.Function0[scala.Unit],
    widget: js.Function0[js.Object]
  ): IgToolbarButtonMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activate")(activate)
    __obj.updateDynamic("deactivate")(deactivate)
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("toggle")(toggle)
    __obj.updateDynamic("widget")(widget)
    __obj.asInstanceOf[IgToolbarButtonMethods]
  }
}

