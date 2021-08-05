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
  
  trait ChartProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var bounds: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
    
    var color: js.UndefOr[ColorType | js.Array[Color] | Opacity] = js.undefined
    
    var dash: js.UndefOr[Boolean] = js.undefined
    
    var gap: js.UndefOr[GapType] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, js.Any]] = js.undefined
    
    var opacity: js.UndefOr[weak | medium | strong | Boolean | Double] = js.undefined
    
    var overflow: js.UndefOr[Boolean] = js.undefined
    
    var pad: js.UndefOr[EdgeSizeType | Vertical] = js.undefined
    
    var point: js.UndefOr[circle | diamond | square | star | triangle | triangleDown] = js.undefined
    
    var round: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[
        xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String
      ] = js.undefined
    
    var thickness: js.UndefOr[ThicknessType] = js.undefined
    
    var `type`: js.UndefOr[bar | line | area | point] = js.undefined
    
    var values: js.Array[Double | js.Array[Double] | Label]
  }
  object ChartProps {
    
    inline def apply(values: js.Array[Double | js.Array[Double] | Label]): ChartProps = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartProps]
    }
    
    extension [Self <: ChartProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setBounds(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setBoundsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "bounds", js.Array(value :_*))
      
      inline def setColor(value: ColorType | js.Array[Color] | Opacity): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: Color*): Self = StObject.set(x, "color", js.Array(value :_*))
      
      inline def setDash(value: Boolean): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
      
      inline def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
      
      inline def setGap(value: GapType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnClick(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnHover(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "onHover", js.Any.fromFunction1(value))
      
      inline def setOnHoverUndefined: Self = StObject.set(x, "onHover", js.undefined)
      
      inline def setOpacity(value: weak | medium | strong | Boolean | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOverflow(value: Boolean): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setPad(value: EdgeSizeType | Vertical): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
      
      inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
      
      inline def setPoint(value: circle | diamond | square | star | triangle | triangleDown): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
      
      inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setSize(value: xxsmall | xsmall | small | medium | large | xlarge | fill | full | Height | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setThickness(value: ThicknessType): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
      
      inline def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
      
      inline def setType(value: bar | line | area | point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValues(value: js.Array[Double | js.Array[Double] | Label]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: (Double | js.Array[Double] | Label)*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
