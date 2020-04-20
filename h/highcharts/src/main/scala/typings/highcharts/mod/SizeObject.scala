package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeObject extends js.Object {
  var height: Double
  var width: Double
}

object SizeObject {
  @scala.inline
  def apply(height: Double, width: Double): SizeObject = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeObject]
  }
}

