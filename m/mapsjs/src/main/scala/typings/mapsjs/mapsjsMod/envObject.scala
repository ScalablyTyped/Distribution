package typings.mapsjs.mapsjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait envObject extends js.Object {
  /**
  	 * @returns {number} maxX coord as integer
  	 */
  var maxX: Double
  /**
  	 * @returns {number} maxY coord as integer
  	 */
  var maxY: Double
  /**
  	 * @returns {number} minX as integer
  	 */
  var minX: Double
  /**
  	 * @returns {number} minY coord as integer
  	 */
  var minY: Double
}

object envObject {
  @scala.inline
  def apply(maxX: Double, maxY: Double, minX: Double, minY: Double): envObject = {
    val __obj = js.Dynamic.literal(maxX = maxX, maxY = maxY, minX = minX, minY = minY)
  
    __obj.asInstanceOf[envObject]
  }
}

