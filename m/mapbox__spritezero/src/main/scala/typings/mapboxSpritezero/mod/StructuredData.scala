package typings.mapboxSpritezero.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructuredData extends js.Object {
  var height: Double
  var pixelRatio: Double
  var width: Double
  var x: Double
  var y: Double
}

object StructuredData {
  @scala.inline
  def apply(height: Double, pixelRatio: Double, width: Double, x: Double, y: Double): StructuredData = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], pixelRatio = pixelRatio.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructuredData]
  }
}

