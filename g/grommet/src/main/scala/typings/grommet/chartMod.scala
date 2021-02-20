package typings.grommet

import typings.grommet.anon.Color
import typings.grommet.anon.Height
import typings.grommet.anon.Label
import typings.grommet.anon.Opacity
import typings.grommet.anon.Vertical
import typings.grommet.grommetStrings.area
import typings.grommet.grommetStrings.bar
import typings.grommet.grommetStrings.circle
import typings.grommet.grommetStrings.diamond
import typings.grommet.grommetStrings.fill
import typings.grommet.grommetStrings.full
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.line
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.point
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.square
import typings.grommet.grommetStrings.star
import typings.grommet.grommetStrings.strong
import typings.grommet.grommetStrings.triangle
import typings.grommet.grommetStrings.triangleDown
import typings.grommet.grommetStrings.weak
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.EdgeSizeType
import typings.grommet.utilsMod.GapType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.ThicknessType
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chartMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/Chart", "Chart")
  @js.native
  class Chart protected ()
    extends Component[ChartProps, ComponentState, js.Any] {
    def this(props: ChartProps) = this()
    def this(props: ChartProps, context: js.Any) = this()
  }
  @JSImport("grommet/components/Chart", "Chart")
  @js.native
  val Chart: ComponentClass[ChartProps, ComponentState] = js.native
  
  @js.native
  trait ChartProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.native
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.native
    
    var animate: js.UndefOr[Boolean] = js.native
    
    var bounds: js.UndefOr[js.Array[js.Array[Double]]] = js.native
    
    var color: js.UndefOr[ColorType | js.Array[Color] | Opacity] = js.native
    
    var dash: js.UndefOr[Boolean] = js.native
    
    var gap: js.UndefOr[GapType] = js.native
    
    var gridArea: js.UndefOr[GridAreaType] = js.native
    
    var margin: js.UndefOr[MarginType] = js.native
    
    var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    var opacity: js.UndefOr[weak | medium | strong | Boolean | Double] = js.native
    
    var overflow: js.UndefOr[Boolean] = js.native
    
    var pad: js.UndefOr[EdgeSizeType | Vertical] = js.native
    
    var point: js.UndefOr[circle | diamond | square | star | triangle | triangleDown] = js.native
    
    var round: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[
        xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String
      ] = js.native
    
    var thickness: js.UndefOr[ThicknessType] = js.native
    
    var `type`: js.UndefOr[bar | line | area | point] = js.native
    
    var values: js.Array[Double | js.Array[Double] | Label] = js.native
  }
  object ChartProps {
    
    @scala.inline
    def apply(values: js.Array[Double | js.Array[Double] | Label]): ChartProps = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartProps]
    }
    
    @scala.inline
    implicit class ChartPropsMutableBuilder[Self <: ChartProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setBounds(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      @scala.inline
      def setBoundsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "bounds", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: ColorType | js.Array[Color] | Opacity): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setColorVarargs(value: Color*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      @scala.inline
      def setDash(value: Boolean): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
      
      @scala.inline
      def setGap(value: GapType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnHover(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      @scala.inline
      def setOpacity(value: weak | medium | strong | Boolean | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOverflow(value: Boolean): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setPad(value: EdgeSizeType | Vertical): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      @scala.inline
      def setPoint(value: circle | diamond | square | star | triangle | triangleDown): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
      
      @scala.inline
      def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setSize(value: xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setThickness(value: ThicknessType): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
      
      @scala.inline
      def setType(value: bar | line | area | point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[Double | js.Array[Double] | Label]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: (Double | js.Array[Double] | Label)*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
