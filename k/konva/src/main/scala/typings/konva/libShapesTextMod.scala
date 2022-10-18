package typings.konva

import typings.konva.anon.HeightNumber
import typings.konva.anon.LastInParagraph
import typings.konva.libShapeMod.Shape
import typings.konva.libShapeMod.ShapeConfig
import typings.konva.libTypesMod.GetSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShapesTextMod {
  
  @JSImport("konva/lib/shapes/Text", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("konva/lib/shapes/Text", "Text")
  @js.native
  open class Text () extends Shape[TextConfig] {
    def this(config: TextConfig) = this()
    
    def _addTextLine(line: Any): Double = js.native
    
    def _getContextFont(): String = js.native
    
    def _getTextWidth(text: Any): Any = js.native
    
    def _hitFunc(context: Any): Unit = js.native
    
    var _partialText: String = js.native
    
    var _partialTextX: Double = js.native
    
    var _partialTextY: Double = js.native
    
    def _sceneFunc(context: Any): Unit = js.native
    
    def _setTextData(): Unit = js.native
    
    def _shouldHandleEllipsis(currentHeightPx: Double): Boolean = js.native
    
    def _tryToAddEllipsisToLastLine(): Unit = js.native
    
    def align(): String = js.native
    def align(v: String): this.type = js.native
    @JSName("align")
    var align_Original: GetSet[String, this.type] = js.native
    
    def ellipsis(): Boolean = js.native
    def ellipsis(v: Boolean): this.type = js.native
    @JSName("ellipsis")
    var ellipsis_Original: GetSet[Boolean, this.type] = js.native
    
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
    
    def getHeight(): Any = js.native
    
    def getStrokeScaleEnabled(): Boolean = js.native
    
    def getTextHeight(): Double = js.native
    
    def getTextWidth(): Double = js.native
    
    def getWidth(): Any = js.native
    
    def letterSpacing(): Double = js.native
    def letterSpacing(v: Double): this.type = js.native
    @JSName("letterSpacing")
    var letterSpacing_Original: GetSet[Double, this.type] = js.native
    
    def lineHeight(): Double = js.native
    def lineHeight(v: Double): this.type = js.native
    @JSName("lineHeight")
    var lineHeight_Original: GetSet[Double, this.type] = js.native
    
    def measureSize(text: Any): HeightNumber = js.native
    
    def padding(): Double = js.native
    def padding(v: Double): this.type = js.native
    @JSName("padding")
    var padding_Original: GetSet[Double, this.type] = js.native
    
    def setText(text: Any): this.type = js.native
    
    def text(): String = js.native
    def text(v: String): this.type = js.native
    
    var textArr: js.Array[LastInParagraph] = js.native
    
    def textDecoration(): String = js.native
    def textDecoration(v: String): this.type = js.native
    @JSName("textDecoration")
    var textDecoration_Original: GetSet[String, this.type] = js.native
    
    var textHeight: Double = js.native
    
    var textWidth: Double = js.native
    
    @JSName("text")
    var text_Original: GetSet[String, this.type] = js.native
    
    def verticalAlign(): String = js.native
    def verticalAlign(v: String): this.type = js.native
    @JSName("verticalAlign")
    var verticalAlign_Original: GetSet[String, this.type] = js.native
    
    def wrap(): String = js.native
    def wrap(v: String): this.type = js.native
    @JSName("wrap")
    var wrap_Original: GetSet[String, this.type] = js.native
  }
  
  inline def stringToArray(string: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToArray")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  trait TextConfig
    extends StObject
       with ShapeConfig {
    
    var align: js.UndefOr[String] = js.undefined
    
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[Double] = js.undefined
    
    var fontStyle: js.UndefOr[String] = js.undefined
    
    var fontVariant: js.UndefOr[String] = js.undefined
    
    var letterSpacing: js.UndefOr[Double] = js.undefined
    
    var lineHeight: js.UndefOr[Double] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
    
    var textDecoration: js.UndefOr[String] = js.undefined
    
    var verticalAlign: js.UndefOr[String] = js.undefined
    
    var wrap: js.UndefOr[String] = js.undefined
  }
  object TextConfig {
    
    inline def apply(): TextConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextConfig]
    }
    
    extension [Self <: TextConfig](x: Self) {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVerticalAlign(value: String): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
      
      inline def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
}
