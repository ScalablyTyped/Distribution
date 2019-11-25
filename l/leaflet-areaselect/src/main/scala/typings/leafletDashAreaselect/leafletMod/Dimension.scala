package typings.leafletDashAreaselect.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension extends js.Object {
  var height: Double
  var width: Double
}

object Dimension {
  @scala.inline
  def apply(height: Double, width: Double): Dimension = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Dimension]
  }
}

