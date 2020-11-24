package typings.kendoUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _empty extends js.Object {
  
  var AM: js.Array[String] = js.native
  
  @JSName(":")
  var Colon: String = js.native
  
  var PM: js.Array[String] = js.native
  
  @JSName("/")
  var Slash: String = js.native
  
  var days: Names = js.native
  
  var firstDay: Double = js.native
  
  var months: NamesAbbr = js.native
  
  var patterns: D = js.native
  
  var twoDigitYearMax: Double = js.native
}
object _empty {
  
  @scala.inline
  def apply(
    AM: js.Array[String],
    Colon: String,
    PM: js.Array[String],
    Slash: String,
    days: Names,
    firstDay: Double,
    months: NamesAbbr,
    patterns: D,
    twoDigitYearMax: Double
  ): _empty = {
    val __obj = js.Dynamic.literal(AM = AM.asInstanceOf[js.Any], PM = PM.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], firstDay = firstDay.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], twoDigitYearMax = twoDigitYearMax.asInstanceOf[js.Any])
    __obj.updateDynamic(":")(Colon.asInstanceOf[js.Any])
    __obj.updateDynamic("/")(Slash.asInstanceOf[js.Any])
    __obj.asInstanceOf[_empty]
  }
  
  @scala.inline
  implicit class _emptyOps[Self <: _empty] (val x: Self) extends AnyVal {
    
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
    def setAMVarargs(value: String*): Self = this.set("AM", js.Array(value :_*))
    
    @scala.inline
    def setAM(value: js.Array[String]): Self = this.set("AM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColon(value: String): Self = this.set(":", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPMVarargs(value: String*): Self = this.set("PM", js.Array(value :_*))
    
    @scala.inline
    def setPM(value: js.Array[String]): Self = this.set("PM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlash(value: String): Self = this.set("/", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDays(value: Names): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDay(value: Double): Self = this.set("firstDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonths(value: NamesAbbr): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatterns(value: D): Self = this.set("patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoDigitYearMax(value: Double): Self = this.set("twoDigitYearMax", value.asInstanceOf[js.Any])
  }
}
