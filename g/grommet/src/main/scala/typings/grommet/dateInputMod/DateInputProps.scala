package typings.grommet.dateInputMod

import typings.grommet.anon.Target
import typings.grommet.buttonMod.ButtonType
import typings.grommet.calendarMod.CalendarType
import typings.grommet.dropMod.DropType
import typings.grommet.maskedInputMod.MaskedInputType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateInputProps extends js.Object {
  
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
  implicit class DateInputPropsOps[Self <: DateInputProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setButtonProps(value: ButtonType): Self = this.set("buttonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonProps: Self = this.set("buttonProps", js.undefined)
    
    @scala.inline
    def setCalendarProps(value: CalendarType): Self = this.set("calendarProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalendarProps: Self = this.set("calendarProps", js.undefined)
    
    @scala.inline
    def setDefaultValueVarargs(value: String*): Self = this.set("defaultValue", js.Array(value :_*))
    
    @scala.inline
    def setDefaultValue(value: String | js.Array[String]): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    
    @scala.inline
    def setDropProps(value: DropType): Self = this.set("dropProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropProps: Self = this.set("dropProps", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setInputProps(value: MaskedInputType): Self = this.set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProps: Self = this.set("inputProps", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* event */ Target => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: String*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String | js.Array[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
