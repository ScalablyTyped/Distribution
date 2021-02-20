package typings.grommet

import typings.grommet.anon.Target
import typings.grommet.buttonMod.ButtonType
import typings.grommet.calendarMod.CalendarType
import typings.grommet.dropMod.DropType
import typings.grommet.maskedInputMod.MaskedInputType
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateInputMod {
  
  @JSImport("grommet/components/DateInput", "DateInput")
  @js.native
  val DateInput: FC[DateInputProps] = js.native
  
  @js.native
  trait DateInputProps extends StObject {
    
    var buttonProps: js.UndefOr[ButtonType] = js.native
    
    var calendarProps: js.UndefOr[CalendarType] = js.native
    
    var defaultValue: js.UndefOr[String | js.Array[String]] = js.native
    
    var dropProps: js.UndefOr[DropType] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var `inline`: js.UndefOr[Boolean] = js.native
    
    var inputProps: js.UndefOr[MaskedInputType] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[js.Function1[/* event */ Target, Unit]] = js.native
    
    var value: js.UndefOr[String | js.Array[String]] = js.native
  }
  object DateInputProps {
    
    @scala.inline
    def apply(): DateInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateInputProps]
    }
    
    @scala.inline
    implicit class DateInputPropsMutableBuilder[Self <: DateInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonProps(value: ButtonType): Self = StObject.set(x, "buttonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonPropsUndefined: Self = StObject.set(x, "buttonProps", js.undefined)
      
      @scala.inline
      def setCalendarProps(value: CalendarType): Self = StObject.set(x, "calendarProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalendarPropsUndefined: Self = StObject.set(x, "calendarProps", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDropProps(value: DropType): Self = StObject.set(x, "dropProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropPropsUndefined: Self = StObject.set(x, "dropProps", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setInputProps(value: MaskedInputType): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* event */ Target => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setValue(value: String | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
    }
  }
}
