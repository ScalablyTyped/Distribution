package typings.ink

import typings.ink.domMod.DOMElement
import typings.ink.domMod.NodeNames
import typings.ink.inkStrings.`column-reverse`
import typings.ink.inkStrings.`flex-end`
import typings.ink.inkStrings.`flex-start`
import typings.ink.inkStrings.`row-reverse`
import typings.ink.inkStrings.`space-around`
import typings.ink.inkStrings.`space-between`
import typings.ink.inkStrings.absolute
import typings.ink.inkStrings.arrow
import typings.ink.inkStrings.auto
import typings.ink.inkStrings.bold
import typings.ink.inkStrings.center
import typings.ink.inkStrings.classic
import typings.ink.inkStrings.column
import typings.ink.inkStrings.double
import typings.ink.inkStrings.doubleSingle
import typings.ink.inkStrings.flex
import typings.ink.inkStrings.none
import typings.ink.inkStrings.relative
import typings.ink.inkStrings.round
import typings.ink.inkStrings.row
import typings.ink.inkStrings.single
import typings.ink.inkStrings.singleDouble
import typings.ink.inkStrings.stretch
import typings.ink.renderNodeToOutputMod.OutputTransformer
import typings.react.mod.Key
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.typeFest.literalUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var nodeName: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any
  }
  object `0` {
    
    inline def apply(nodeName: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): `0` = {
      val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setNodeName(value: /* import warning: importer.ImportType#apply Failed type conversion: infer U */ js.Any): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    }
  }
  
  trait ActiveFocusId extends StObject {
    
    var activeFocusId: Unit
    
    var error: Unit
    
    var focusables: js.Array[scala.Nothing]
    
    var isFocusEnabled: Boolean
  }
  object ActiveFocusId {
    
    inline def apply(activeFocusId: Unit, error: Unit, focusables: js.Array[scala.Nothing], isFocusEnabled: Boolean): ActiveFocusId = {
      val __obj = js.Dynamic.literal(activeFocusId = activeFocusId.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], focusables = focusables.asInstanceOf[js.Any], isFocusEnabled = isFocusEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActiveFocusId]
    }
    
    extension [Self <: ActiveFocusId](x: Self) {
      
      inline def setActiveFocusId(value: Unit): Self = StObject.set(x, "activeFocusId", value.asInstanceOf[js.Any])
      
      inline def setError(value: Unit): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFocusables(value: js.Array[scala.Nothing]): Self = StObject.set(x, "focusables", value.asInstanceOf[js.Any])
      
      inline def setFocusablesVarargs(value: scala.Nothing*): Self = StObject.set(x, "focusables", js.Array(value*))
      
      inline def setIsFocusEnabled(value: Boolean): Self = StObject.set(x, "isFocusEnabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait AutoFocus extends StObject {
    
    var autoFocus: Boolean
  }
  object AutoFocus {
    
    inline def apply(autoFocus: Boolean): AutoFocus = {
      val __obj = js.Dynamic.literal(autoFocus = autoFocus.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoFocus]
    }
    
    extension [Self <: AutoFocus](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: js.Error
  }
  object Error {
    
    inline def apply(error: js.Error): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var output: String
  }
  object Height {
    
    inline def apply(height: Double, output: String): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeName extends StObject {
    
    var nodeName: NodeNames
  }
  object NodeName {
    
    inline def apply(nodeName: NodeNames): NodeName = {
      val __obj = js.Dynamic.literal(nodeName = nodeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeName]
    }
    
    extension [Self <: NodeName](x: Self) {
      
      inline def setNodeName(value: NodeNames): Self = StObject.set(x, "nodeName", value.asInstanceOf[js.Any])
    }
  }
  
  trait OffsetX extends StObject {
    
    var offsetX: js.UndefOr[Double] = js.undefined
    
    var offsetY: js.UndefOr[Double] = js.undefined
    
    var skipStaticElements: Boolean
    
    var transformers: js.UndefOr[js.Array[OutputTransformer]] = js.undefined
  }
  object OffsetX {
    
    inline def apply(skipStaticElements: Boolean): OffsetX = {
      val __obj = js.Dynamic.literal(skipStaticElements = skipStaticElements.asInstanceOf[js.Any])
      __obj.asInstanceOf[OffsetX]
    }
    
    extension [Self <: OffsetX](x: Self) {
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setSkipStaticElements(value: Boolean): Self = StObject.set(x, "skipStaticElements", value.asInstanceOf[js.Any])
      
      inline def setTransformers(value: js.Array[OutputTransformer]): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
      
      inline def setTransformersUndefined: Self = StObject.set(x, "transformers", js.undefined)
      
      inline def setTransformersVarargs(value: OutputTransformer*): Self = StObject.set(x, "transformers", js.Array(value*))
    }
  }
  
  trait ShowCursor extends StObject {
    
    var showCursor: js.UndefOr[Boolean] = js.undefined
  }
  object ShowCursor {
    
    inline def apply(): ShowCursor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShowCursor]
    }
    
    extension [Self <: ShowCursor](x: Self) {
      
      inline def setShowCursor(value: Boolean): Self = StObject.set(x, "showCursor", value.asInstanceOf[js.Any])
      
      inline def setShowCursorUndefined: Self = StObject.set(x, "showCursor", js.undefined)
    }
  }
  
  trait Transformers extends StObject {
    
    var transformers: js.Array[OutputTransformer]
  }
  object Transformers {
    
    inline def apply(transformers: js.Array[OutputTransformer]): Transformers = {
      val __obj = js.Dynamic.literal(transformers = transformers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transformers]
    }
    
    extension [Self <: Transformers](x: Self) {
      
      inline def setTransformers(value: js.Array[OutputTransformer]): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
      
      inline def setTransformersVarargs(value: OutputTransformer*): Self = StObject.set(x, "transformers", js.Array(value*))
    }
  }
  
  /* Inlined { readonly margin :number | undefined,  readonly marginX :number | undefined,  readonly marginY :number | undefined,  readonly padding :number | undefined,  readonly paddingX :number | undefined,  readonly paddingY :number | undefined,   children :react.react.ReactNode | undefined} & std.Pick<ink.ink/build/styles.Styles, 'position' | 'marginLeft' | 'marginRight' | 'marginTop' | 'marginBottom' | 'paddingLeft' | 'paddingRight' | 'paddingTop' | 'paddingBottom' | 'flexGrow' | 'flexShrink' | 'flexDirection' | 'flexBasis' | 'alignItems' | 'alignSelf' | 'justifyContent' | 'width' | 'height' | 'minWidth' | 'minHeight' | 'display' | 'borderStyle' | 'borderColor'> & react.react.RefAttributes<ink.ink/build/dom.DOMElement> */
  trait readonlymarginnumberundef extends StObject {
    
    var alignItems: js.UndefOr[`flex-start` | center | `flex-end` | stretch] = js.undefined
    
    var alignSelf: js.UndefOr[`flex-start` | center | `flex-end` | auto] = js.undefined
    
    var borderColor: js.UndefOr[
        LiteralUnion[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ Any, 
          String
        ]
      ] = js.undefined
    
    var borderStyle: js.UndefOr[single | double | round | bold | singleDouble | doubleSingle | classic | arrow] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var display: js.UndefOr[flex | none] = js.undefined
    
    var flexBasis: js.UndefOr[Double | String] = js.undefined
    
    var flexDirection: js.UndefOr[row | column | `row-reverse` | `column-reverse`] = js.undefined
    
    var flexGrow: js.UndefOr[Double] = js.undefined
    
    var flexShrink: js.UndefOr[Double] = js.undefined
    
    var height: js.UndefOr[Double | String] = js.undefined
    
    var justifyContent: js.UndefOr[`flex-start` | `flex-end` | `space-between` | `space-around` | center] = js.undefined
    
    var key: js.UndefOr[Key | Null] = js.undefined
    
    /**
      * Margin on all sides. Equivalent to setting `marginTop`, `marginBottom`, `marginLeft` and `marginRight`.
      *
      * @default 0
      */
    val margin: js.UndefOr[Double] = js.undefined
    
    var marginBottom: js.UndefOr[Double] = js.undefined
    
    var marginLeft: js.UndefOr[Double] = js.undefined
    
    var marginRight: js.UndefOr[Double] = js.undefined
    
    var marginTop: js.UndefOr[Double] = js.undefined
    
    /**
      * Horizontal margin. Equivalent to setting `marginLeft` and `marginRight`.
      *
      * @default 0
      */
    val marginX: js.UndefOr[Double] = js.undefined
    
    /**
      * Vertical margin. Equivalent to setting `marginTop` and `marginBottom`.
      *
      * @default 0
      */
    val marginY: js.UndefOr[Double] = js.undefined
    
    var minHeight: js.UndefOr[Double | String] = js.undefined
    
    var minWidth: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Padding on all sides. Equivalent to setting `paddingTop`, `paddingBottom`, `paddingLeft` and `paddingRight`.
      *
      * @default 0
      */
    val padding: js.UndefOr[Double] = js.undefined
    
    var paddingBottom: js.UndefOr[Double] = js.undefined
    
    var paddingLeft: js.UndefOr[Double] = js.undefined
    
    var paddingRight: js.UndefOr[Double] = js.undefined
    
    var paddingTop: js.UndefOr[Double] = js.undefined
    
    /**
      * Horizontal padding. Equivalent to setting `paddingLeft` and `paddingRight`.
      *
      * @default 0
      */
    val paddingX: js.UndefOr[Double] = js.undefined
    
    /**
      * Vertical padding. Equivalent to setting `paddingTop` and `paddingBottom`.
      *
      * @default 0
      */
    val paddingY: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[absolute | relative] = js.undefined
    
    var ref: js.UndefOr[Ref[DOMElement]] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object readonlymarginnumberundef {
    
    inline def apply(): readonlymarginnumberundef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[readonlymarginnumberundef]
    }
    
    extension [Self <: readonlymarginnumberundef](x: Self) {
      
      inline def setAlignItems(value: `flex-start` | center | `flex-end` | stretch): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setAlignSelf(value: `flex-start` | center | `flex-end` | auto): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setBorderColor(
        value: LiteralUnion[
              /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ForegroundColor */ Any, 
              String
            ]
      ): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderStyle(value: single | double | round | bold | singleDouble | doubleSingle | classic | arrow): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisplay(value: flex | none): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setFlexBasis(value: Double | String): Self = StObject.set(x, "flexBasis", value.asInstanceOf[js.Any])
      
      inline def setFlexBasisUndefined: Self = StObject.set(x, "flexBasis", js.undefined)
      
      inline def setFlexDirection(value: row | column | `row-reverse` | `column-reverse`): Self = StObject.set(x, "flexDirection", value.asInstanceOf[js.Any])
      
      inline def setFlexDirectionUndefined: Self = StObject.set(x, "flexDirection", js.undefined)
      
      inline def setFlexGrow(value: Double): Self = StObject.set(x, "flexGrow", value.asInstanceOf[js.Any])
      
      inline def setFlexGrowUndefined: Self = StObject.set(x, "flexGrow", js.undefined)
      
      inline def setFlexShrink(value: Double): Self = StObject.set(x, "flexShrink", value.asInstanceOf[js.Any])
      
      inline def setFlexShrinkUndefined: Self = StObject.set(x, "flexShrink", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setJustifyContent(value: `flex-start` | `flex-end` | `space-between` | `space-around` | center): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
      
      inline def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
      
      inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
      
      inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
      
      inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
      
      inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
      
      inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
      
      inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
      
      inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setMarginX(value: Double): Self = StObject.set(x, "marginX", value.asInstanceOf[js.Any])
      
      inline def setMarginXUndefined: Self = StObject.set(x, "marginX", js.undefined)
      
      inline def setMarginY(value: Double): Self = StObject.set(x, "marginY", value.asInstanceOf[js.Any])
      
      inline def setMarginYUndefined: Self = StObject.set(x, "marginY", js.undefined)
      
      inline def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottom(value: Double): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
      
      inline def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
      
      inline def setPaddingLeft(value: Double): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
      
      inline def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
      
      inline def setPaddingRight(value: Double): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
      
      inline def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
      
      inline def setPaddingTop(value: Double): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
      
      inline def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingX(value: Double): Self = StObject.set(x, "paddingX", value.asInstanceOf[js.Any])
      
      inline def setPaddingXUndefined: Self = StObject.set(x, "paddingX", js.undefined)
      
      inline def setPaddingY(value: Double): Self = StObject.set(x, "paddingY", value.asInstanceOf[js.Any])
      
      inline def setPaddingYUndefined: Self = StObject.set(x, "paddingY", js.undefined)
      
      inline def setPosition(value: absolute | relative): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRef(value: Ref[DOMElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(value: /* instance */ DOMElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
