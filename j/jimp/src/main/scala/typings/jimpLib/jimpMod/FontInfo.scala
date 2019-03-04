package typings
package jimpLib.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontInfo extends js.Object {
  var aa: scala.Double
  var bold: scala.Double
  var charset: java.lang.String
  var face: java.lang.String
  var italic: scala.Double
  var padding: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  var size: scala.Double
  var smooth: scala.Double
  var spacing: js.Tuple2[scala.Double, scala.Double]
  var stretchH: scala.Double
  var unicode: scala.Double
}

object FontInfo {
  @scala.inline
  def apply(
    aa: scala.Double,
    bold: scala.Double,
    charset: java.lang.String,
    face: java.lang.String,
    italic: scala.Double,
    padding: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    size: scala.Double,
    smooth: scala.Double,
    spacing: js.Tuple2[scala.Double, scala.Double],
    stretchH: scala.Double,
    unicode: scala.Double
  ): FontInfo = {
    val __obj = js.Dynamic.literal(aa = aa, bold = bold, charset = charset, face = face, italic = italic, padding = padding, size = size, smooth = smooth, spacing = spacing, stretchH = stretchH, unicode = unicode)
  
    __obj.asInstanceOf[FontInfo]
  }
}

