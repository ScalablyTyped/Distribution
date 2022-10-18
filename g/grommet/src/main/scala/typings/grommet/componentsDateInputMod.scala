package typings.grommet

import typings.grommet.anon.EnterCalendar
import typings.grommet.anon.Value
import typings.grommet.componentsButtonMod.ButtonType_
import typings.grommet.componentsCalendarMod.CalendarType
import typings.grommet.componentsDropMod.DropType
import typings.grommet.componentsMaskedInputMod.MaskedInputType
import typings.grommet.grommetStrings.`2xl`
import typings.grommet.grommetStrings.`3xl`
import typings.grommet.grommetStrings.`4xl`
import typings.grommet.grommetStrings.`5xl`
import typings.grommet.grommetStrings.`6xl`
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxlarge
import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDateInputMod {
  
  @JSImport("grommet/components/DateInput", "DateInput")
  @js.native
  val DateInput: FC[DateInputExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>, 'defaultValue' | 'onChange' | 'value' | 'size'> ]: react.react.DetailedHTMLProps<react.react.InputHTMLAttributes<std.HTMLInputElement>, std.HTMLInputElement>[P]} */ trait DateInputExtendedProps
    extends StObject
       with DateInputProps
  object DateInputExtendedProps {
    
    inline def apply(): DateInputExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateInputExtendedProps]
    }
  }
  
  trait DateInputProps extends StObject {
    
    var buttonProps: js.UndefOr[ButtonType_] = js.undefined
    
    var calendarProps: js.UndefOr[CalendarType] = js.undefined
    
    var defaultValue: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var dropProps: js.UndefOr[DropType] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[Element] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var inputProps: js.UndefOr[MaskedInputType] = js.undefined
    
    var messages: js.UndefOr[EnterCalendar] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* event */ Value, Unit]] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[
        xsmall | small | medium | large | xlarge | xxlarge | `2xl` | `3xl` | `4xl` | `5xl` | `6xl` | String
      ] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object DateInputProps {
    
    inline def apply(): DateInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateInputProps]
    }
    
    extension [Self <: DateInputProps](x: Self) {
      
      inline def setButtonProps(value: ButtonType_): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      inline def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      inline def setCalendarProps(value: CalendarType): Self = StObject.set(x, "calendarProps", value.asInstanceOf[js.Any])
      
      inline def setCalendarPropsUndefined: Self = StObject.set(x, "calendarProps", js.undefined)
      
      inline def setDefaultValue(value: String | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDropProps(value: DropType): Self = StObject.set(x, "dropProps", value.asInstanceOf[js.Any])
      
      inline def setDropPropsUndefined: Self = StObject.set(x, "dropProps", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setIcon(value: Element): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setInputProps(value: MaskedInputType): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setMessages(value: EnterCalendar): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* event */ Value => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setSize(
        value: xsmall | small | medium | large | xlarge | xxlarge | `2xl` | `3xl` | `4xl` | `5xl` | `6xl` | String
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setValue(value: String | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
}
