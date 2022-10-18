package typings.html2canvas

import typings.html2canvas.distTypesCoreContextMod.Context
import typings.html2canvas.distTypesCssPropertyDescriptorsBackgroundClipMod.BackgroundClip_
import typings.html2canvas.distTypesCssPropertyDescriptorsBackgroundOriginMod.BackgroundOrigin_
import typings.html2canvas.distTypesCssPropertyDescriptorsBackgroundPositionMod.BackgroundPosition_
import typings.html2canvas.distTypesCssPropertyDescriptorsBackgroundRepeatMod.BackgroundRepeat_
import typings.html2canvas.distTypesCssPropertyDescriptorsBackgroundSizeMod.BackgroundSize_
import typings.html2canvas.distTypesCssPropertyDescriptorsBorderRadiusMod.BorderRadius
import typings.html2canvas.distTypesCssPropertyDescriptorsBorderStyleMod.BORDER_STYLE
import typings.html2canvas.distTypesCssPropertyDescriptorsBoxShadowMod.BoxShadow_
import typings.html2canvas.distTypesCssPropertyDescriptorsContentMod.Content_
import typings.html2canvas.distTypesCssPropertyDescriptorsCounterIncrementMod.CounterIncrement_
import typings.html2canvas.distTypesCssPropertyDescriptorsCounterResetMod.CounterReset_
import typings.html2canvas.distTypesCssPropertyDescriptorsDirectionMod.DIRECTION_
import typings.html2canvas.distTypesCssPropertyDescriptorsDisplayMod.Display_
import typings.html2canvas.distTypesCssPropertyDescriptorsFloatMod.FLOAT_
import typings.html2canvas.distTypesCssPropertyDescriptorsFontFamilyMod.FontFamily_
import typings.html2canvas.distTypesCssPropertyDescriptorsFontStyleMod.FONT_STYLE
import typings.html2canvas.distTypesCssPropertyDescriptorsLineBreakMod.LINE_BREAK
import typings.html2canvas.distTypesCssPropertyDescriptorsListStylePositionMod.LIST_STYLE_POSITION
import typings.html2canvas.distTypesCssPropertyDescriptorsListStyleTypeMod.LIST_STYLE_TYPE
import typings.html2canvas.distTypesCssPropertyDescriptorsOverflowMod.OVERFLOW_
import typings.html2canvas.distTypesCssPropertyDescriptorsOverflowWrapMod.OVERFLOW_WRAP
import typings.html2canvas.distTypesCssPropertyDescriptorsPaintOrderMod.PaintOrder_
import typings.html2canvas.distTypesCssPropertyDescriptorsPositionMod.POSITION_
import typings.html2canvas.distTypesCssPropertyDescriptorsQuotesMod.Quotes_
import typings.html2canvas.distTypesCssPropertyDescriptorsTextAlignMod.TEXT_ALIGN
import typings.html2canvas.distTypesCssPropertyDescriptorsTextDecorationLineMod.TextDecorationLine_
import typings.html2canvas.distTypesCssPropertyDescriptorsTextShadowMod.TextShadow_
import typings.html2canvas.distTypesCssPropertyDescriptorsTextTransformMod.TEXT_TRANSFORM
import typings.html2canvas.distTypesCssPropertyDescriptorsTransformMod.Transform_
import typings.html2canvas.distTypesCssPropertyDescriptorsTransformOriginMod.TransformOrigin_
import typings.html2canvas.distTypesCssPropertyDescriptorsVisibilityMod.VISIBILITY_
import typings.html2canvas.distTypesCssPropertyDescriptorsWordBreakMod.WORD_BREAK
import typings.html2canvas.distTypesCssSyntaxParserMod.CSSValue
import typings.html2canvas.distTypesCssTypesColorMod.Color_
import typings.html2canvas.distTypesCssTypesImageMod.ICSSImage
import typings.html2canvas.distTypesCssTypesLengthPercentageMod.LengthPercentage
import typings.std.CSSStyleDeclaration
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCssMod {
  
  @JSImport("html2canvas/dist/types/css", "CSSParsedCounterDeclaration")
  @js.native
  open class CSSParsedCounterDeclaration protected () extends StObject {
    def this(context: Context, declaration: CSSStyleDeclaration) = this()
    
    var counterIncrement: ReturnType[
        js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], CounterIncrement_]
      ] = js.native
    
    var counterReset: ReturnType[
        js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], CounterReset_]
      ] = js.native
  }
  
  @JSImport("html2canvas/dist/types/css", "CSSParsedDeclaration")
  @js.native
  open class CSSParsedDeclaration protected () extends StObject {
    def this(context: Context, declaration: CSSStyleDeclaration) = this()
    
    var animationDuration: ReturnType[
        js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], js.Array[Double]]
      ] = js.native
    
    var backgroundClip: ReturnType[
        js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], BackgroundClip_]
      ] = js.native
    
    var backgroundColor: Color_ = js.native
    
    var backgroundImage: ReturnType[
        js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], js.Array[ICSSImage]]
      ] = js.native
    
    var backgroundOrigin: ReturnType[
        js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], BackgroundOrigin_]
      ] = js.native
    
    var backgroundPosition: ReturnType[
        js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], BackgroundPosition_]
      ] = js.native
    
    var backgroundRepeat: ReturnType[
        js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], BackgroundRepeat_]
      ] = js.native
    
    var backgroundSize: ReturnType[
        js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], BackgroundSize_]
      ] = js.native
    
    var borderBottomColor: Color_ = js.native
    
    var borderBottomLeftRadius: ReturnType[
        js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], BorderRadius]
      ] = js.native
    
    var borderBottomRightRadius: ReturnType[
        js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], BorderRadius]
      ] = js.native
    
    var borderBottomStyle: ReturnType[js.Function2[/* context */ Context, /* token */ String, BORDER_STYLE]] = js.native
    
    var borderBottomWidth: ReturnType[js.Function2[/* context */ Context, /* token */ CSSValue, Double]] = js.native
    
    var borderLeftColor: Color_ = js.native
    
    var borderLeftStyle: ReturnType[js.Function2[/* context */ Context, /* token */ String, BORDER_STYLE]] = js.native
    
    var borderLeftWidth: ReturnType[js.Function2[/* context */ Context, /* token */ CSSValue, Double]] = js.native
    
    var borderRightColor: Color_ = js.native
    
    var borderRightStyle: ReturnType[js.Function2[/* context */ Context, /* token */ String, BORDER_STYLE]] = js.native
    
    var borderRightWidth: ReturnType[js.Function2[/* context */ Context, /* token */ CSSValue, Double]] = js.native
    
    var borderTopColor: Color_ = js.native
    
    var borderTopLeftRadius: ReturnType[
        js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], BorderRadius]
      ] = js.native
    
    var borderTopRightRadius: ReturnType[
        js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], BorderRadius]
      ] = js.native
    
    var borderTopStyle: ReturnType[js.Function2[/* context */ Context, /* token */ String, BORDER_STYLE]] = js.native
    
    var borderTopWidth: ReturnType[js.Function2[/* context */ Context, /* token */ CSSValue, Double]] = js.native
    
    var boxShadow: ReturnType[js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], BoxShadow_]] = js.native
    
    var color: Color_ = js.native
    
    var direction: ReturnType[js.Function2[/* context */ Context, /* token */ String, DIRECTION_]] = js.native
    
    var display: ReturnType[js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], Display_]] = js.native
    
    var float: ReturnType[js.Function2[/* context */ Context, /* token */ String, FLOAT_]] = js.native
    
    var fontFamily: ReturnType[
        js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], FontFamily_]
      ] = js.native
    
    var fontSize: LengthPercentage = js.native
    
    var fontStyle: ReturnType[js.Function2[/* context */ Context, /* token */ String, FONT_STYLE]] = js.native
    
    var fontVariant: ReturnType[
        js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], js.Array[String]]
      ] = js.native
    
    var fontWeight: ReturnType[js.Function2[/* context */ Context, /* token */ CSSValue, Double]] = js.native
    
    def isFloating(): Boolean = js.native
    
    def isInlineLevel(): Boolean = js.native
    
    def isPositioned(): Boolean = js.native
    
    def isPositionedWithZIndex(): Boolean = js.native
    
    def isTransformed(): Boolean = js.native
    
    def isTransparent(): Boolean = js.native
    
    def isVisible(): Boolean = js.native
    
    var letterSpacing: ReturnType[js.Function2[/* context */ Context, /* token */ CSSValue, Double]] = js.native
    
    var lineBreak: ReturnType[js.Function2[/* context */ Context, /* token */ String, LINE_BREAK]] = js.native
    
    var lineHeight: CSSValue = js.native
    
    var listStyleImage: ReturnType[js.Function2[/* context */ Context, /* token */ CSSValue, ICSSImage | Null]] = js.native
    
    var listStylePosition: ReturnType[js.Function2[/* context */ Context, /* token */ String, LIST_STYLE_POSITION]] = js.native
    
    var listStyleType: ReturnType[js.Function2[/* context */ Context, /* token */ String, LIST_STYLE_TYPE]] = js.native
    
    var marginBottom: CSSValue = js.native
    
    var marginLeft: CSSValue = js.native
    
    var marginRight: CSSValue = js.native
    
    var marginTop: CSSValue = js.native
    
    var opacity: ReturnType[js.Function2[/* context */ Context, /* token */ CSSValue, Double]] = js.native
    
    var overflowWrap: ReturnType[js.Function2[/* context */ Context, /* token */ String, OVERFLOW_WRAP]] = js.native
    
    var overflowX: OVERFLOW_ = js.native
    
    var overflowY: OVERFLOW_ = js.native
    
    var paddingBottom: LengthPercentage = js.native
    
    var paddingLeft: LengthPercentage = js.native
    
    var paddingRight: LengthPercentage = js.native
    
    var paddingTop: LengthPercentage = js.native
    
    var paintOrder: ReturnType[
        js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], PaintOrder_]
      ] = js.native
    
    var position: ReturnType[js.Function2[/* context */ Context, /* token */ String, POSITION_]] = js.native
    
    var textAlign: ReturnType[js.Function2[/* context */ Context, /* token */ String, TEXT_ALIGN]] = js.native
    
    var textDecorationColor: Color_ = js.native
    
    var textDecorationLine: ReturnType[
        js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], TextDecorationLine_]
      ] = js.native
    
    var textShadow: ReturnType[
        js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], TextShadow_]
      ] = js.native
    
    var textTransform: ReturnType[js.Function2[/* context */ Context, /* token */ String, TEXT_TRANSFORM]] = js.native
    
    var transform: ReturnType[js.Function2[/* context */ Context, /* token */ CSSValue, Transform_]] = js.native
    
    var transformOrigin: ReturnType[
        js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], TransformOrigin_]
      ] = js.native
    
    var visibility: ReturnType[js.Function2[/* context */ Context, /* token */ String, VISIBILITY_]] = js.native
    
    var webkitTextStrokeColor: Color_ = js.native
    
    var webkitTextStrokeWidth: ReturnType[js.Function2[/* context */ Context, /* token */ CSSValue, Double]] = js.native
    
    var wordBreak: ReturnType[js.Function2[/* context */ Context, /* token */ String, WORD_BREAK]] = js.native
    
    var zIndex: ReturnType[
        js.Function2[
          /* context */ Context, 
          /* token */ CSSValue, 
          typings.html2canvas.distTypesCssPropertyDescriptorsZIndexMod.zIndex
        ]
      ] = js.native
  }
  
  @JSImport("html2canvas/dist/types/css", "CSSParsedPseudoDeclaration")
  @js.native
  open class CSSParsedPseudoDeclaration protected () extends StObject {
    def this(context: Context, declaration: CSSStyleDeclaration) = this()
    
    var content: ReturnType[js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], Content_]] = js.native
    
    var quotes: ReturnType[js.Function2[/* context */ Context, /* tokens */ js.Array[CSSValue], Quotes_]] = js.native
  }
}
