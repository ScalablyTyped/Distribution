package typings.konva

import typings.konva.anon.HeightWidth
import typings.konva.anon.P0
import typings.konva.libContextMod.Context
import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libTypesMod.GetSet
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesTextPathMod {
  
  @JSImport("konva/lib/shapes/TextPath", "TextPath")
  @js.native
  open class TextPath () extends Shape[TextPathConfig] {
    def this(config: TextPathConfig) = this()
    
    def _getContextFont(): Any = js.native
    
    def _getPointAtLength(length: Double): Any = js.native
    
    def _getTextPathLength(): Double = js.native
    
    def _getTextSize(text: String): HeightWidth = js.native
    
    def _hitFunc(context: Context): Unit = js.native
    
    def _readDataAttribute(): Unit = js.native
    
    def _sceneFunc(context: Context): Unit = js.native
    
    def _setTextData(): Any = js.native
    
    def align(): String = js.native
    def align(v: String): this.type = js.native
    @JSName("align")
    var align_Original: GetSet[String, this.type] = js.native
    
    def data(): String = js.native
    def data(v: String): this.type = js.native
    
    var dataArray: js.Array[Any] = js.native
    
    @JSName("data")
    var data_Original: GetSet[String, this.type] = js.native
    
    var dummyCanvas: HTMLCanvasElement = js.native
    
    def fontFamily(): String = js.native
    def fontFamily(v: String): this.type = js.native
    @JSName("fontFamily")
    var fontFamily_Original: GetSet[String, this.type] = js.native
    
    def fontSize(): Double = js.native
    def fontSize(v: Double): this.type = js.native
    @JSName("fontSize")
    var fontSize_Original: GetSet[Double, this.type] = js.native
    
    def fontStyle(): String = js.native
    def fontStyle(v: String): this.type = js.native
    @JSName("fontStyle")
    var fontStyle_Original: GetSet[String, this.type] = js.native
    
    def fontVariant(): String = js.native
    def fontVariant(v: String): this.type = js.native
    @JSName("fontVariant")
    var fontVariant_Original: GetSet[String, this.type] = js.native
    
    def getTextHeight(): Double = js.native
    
    def getTextWidth(): Double = js.native
    
    var glyphInfo: js.Array[P0] = js.native
    
    def kerningFunc(): js.Function2[/* leftChar */ String, /* rightChar */ String, Double] = js.native
    def kerningFunc(v: js.Function2[/* leftChar */ String, /* rightChar */ String, Double]): this.type = js.native
    @JSName("kerningFunc")
    var kerningFunc_Original: GetSet[js.Function2[/* leftChar */ String, /* rightChar */ String, Double], this.type] = js.native
    
    def letterSpacing(): Double = js.native
    def letterSpacing(v: Double): this.type = js.native
    @JSName("letterSpacing")
    var letterSpacing_Original: GetSet[Double, this.type] = js.native
    
    var partialText: String = js.native
    
    var pathLength: Double = js.native
    
    def setText(text: String): Any = js.native
    
    def text(): String = js.native
    def text(v: String): this.type = js.native
    
    def textBaseline(): String = js.native
    def textBaseline(v: String): this.type = js.native
    @JSName("textBaseline")
    var textBaseline_Original: GetSet[String, this.type] = js.native
    
    def textDecoration(): String = js.native
    def textDecoration(v: String): this.type = js.native
    @JSName("textDecoration")
    var textDecoration_Original: GetSet[String, this.type] = js.native
    
    var textHeight: Double = js.native
    
    var textWidth: Double = js.native
    
    @JSName("text")
    var text_Original: GetSet[String, this.type] = js.native
  }
  
  trait TextPathConfig
    extends StObject
       with ShapeConfig {
    
    var data: js.UndefOr[String] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var fontStyle: js.UndefOr[String] = js.undefined
    
    var letterSpacing: js.UndefOr[Double] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object TextPathConfig {
    
    inline def apply(): TextPathConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextPathConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextPathConfig] (val x: Self) extends AnyVal {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
