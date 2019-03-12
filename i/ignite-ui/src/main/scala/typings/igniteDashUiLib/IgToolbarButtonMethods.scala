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
    activate: js.Object => scala.Unit,
    deactivate: js.Object => scala.Unit,
    destroy: () => scala.Unit,
    toggle: () => scala.Unit,
    widget: () => js.Object
  ): IgToolbarButtonMethods = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), deactivate = js.Any.fromFunction1(deactivate), destroy = js.Any.fromFunction0(destroy), toggle = js.Any.fromFunction0(toggle), widget = js.Any.fromFunction0(widget))
  
    __obj.asInstanceOf[IgToolbarButtonMethods]
  }
}

