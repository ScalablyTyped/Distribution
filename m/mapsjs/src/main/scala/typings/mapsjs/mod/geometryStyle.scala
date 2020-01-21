package typings.mapsjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mapsjs", "geometryStyle")
@js.native
class geometryStyle () extends js.Object {
  def this(options: styleObj) = this()
  /**
  	 * Gets the dash array as a string.
  	 * @returns {string} Dash array as astring.
  	 */
  def getDashArray(): String = js.native
  /**
  	 * Gets fill color as a CSS style string.
  	 * @returns {string} Fill color as a CSS style string.
  	 */
  def getFillColor(): String = js.native
  /**
  	 * Gets fill opacity in decimal format.
  	 * @returns {number} Fill opacity.
  	 */
  def getFillOpacity(): Double = js.native
  /**
  	 * Gets path outline color as a CSS style string.
  	 * @returns {string} Outline color as a CSS style string.
  	 */
  def getOutlineColor(): String = js.native
  /**
  	 * Gets path outline opacity in decimal format.
  	 * @returns {number} Outline opacity.
  	 */
  def getOutlineOpacity(): Double = js.native
  /**
  	 * Gets path outline thickness in pixels.
  	 * @returns {number} Thickness of path outline.
  	 */
  def getOutlineThicknessPix(): Double = js.native
  /**
  	 * Sets dash array string from a CSS style string. Defaults to solid
  	 * stroke if no dash array string is provided.
  	 * @param {string} [da] Dash array as a CSS style string.
  	 */
  def setDashArray(da: String): Unit = js.native
  /**
  	 * Sets fill color as a CSS style string.
  	 * @param {string} c Fill color as a CSS style string.
  	 */
  def setFillColor(c: String): Unit = js.native
  /**
  	 * Sets fill opacity to a decimal between 0 and 1.
  	 * @param {number} o Fill opacity.
  	 */
  def setFillOpacity(o: Double): Unit = js.native
  /**
  	 * Sets path outline color from a CSS style string.
  	 * @param {string} c Outline color as a CSS style string.
  	 */
  def setOutlineColor(c: String): Unit = js.native
  /**
  	 * Set path outline opacity to a decimal between 0 and 1.
  	 * @param {number} o Outline opacity.
  	 */
  def setOutlineOpacity(o: Double): Unit = js.native
  /**
  	 * Sets path outline thickness in pixels.
  	 * @param {number} t Desired thickness.
  	 */
  def setOutlineThicknessPix(t: Double): Unit = js.native
}

