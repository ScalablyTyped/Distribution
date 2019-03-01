package typings
package mapsjsLib.mapsjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait envObject extends js.Object {
  /**
  	 * @returns {number} maxX coord as integer
  	 */
  var maxX: scala.Double
  /**
  	 * @returns {number} maxY coord as integer
  	 */
  var maxY: scala.Double
  /**
  	 * @returns {number} minX as integer
  	 */
  var minX: scala.Double
  /**
  	 * @returns {number} minY coord as integer
  	 */
  var minY: scala.Double
}

object envObject {
  @scala.inline
  def apply(maxX: scala.Double, maxY: scala.Double, minX: scala.Double, minY: scala.Double): envObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maxX")(maxX)
    __obj.updateDynamic("maxY")(maxY)
    __obj.updateDynamic("minX")(minX)
    __obj.updateDynamic("minY")(minY)
    __obj.asInstanceOf[envObject]
  }
}

