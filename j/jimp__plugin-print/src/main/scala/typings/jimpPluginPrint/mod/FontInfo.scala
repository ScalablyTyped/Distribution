package typings.jimpPluginPrint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontInfo extends js.Object {
  
  var aa: Double = js.native
  
  var bold: Double = js.native
  
  var charset: String = js.native
  
  var face: String = js.native
  
  var italic: Double = js.native
  
  var padding: js.Tuple4[Double, Double, Double, Double] = js.native
  
  var size: Double = js.native
  
  var smooth: Double = js.native
  
  var spacing: js.Tuple2[Double, Double] = js.native
  
  var stretchH: Double = js.native
  
  var unicode: Double = js.native
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
  
  @scala.inline
  implicit class FontInfoOps[Self <: FontInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAa(value: Double): Self = this.set("aa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBold(value: Double): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharset(value: String): Self = this.set("charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFace(value: String): Self = this.set("face", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalic(value: Double): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: js.Tuple4[Double, Double, Double, Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmooth(value: Double): Self = this.set("smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacing(value: js.Tuple2[Double, Double]): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStretchH(value: Double): Self = this.set("stretchH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicode(value: Double): Self = this.set("unicode", value.asInstanceOf[js.Any])
  }
}
