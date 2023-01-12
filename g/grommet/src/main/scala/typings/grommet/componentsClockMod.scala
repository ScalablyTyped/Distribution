package typings.grommet

import typings.grommet.grommetInts.`12`
import typings.grommet.grommetInts.`24`
import typings.grommet.grommetStrings.`type`
import typings.grommet.grommetStrings.analog
import typings.grommet.grommetStrings.backward
import typings.grommet.grommetStrings.digital
import typings.grommet.grommetStrings.forward
import typings.grommet.grommetStrings.hours
import typings.grommet.grommetStrings.huge
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.minutes
import typings.grommet.grommetStrings.onChange
import typings.grommet.grommetStrings.seconds
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxlarge
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.react.mod.SVGProps
import typings.std.HTMLDivElement
import typings.std.Omit
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsClockMod {
  
  @JSImport("grommet/components/Clock", "Clock")
  @js.native
  val Clock: FC[ClockExtendedProps] = js.native
  
  type ClockExtendedProps = ((Omit[SVGProps[SVGSVGElement], onChange | `type`]) & ClockProps) | ((Omit[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement], onChange]) & ClockProps)
  
  trait ClockProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var hourLimit: js.UndefOr[
        `12` | `24` | typings.grommet.grommetStrings.`12` | typings.grommet.grommetStrings.`24`
      ] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* time */ String, Unit]] = js.undefined
    
    var precision: js.UndefOr[hours | minutes | seconds] = js.undefined
    
    var run: js.UndefOr[Boolean | backward | forward] = js.undefined
    
    var size: js.UndefOr[xsmall | small | medium | large | xlarge | xxlarge | huge | String] = js.undefined
    
    var time: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[analog | digital] = js.undefined
  }
  object ClockProps {
    
    inline def apply(): ClockProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClockProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClockProps] (val x: Self) extends AnyVal {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setHourLimit(value: `12` | `24` | typings.grommet.grommetStrings.`12` | typings.grommet.grommetStrings.`24`): Self = StObject.set(x, "hourLimit", value.asInstanceOf[js.Any])
      
      inline def setHourLimitUndefined: Self = StObject.set(x, "hourLimit", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOnChange(value: /* time */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPrecision(value: hours | minutes | seconds): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setRun(value: Boolean | backward | forward): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
      
      inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
      
      inline def setSize(value: xsmall | small | medium | large | xlarge | xxlarge | huge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
      
      inline def setType(value: analog | digital): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
