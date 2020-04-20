package typings.mapboxSpritezero.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImgLayout extends js.Object {
  var height: Double
  var items: js.Array[ImageItem]
  var width: Double
}

object ImgLayout {
  @scala.inline
  def apply(height: Double, items: js.Array[ImageItem], width: Double): ImgLayout = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImgLayout]
  }
}

