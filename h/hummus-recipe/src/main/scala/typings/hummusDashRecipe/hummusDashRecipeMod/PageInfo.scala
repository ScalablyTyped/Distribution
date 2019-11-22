package typings.hummusDashRecipe.hummusDashRecipeMod

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
    val __obj = js.Dynamic.literal(height = height, layout = layout, mediaBox = mediaBox, offsetX = offsetX, offsetY = offsetY, pageNumber = pageNumber, rotate = rotate, size = size, width = width)
  
    __obj.asInstanceOf[PageInfo]
  }
}

