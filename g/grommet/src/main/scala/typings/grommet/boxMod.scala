package typings.grommet

import typings.grommet.anon.Delay
import typings.grommet.anon.Error
import typings.grommet.anon.Grow
import typings.grommet.anon.Horizontal
import typings.grommet.anon.Max
import typings.grommet.grommetStrings.`column-reverse`
import typings.grommet.grommetStrings.`row-responsive`
import typings.grommet.grommetStrings.`row-reverse`
import typings.grommet.grommetStrings.around
import typings.grommet.grommetStrings.auto
import typings.grommet.grommetStrings.baseline
import typings.grommet.grommetStrings.between
import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.column
import typings.grommet.grommetStrings.end
import typings.grommet.grommetStrings.evenly
import typings.grommet.grommetStrings.fadeIn
import typings.grommet.grommetStrings.fadeOut
import typings.grommet.grommetStrings.grow
import typings.grommet.grommetStrings.hidden
import typings.grommet.grommetStrings.jiggle
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.pulse
import typings.grommet.grommetStrings.reverse
import typings.grommet.grommetStrings.rotateLeft
import typings.grommet.grommetStrings.rotateRight
import typings.grommet.grommetStrings.row
import typings.grommet.grommetStrings.scroll
import typings.grommet.grommetStrings.shrink
import typings.grommet.grommetStrings.slideDown
import typings.grommet.grommetStrings.slideLeft
import typings.grommet.grommetStrings.slideRight
import typings.grommet.grommetStrings.slideUp
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.start
import typings.grommet.grommetStrings.stretch
import typings.grommet.grommetStrings.visible
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxlarge
import typings.grommet.grommetStrings.xxsmall
import typings.grommet.grommetStrings.zoomIn
import typings.grommet.grommetStrings.zoomOut
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignContentType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.BasisType
import typings.grommet.utilsMod.BorderType
import typings.grommet.utilsMod.ElevationType
import typings.grommet.utilsMod.FillType
import typings.grommet.utilsMod.GapType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.PadType
import typings.grommet.utilsMod.PolymorphicType
import typings.grommet.utilsMod.RoundType
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxMod {
  
  @JSImport("grommet/components/Box", "Box")
  @js.native
  val Box: FC[BoxProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])] = js.native
  
  trait BoxProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var align: js.UndefOr[start | center | end | baseline | stretch] = js.undefined
    
    var alignContent: js.UndefOr[AlignContentType] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var animation: js.UndefOr[
        fadeIn | fadeOut | jiggle | pulse | rotateLeft | rotateRight | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay | (js.Array[
          fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay
        ])
      ] = js.undefined
    
    var as: js.UndefOr[PolymorphicType] = js.undefined
    
    var background: js.UndefOr[BackgroundType] = js.undefined
    
    var basis: js.UndefOr[BasisType] = js.undefined
    
    var border: js.UndefOr[BorderType] = js.undefined
    
    var direction: js.UndefOr[row | column | `row-responsive` | `row-reverse` | `column-reverse`] = js.undefined
    
    var elevation: js.UndefOr[ElevationType] = js.undefined
    
    var fill: js.UndefOr[FillType] = js.undefined
    
    var flex: js.UndefOr[grow | shrink | Boolean | Grow] = js.undefined
    
    var focusIndicator: js.UndefOr[Boolean] = js.undefined
    
    var gap: js.UndefOr[GapType] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var height: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | Max] = js.undefined
    
    var hoverIndicator: js.UndefOr[BackgroundType | Boolean] = js.undefined
    
    var justify: js.UndefOr[around | between | center | end | evenly | start | stretch] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var overflow: js.UndefOr[auto | hidden | scroll | visible | Horizontal | String] = js.undefined
    
    var pad: js.UndefOr[PadType] = js.undefined
    
    var responsive: js.UndefOr[Boolean] = js.undefined
    
    var round: js.UndefOr[RoundType] = js.undefined
    
    var tag: js.UndefOr[PolymorphicType] = js.undefined
    
    var width: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | Max] = js.undefined
    
    var wrap: js.UndefOr[Boolean | reverse] = js.undefined
  }
  object BoxProps {
    
    inline def apply(): BoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxProps]
    }
    
    extension [Self <: BoxProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAlign(value: start | center | end | baseline | stretch): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignContent(value: AlignContentType): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      inline def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setAnimation(
        value: fadeIn | fadeOut | jiggle | pulse | rotateLeft | rotateRight | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay | (js.Array[
              fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay
            ])
      ): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setAnimationVarargs(
        value: (fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay)*
      ): Self = StObject.set(x, "animation", js.Array(value :_*))
      
      inline def setAs(value: PolymorphicType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBasis(value: BasisType): Self = StObject.set(x, "basis", value.asInstanceOf[js.Any])
      
      inline def setBasisUndefined: Self = StObject.set(x, "basis", js.undefined)
      
      inline def setBorder(value: BorderType): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setBorderVarargs(value: Error*): Self = StObject.set(x, "border", js.Array(value :_*))
      
      inline def setDirection(value: row | column | `row-responsive` | `row-reverse` | `column-reverse`): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setElevation(value: ElevationType): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      inline def setFill(value: FillType): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFlex(value: grow | shrink | Boolean | Grow): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      inline def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      inline def setFocusIndicator(value: Boolean): Self = StObject.set(x, "focusIndicator", value.asInstanceOf[js.Any])
      
      inline def setFocusIndicatorUndefined: Self = StObject.set(x, "focusIndicator", js.undefined)
      
      inline def setGap(value: GapType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setHeight(value: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | Max): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHoverIndicator(value: BackgroundType | Boolean): Self = StObject.set(x, "hoverIndicator", value.asInstanceOf[js.Any])
      
      inline def setHoverIndicatorUndefined: Self = StObject.set(x, "hoverIndicator", js.undefined)
      
      inline def setJustify(value: around | between | center | end | evenly | start | stretch): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
      
      inline def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnClick(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOverflow(value: auto | hidden | scroll | visible | Horizontal | String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setRound(value: RoundType): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setTag(value: PolymorphicType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setWidth(value: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | Max): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWrap(value: Boolean | reverse): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type BoxTypes = BoxProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
}
