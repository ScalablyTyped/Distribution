package typings.mapboxSpritezero.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageItem extends ImageSize {
  var buffer: String
  var x: Double
  var y: Double
}

object ImageItem {
  @scala.inline
  def apply(buffer: String, height: Double, width: Double, x: Double, y: Double): ImageItem = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageItem]
  }
}

