package typings.jimp.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontChar extends js.Object {
  var chnl: Double
  var height: Double
  var id: Double
  var page: Double
  var width: Double
  var x: Double
  var xadvance: Double
  var xoffset: Double
  var y: Double
  var yoffset: Double
}

object FontChar {
  @scala.inline
  def apply(
    chnl: Double,
    height: Double,
    id: Double,
    page: Double,
    width: Double,
    x: Double,
    xadvance: Double,
    xoffset: Double,
    y: Double,
    yoffset: Double
  ): FontChar = {
    val __obj = js.Dynamic.literal(chnl = chnl, height = height, id = id, page = page, width = width, x = x, xadvance = xadvance, xoffset = xoffset, y = y, yoffset = yoffset)
  
    __obj.asInstanceOf[FontChar]
  }
}

