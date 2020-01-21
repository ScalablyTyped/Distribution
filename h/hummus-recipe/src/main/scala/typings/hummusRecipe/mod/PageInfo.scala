package typings.hummusRecipe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageInfo extends js.Object {
  var height: Double
  var layout: String
  var mediaBox: js.Array[Double]
  var offsetX: Double
  var offsetY: Double
  var pageNumber: Double
  var rotate: Double
  var size: js.Array[Double]
  var width: Double
}

object PageInfo {
  @scala.inline
  def apply(
    height: Double,
    layout: String,
    mediaBox: js.Array[Double],
    offsetX: Double,
    offsetY: Double,
    pageNumber: Double,
    rotate: Double,
    size: js.Array[Double],
    width: Double
  ): PageInfo = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], mediaBox = mediaBox.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageNumber = pageNumber.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PageInfo]
  }
}

