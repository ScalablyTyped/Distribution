package typings.igniteUi

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
  def setColor(color: String): js.Object
  /**
  	 * Switch to given igToolbar button.
  	 *
  	 * @param button . The button jQuery element.
  	 */
  def switchToButton(button: js.Object): Unit
  /**
  	 * Toggle widget state between collapsed and expanded.
  	 *
  	 * @param e The igSplitButton to be expanded/collapsed.
  	 */
  def toggle(e: js.Object): js.Object
  def widget(): Unit
}

object IgColorPickerSplitButtonMethods {
  @scala.inline
  def apply(
    collapse: js.Object => js.Object,
    destroy: () => js.Object,
    expand: js.Object => js.Object,
    setColor: String => js.Object,
    switchToButton: js.Object => Unit,
    toggle: js.Object => js.Object,
    widget: () => Unit
  ): IgColorPickerSplitButtonMethods = {
    val __obj = js.Dynamic.literal(collapse = js.Any.fromFunction1(collapse), destroy = js.Any.fromFunction0(destroy), expand = js.Any.fromFunction1(expand), setColor = js.Any.fromFunction1(setColor), switchToButton = js.Any.fromFunction1(switchToButton), toggle = js.Any.fromFunction1(toggle), widget = js.Any.fromFunction0(widget))
    __obj.asInstanceOf[IgColorPickerSplitButtonMethods]
  }
}

