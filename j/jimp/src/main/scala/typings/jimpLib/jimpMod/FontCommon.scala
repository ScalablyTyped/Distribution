package typings
package jimpLib.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontCommon extends js.Object {
  var alphaChnl: scala.Double
  var base: scala.Double
  var blueChnl: scala.Double
  var greenChnl: scala.Double
  var lineHeight: scala.Double
  var packed: scala.Double
  var pages: scala.Double
  var redChnl: scala.Double
  var scaleH: scala.Double
  var scaleW: scala.Double
}

object FontCommon {
  @scala.inline
  def apply(
    alphaChnl: scala.Double,
    base: scala.Double,
    blueChnl: scala.Double,
    greenChnl: scala.Double,
    lineHeight: scala.Double,
    packed: scala.Double,
    pages: scala.Double,
    redChnl: scala.Double,
    scaleH: scala.Double,
    scaleW: scala.Double
  ): FontCommon = {
    val __obj = js.Dynamic.literal(alphaChnl = alphaChnl, base = base, blueChnl = blueChnl, greenChnl = greenChnl, lineHeight = lineHeight, packed = packed, pages = pages, redChnl = redChnl, scaleH = scaleH, scaleW = scaleW)
  
    __obj.asInstanceOf[FontCommon]
  }
}

