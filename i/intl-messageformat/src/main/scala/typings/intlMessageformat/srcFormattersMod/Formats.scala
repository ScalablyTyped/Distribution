package typings.intlMessageformat.srcFormattersMod

import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormatOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Formats extends js.Object {
  
  var date: Record[String, DateTimeFormatOptions] = js.native
  
  var number: Record[String, NumberFormatOptions] = js.native
  
  var time: Record[String, DateTimeFormatOptions] = js.native
}
object Formats {
  
  @scala.inline
  def apply(
    date: Record[String, DateTimeFormatOptions],
    number: Record[String, NumberFormatOptions],
    time: Record[String, DateTimeFormatOptions]
  ): Formats = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formats]
  }
  
  @scala.inline
  implicit class FormatsOps[Self <: Formats] (val x: Self) extends AnyVal {
    
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
    def setDate(value: Record[String, DateTimeFormatOptions]): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber(value: Record[String, NumberFormatOptions]): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTime(value: Record[String, DateTimeFormatOptions]): Self = this.set("time", value.asInstanceOf[js.Any])
  }
}
