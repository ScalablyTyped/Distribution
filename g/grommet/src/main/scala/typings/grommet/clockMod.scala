package typings.grommet

import typings.grommet.grommetStrings.`12`
import typings.grommet.grommetStrings.`24`
import typings.grommet.grommetStrings.analog
import typings.grommet.grommetStrings.backward
import typings.grommet.grommetStrings.digital
import typings.grommet.grommetStrings.forward
import typings.grommet.grommetStrings.hours
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.minutes
import typings.grommet.grommetStrings.seconds
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.HTMLAttributes
import typings.react.mod.SVGProps
import typings.std.HTMLDivElement
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clockMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("grommet/components/Clock", "Clock")
  @js.native
  class Clock protected ()
    extends Component[
          ClockProps & ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]), 
          ComponentState, 
          js.Any
        ] {
    def this(props: ClockProps & ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement])) = this()
    def this(
      props: ClockProps & ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]),
      context: js.Any
    ) = this()
  }
  @JSImport("grommet/components/Clock", "Clock")
  @js.native
  val Clock: ComponentClass[
    ClockProps & ((DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) | SVGProps[SVGSVGElement]), 
    ComponentState
  ] = js.native
  
  trait ClockProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var hourLimit: js.UndefOr[`12` | `24`] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* time */ String, Unit]] = js.undefined
    
    var precision: js.UndefOr[hours | minutes | seconds] = js.undefined
    
    var run: js.UndefOr[Boolean | backward | forward] = js.undefined
    
    var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
    
    var time: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[analog | digital] = js.undefined
  }
  object ClockProps {
    
    @scala.inline
    def apply(): ClockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClockProps]
    }
    
    @scala.inline
    implicit class ClockPropsMutableBuilder[Self <: ClockProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      @scala.inline
      def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      @scala.inline
      def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      @scala.inline
      def setHourLimit(value: `12` | `24`): Self = StObject.set(x, "hourLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHourLimitUndefined: Self = StObject.set(x, "hourLimit", js.undefined)
      
      @scala.inline
      def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* time */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPrecision(value: hours | minutes | seconds): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      @scala.inline
      def setRun(value: Boolean | backward | forward): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
      
      @scala.inline
      def setSize(value: small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      @scala.inline
      def setType(value: analog | digital): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
