package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgColorPickerSplitButtonMethods extends js.Object {
  /**
  	 * Collapse the widget.
  	 *
  	 * @param e
  	 */
  def collapse(e: js.Object): js.Object
  /**
  	 * Destroys the widget.
  	 */
  def destroy(): js.Object
  /**
  	 * Expands the widget.
  	 *
  	 * @param e
  	 */
  def expand(e: js.Object): js.Object
  /**
  	 * Sets the color of the split button
  	 *
  	 * @param color The color value to be set.
  	 */
  def setColor(color: java.lang.String): js.Object
  /**
  	 * Switch to given igToolbar button.
  	 *
  	 * @param button . The button jQuery element.
  	 */
  def switchToButton(button: js.Object): scala.Unit
  /**
  	 * Toggle widget state between collapsed and expanded.
  	 *
  	 * @param e The igSplitButton to be expanded/collapsed.
  	 */
  def toggle(e: js.Object): js.Object
  def widget(): scala.Unit
}

object IgColorPickerSplitButtonMethods {
  @scala.inline
  def apply(
    collapse: js.Function1[js.Object, js.Object],
    destroy: js.Function0[js.Object],
    expand: js.Function1[js.Object, js.Object],
    setColor: js.Function1[java.lang.String, js.Object],
    switchToButton: js.Function1[js.Object, scala.Unit],
    toggle: js.Function1[js.Object, js.Object],
    widget: js.Function0[scala.Unit]
  ): IgColorPickerSplitButtonMethods = {
    val __obj = js.Dynamic.literal(collapse = collapse, destroy = destroy, expand = expand, setColor = setColor, switchToButton = switchToButton, toggle = toggle, widget = widget)
  
    __obj.asInstanceOf[IgColorPickerSplitButtonMethods]
  }
}

