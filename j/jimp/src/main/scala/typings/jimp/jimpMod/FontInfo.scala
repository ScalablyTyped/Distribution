package typings.jimp.jimpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontInfo extends js.Object {
  var aa: Double
  var bold: Double
  var charset: String
  var face: String
  var italic: Double
  var padding: js.Tuple4[Double, Double, Double, Double]
  var size: Double
  var smooth: Double
  var spacing: js.Tuple2[Double, Double]
  var stretchH: Double
  var unicode: Double
}

object FontInfo {
  @scala.inline
  def apply(
    aa: Double,
    bold: Double,
    charset: String,
    face: String,
    italic: Double,
    padding: js.Tuple4[Double, Double, Double, Double],
    size: Double,
    smooth: Double,
    spacing: js.Tuple2[Double, Double],
    stretchH: Double,
    unicode: Double
  ): FontInfo = {
    val __obj = js.Dynamic.literal(aa = aa.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], charset = charset.asInstanceOf[js.Any], face = face.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], smooth = smooth.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], stretchH = stretchH.asInstanceOf[js.Any], unicode = unicode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FontInfo]
  }
}

