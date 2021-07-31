package typings.grommet

import typings.grommet.anon.Lower
import typings.grommet.grommetStrings.color
import typings.grommet.grommetStrings.full
import typings.grommet.grommetStrings.horizontal
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.strong
import typings.grommet.grommetStrings.vertical
import typings.grommet.grommetStrings.weak
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.Omit
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeSelectorMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/RangeSelector", "RangeSelector")
  @js.native
  class RangeSelector protected ()
    extends Component[
          RangeSelectorProps & (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: RangeSelectorProps & (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color])) = this()
    def this(
      props: RangeSelectorProps & (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/RangeSelector", "RangeSelector")
  @js.native
  val RangeSelector: ComponentClass[
    RangeSelectorProps & (Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], color]), 
    ComponentState
  ] = js.native
  
  trait RangeSelectorProps extends StObject {
    
    var color: js.UndefOr[ColorType] = js.undefined
    
    var direction: js.UndefOr[horizontal | vertical] = js.undefined
    
    var invert: js.UndefOr[Boolean] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var messages: js.UndefOr[Lower] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
    
    var opacity: js.UndefOr[weak | medium | strong | String | Boolean] = js.undefined
    
    var round: js.UndefOr[xsmall | small | medium | large | full | String] = js.undefined
    
    var size: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | full | String] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var values: js.Array[Double]
  }
  object RangeSelectorProps {
    
    @scala.inline
    def apply(values: js.Array[Double]): RangeSelectorProps = {
      val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeSelectorProps]
    }
    
    @scala.inline
    implicit class RangeSelectorPropsMutableBuilder[Self <: RangeSelectorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setInvert(value: Boolean): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertUndefined: Self = StObject.set(x, "invert", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMessages(value: Lower): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOpacity(value: weak | medium | strong | String | Boolean): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setRound(value: xsmall | small | medium | large | full | String): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setSize(value: xxsmall | xsmall | small | medium | large | xlarge | full | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
}
