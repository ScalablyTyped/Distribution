package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgColorPickerMethods extends js.Object {
  /**
  	 * Gets the color for an element from the color picker in RGB format.
  	 *
  	 * @param $element A jQuery element in the color picker from which the color will be retrieved.
  	 */
  def colorFromElement($element: js.Object): java.lang.String
  /**
  	 * Gets a reference to the div element of the color table
  	 */
  def colorTable(): js.Object
  /**
  	 * Gets a reference to the div element with the default or custom colors table.
  	 */
  def customColorTable(): js.Object
  /**
  	 * Select a color.
  	 *
  	 * @param color The #RGB value of the color to be selected.
  	 */
  def selectColor(color: java.lang.String): js.Object
  /**
  	 * Returns the hexademical string of the currently selected color in the color picker. Returns null if no color is selected.
  	 * @return string|null Returns the selected color if available. Null if no color is selected.
  	 */
  def selectedColor(): java.lang.String
  /**
  	 * Returns the div element with the standard color table.
  	 */
  def standardColorsTable(): js.Object
}

object IgColorPickerMethods {
  @scala.inline
  def apply(
    colorFromElement: js.Function1[js.Object, java.lang.String],
    colorTable: js.Function0[js.Object],
    customColorTable: js.Function0[js.Object],
    selectColor: js.Function1[java.lang.String, js.Object],
    selectedColor: js.Function0[java.lang.String],
    standardColorsTable: js.Function0[js.Object]
  ): IgColorPickerMethods = {
    val __obj = js.Dynamic.literal(colorFromElement = colorFromElement, colorTable = colorTable, customColorTable = customColorTable, selectColor = selectColor, selectedColor = selectedColor, standardColorsTable = standardColorsTable)
  
    __obj.asInstanceOf[IgColorPickerMethods]
  }
}

