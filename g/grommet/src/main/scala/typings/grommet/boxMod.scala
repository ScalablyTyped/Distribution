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
    
    @scala.inline
    def apply(): BoxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxProps]
    }
    
    @scala.inline
    implicit class BoxPropsMutableBuilder[Self <: BoxProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setAlign(value: start | center | end | baseline | stretch): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignContent(value: AlignContentType): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setAnimation(
        value: fadeIn | fadeOut | jiggle | pulse | rotateLeft | rotateRight | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay | (js.Array[
              fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay
            ])
      ): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAnimationVarargs(
        value: (fadeIn | fadeOut | jiggle | pulse | slideUp | slideDown | slideLeft | slideRight | zoomIn | zoomOut | Delay)*
      ): Self = StObject.set(x, "animation", js.Array(value :_*))
      
      @scala.inline
      def setAs(value: PolymorphicType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBasis(value: BasisType): Self = StObject.set(x, "basis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasisUndefined: Self = StObject.set(x, "basis", js.undefined)
      
      @scala.inline
      def setBorder(value: BorderType): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setBorderVarargs(value: Error*): Self = StObject.set(x, "border", js.Array(value :_*))
      
      @scala.inline
      def setDirection(value: row | column | `row-responsive` | `row-reverse` | `column-reverse`): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setElevation(value: ElevationType): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
      
      @scala.inline
      def setFill(value: FillType): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFlex(value: grow | shrink | Boolean | Grow): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexUndefined: Self = StObject.set(x, "flex", js.undefined)
      
      @scala.inline
      def setFocusIndicator(value: Boolean): Self = StObject.set(x, "focusIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusIndicatorUndefined: Self = StObject.set(x, "focusIndicator", js.undefined)
      
      @scala.inline
      def setGap(value: GapType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setHeight(value: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | Max): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHoverIndicator(value: BackgroundType | Boolean): Self = StObject.set(x, "hoverIndicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverIndicatorUndefined: Self = StObject.set(x, "hoverIndicator", js.undefined)
      
      @scala.inline
      def setJustify(value: around | between | center | end | evenly | start | stretch): Self = StObject.set(x, "justify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyUndefined: Self = StObject.set(x, "justify", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOverflow(value: auto | hidden | scroll | visible | Horizontal | String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setPad(value: PadType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      @scala.inline
      def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setRound(value: RoundType): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setTag(value: PolymorphicType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setWidth(value: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String | Max): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean | reverse): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  type BoxTypes = BoxProps & (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement])
}
