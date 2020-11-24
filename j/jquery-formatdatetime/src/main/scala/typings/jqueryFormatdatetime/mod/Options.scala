package typings.jqueryFormatdatetime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  monthNames :std.Array<string>,   monthNamesShort :std.Array<string>,   dayNames :std.Array<string>,   dayNamesShort :std.Array<string>,   ampmNames :std.Array<string>, getSuffix (num : number): string,   attribute :string,   formatAttribute :string,   utc :boolean}> */
@js.native
trait Options extends js.Object {
  
  var ampmNames: js.UndefOr[js.Array[String]] = js.native
  
  var attribute: js.UndefOr[String] = js.native
  
  var dayNames: js.UndefOr[js.Array[String]] = js.native
  
  var dayNamesShort: js.UndefOr[js.Array[String]] = js.native
  
  var formatAttribute: js.UndefOr[String] = js.native
  
  var getSuffix: js.UndefOr[js.Function1[/* num */ Double, String]] = js.native
  
  var monthNames: js.UndefOr[js.Array[String]] = js.native
  
  var monthNamesShort: js.UndefOr[js.Array[String]] = js.native
  
  var utc: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAmpmNamesVarargs(value: String*): Self = this.set("ampmNames", js.Array(value :_*))
    
    @scala.inline
    def setAmpmNames(value: js.Array[String]): Self = this.set("ampmNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAmpmNames: Self = this.set("ampmNames", js.undefined)
    
    @scala.inline
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribute: Self = this.set("attribute", js.undefined)
    
    @scala.inline
    def setDayNamesVarargs(value: String*): Self = this.set("dayNames", js.Array(value :_*))
    
    @scala.inline
    def setDayNames(value: js.Array[String]): Self = this.set("dayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayNames: Self = this.set("dayNames", js.undefined)
    
    @scala.inline
    def setDayNamesShortVarargs(value: String*): Self = this.set("dayNamesShort", js.Array(value :_*))
    
    @scala.inline
    def setDayNamesShort(value: js.Array[String]): Self = this.set("dayNamesShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayNamesShort: Self = this.set("dayNamesShort", js.undefined)
    
    @scala.inline
    def setFormatAttribute(value: String): Self = this.set("formatAttribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatAttribute: Self = this.set("formatAttribute", js.undefined)
    
    @scala.inline
    def setGetSuffix(value: /* num */ Double => String): Self = this.set("getSuffix", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetSuffix: Self = this.set("getSuffix", js.undefined)
    
    @scala.inline
    def setMonthNamesVarargs(value: String*): Self = this.set("monthNames", js.Array(value :_*))
    
    @scala.inline
    def setMonthNames(value: js.Array[String]): Self = this.set("monthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthNames: Self = this.set("monthNames", js.undefined)
    
    @scala.inline
    def setMonthNamesShortVarargs(value: String*): Self = this.set("monthNamesShort", js.Array(value :_*))
    
    @scala.inline
    def setMonthNamesShort(value: js.Array[String]): Self = this.set("monthNamesShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonthNamesShort: Self = this.set("monthNamesShort", js.undefined)
    
    @scala.inline
    def setUtc(value: Boolean): Self = this.set("utc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtc: Self = this.set("utc", js.undefined)
  }
}
