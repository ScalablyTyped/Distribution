package typings.jimpPluginPrint

import org.scalablytyped.runtime.StringDictionary
import typings.jimpCore.etcMod.ImageCallback
import typings.jimpPluginPrint.anon.AlignmentX
import typings.jimpPluginPrint.anon.FONTSANS10BLACK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/plugin-print", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Print = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Print]
  
  trait Font extends StObject {
    
    var chars: StringDictionary[FontChar]
    
    var common: FontCommon
    
    var info: FontInfo
    
    var kernings: StringDictionary[StringDictionary[Double]]
    
    var pages: js.Array[String]
  }
  object Font {
    
    inline def apply(
      chars: StringDictionary[FontChar],
      common: FontCommon,
      info: FontInfo,
      kernings: StringDictionary[StringDictionary[Double]],
      pages: js.Array[String]
    ): Font = {
      val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], common = common.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], kernings = kernings.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Font]
    }
    
    extension [Self <: Font](x: Self) {
      
      inline def setChars(value: StringDictionary[FontChar]): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      inline def setCommon(value: FontCommon): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: FontInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setKernings(value: StringDictionary[StringDictionary[Double]]): Self = StObject.set(x, "kernings", value.asInstanceOf[js.Any])
      
      inline def setPages(value: js.Array[String]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setPagesVarargs(value: String*): Self = StObject.set(x, "pages", js.Array(value :_*))
    }
  }
  
  trait FontChar extends StObject {
    
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
    
    inline def apply(
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
      val __obj = js.Dynamic.literal(chnl = chnl.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xadvance = xadvance.asInstanceOf[js.Any], xoffset = xoffset.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yoffset = yoffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontChar]
    }
    
    extension [Self <: FontChar](x: Self) {
      
      inline def setChnl(value: Double): Self = StObject.set(x, "chnl", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXadvance(value: Double): Self = StObject.set(x, "xadvance", value.asInstanceOf[js.Any])
      
      inline def setXoffset(value: Double): Self = StObject.set(x, "xoffset", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYoffset(value: Double): Self = StObject.set(x, "yoffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait FontCommon extends StObject {
    
    var alphaChnl: Double
    
    var base: Double
    
    var blueChnl: Double
    
    var greenChnl: Double
    
    var lineHeight: Double
    
    var packed: Double
    
    var pages: Double
    
    var redChnl: Double
    
    var scaleH: Double
    
    var scaleW: Double
  }
  object FontCommon {
    
    inline def apply(
      alphaChnl: Double,
      base: Double,
      blueChnl: Double,
      greenChnl: Double,
      lineHeight: Double,
      packed: Double,
      pages: Double,
      redChnl: Double,
      scaleH: Double,
      scaleW: Double
    ): FontCommon = {
      val __obj = js.Dynamic.literal(alphaChnl = alphaChnl.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], blueChnl = blueChnl.asInstanceOf[js.Any], greenChnl = greenChnl.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], packed = packed.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], redChnl = redChnl.asInstanceOf[js.Any], scaleH = scaleH.asInstanceOf[js.Any], scaleW = scaleW.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontCommon]
    }
    
    extension [Self <: FontCommon](x: Self) {
      
      inline def setAlphaChnl(value: Double): Self = StObject.set(x, "alphaChnl", value.asInstanceOf[js.Any])
      
      inline def setBase(value: Double): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBlueChnl(value: Double): Self = StObject.set(x, "blueChnl", value.asInstanceOf[js.Any])
      
      inline def setGreenChnl(value: Double): Self = StObject.set(x, "greenChnl", value.asInstanceOf[js.Any])
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setPacked(value: Double): Self = StObject.set(x, "packed", value.asInstanceOf[js.Any])
      
      inline def setPages(value: Double): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
      
      inline def setRedChnl(value: Double): Self = StObject.set(x, "redChnl", value.asInstanceOf[js.Any])
      
      inline def setScaleH(value: Double): Self = StObject.set(x, "scaleH", value.asInstanceOf[js.Any])
      
      inline def setScaleW(value: Double): Self = StObject.set(x, "scaleW", value.asInstanceOf[js.Any])
    }
  }
  
  trait FontInfo extends StObject {
    
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
    
    inline def apply(
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
    
    extension [Self <: FontInfo](x: Self) {
      
      inline def setAa(value: Double): Self = StObject.set(x, "aa", value.asInstanceOf[js.Any])
      
      inline def setBold(value: Double): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
      
      inline def setFace(value: String): Self = StObject.set(x, "face", value.asInstanceOf[js.Any])
      
      inline def setItalic(value: Double): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      inline def setPadding(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSmooth(value: Double): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      inline def setSpacing(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setStretchH(value: Double): Self = StObject.set(x, "stretchH", value.asInstanceOf[js.Any])
      
      inline def setUnicode(value: Double): Self = StObject.set(x, "unicode", value.asInstanceOf[js.Any])
    }
  }
  
  trait Print extends StObject {
    
    var `class`: PrintClass
    
    var constants: FONTSANS10BLACK
  }
  object Print {
    
    inline def apply(`class`: PrintClass, constants: FONTSANS10BLACK): Print = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Print]
    }
    
    extension [Self <: Print](x: Self) {
      
      inline def setClass(value: PrintClass): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setConstants(value: FONTSANS10BLACK): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PrintClass extends StObject {
    
    // Text methods
    def print(font: Font, x: Double, y: Double, text: PrintableText): this.type = js.native
    def print(font: Font, x: Double, y: Double, text: PrintableText, cb: ImageCallback[this.type]): this.type = js.native
    def print(font: Font, x: Double, y: Double, text: PrintableText, maxWidth: Double): this.type = js.native
    def print(
      font: Font,
      x: Double,
      y: Double,
      text: PrintableText,
      maxWidth: Double,
      cb: ImageCallback[this.type]
    ): this.type = js.native
    def print(font: Font, x: Double, y: Double, text: PrintableText, maxWidth: Double, maxHeight: Double): this.type = js.native
    def print(
      font: Font,
      x: Double,
      y: Double,
      text: PrintableText,
      maxWidth: Double,
      maxHeight: Double,
      cb: ImageCallback[this.type]
    ): this.type = js.native
    def print(
      font: Font,
      x: Double,
      y: Double,
      text: PrintableText,
      maxWidth: Double,
      maxHeight: Unit,
      cb: ImageCallback[this.type]
    ): this.type = js.native
    def print(
      font: Font,
      x: Double,
      y: Double,
      text: PrintableText,
      maxWidth: Unit,
      cb: ImageCallback[this.type]
    ): this.type = js.native
    def print(font: Font, x: Double, y: Double, text: PrintableText, maxWidth: Unit, maxHeight: Double): this.type = js.native
    def print(
      font: Font,
      x: Double,
      y: Double,
      text: PrintableText,
      maxWidth: Unit,
      maxHeight: Double,
      cb: ImageCallback[this.type]
    ): this.type = js.native
    def print(
      font: Font,
      x: Double,
      y: Double,
      text: PrintableText,
      maxWidth: Unit,
      maxHeight: Unit,
      cb: ImageCallback[this.type]
    ): this.type = js.native
  }
  
  type PrintableText = js.Any | AlignmentX
}
