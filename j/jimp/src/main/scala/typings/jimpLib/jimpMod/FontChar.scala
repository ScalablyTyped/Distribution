package typings
package jimpLib.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontChar extends js.Object {
  var chnl: scala.Double
  var height: scala.Double
  var id: scala.Double
  var page: scala.Double
  var width: scala.Double
  var x: scala.Double
  var xadvance: scala.Double
  var xoffset: scala.Double
  var y: scala.Double
  var yoffset: scala.Double
}

object FontChar {
  @scala.inline
  def apply(
    chnl: scala.Double,
    height: scala.Double,
    id: scala.Double,
    page: scala.Double,
    width: scala.Double,
    x: scala.Double,
    xadvance: scala.Double,
    xoffset: scala.Double,
    y: scala.Double,
    yoffset: scala.Double
  ): FontChar = {
    val __obj = js.Dynamic.literal(chnl = chnl, height = height, id = id, page = page, width = width, x = x, xadvance = xadvance, xoffset = xoffset, y = y, yoffset = yoffset)
  
    __obj.asInstanceOf[FontChar]
  }
}

