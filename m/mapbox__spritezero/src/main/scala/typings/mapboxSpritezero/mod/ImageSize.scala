package typings.mapboxSpritezero.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageSize extends js.Object {
  var height: Double
  var width: Double
}

object ImageSize {
  @scala.inline
  def apply(height: Double, width: Double): ImageSize = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSize]
  }
}

