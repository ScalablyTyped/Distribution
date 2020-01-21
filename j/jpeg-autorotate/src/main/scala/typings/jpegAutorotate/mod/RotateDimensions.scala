package typings.jpegAutorotate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RotateDimensions extends js.Object {
  var height: Double
  var width: Double
}

object RotateDimensions {
  @scala.inline
  def apply(height: Double, width: Double): RotateDimensions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RotateDimensions]
  }
}

