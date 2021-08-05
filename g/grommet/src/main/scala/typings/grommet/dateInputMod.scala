package typings.grommet

import typings.grommet.anon.Target
import typings.grommet.buttonMod.ButtonType
import typings.grommet.calendarMod.CalendarType
import typings.grommet.dropMod.DropType
import typings.grommet.maskedInputMod.MaskedInputType
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateInputMod {
  
  @JSImport("grommet/components/DateInput", "DateInput")
  @js.native
  val DateInput: FC[DateInputProps] = js.native
  
  trait DateInputProps extends StObject {
    
    var buttonProps: js.UndefOr[ButtonType] = js.undefined
    
    var calendarProps: js.UndefOr[CalendarType] = js.undefined
    
    var defaultValue: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var dropProps: js.UndefOr[DropType] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var inputProps: js.UndefOr[MaskedInputType] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* event */ Target, Unit]] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object DateInputProps {
    
    inline def apply(): DateInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateInputProps]
    }
    
    extension [Self <: DateInputProps](x: Self) {
      
      inline def setButtonProps(value: ButtonType): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      inline def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      inline def setCalendarProps(value: CalendarType): Self = StObject.set(x, "calendarProps", value.asInstanceOf[js.Any])
      
      inline def setCalendarPropsUndefined: Self = StObject.set(x, "calendarProps", js.undefined)
      
      inline def setDefaultValue(value: String | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      inline def setDropProps(value: DropType): Self = StObject.set(x, "dropProps", value.asInstanceOf[js.Any])
      
      inline def setDropPropsUndefined: Self = StObject.set(x, "dropProps", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setInputProps(value: MaskedInputType): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* event */ Target => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: String | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
