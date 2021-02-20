package typings.kendoUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AM extends StObject {
  
  var AM: js.Array[String] = js.native
  
  @JSName(":")
  var Colon: String = js.native
  
  var PM: js.Array[String] = js.native
  
  @JSName("/")
  var Slash: String = js.native
  
  var days: Names = js.native
  
  var firstDay: String = js.native
  
  var months: NamesAbbr = js.native
  
  var patterns: D = js.native
  
  var twoDigitYearMax: Double = js.native
}
object AM {
  
  @scala.inline
  def apply(
    AM: js.Array[String],
    Colon: String,
    PM: js.Array[String],
    Slash: String,
    days: Names,
    firstDay: String,
    months: NamesAbbr,
    patterns: D,
    twoDigitYearMax: Double
  ): AM = {
    val __obj = js.Dynamic.literal(AM = AM.asInstanceOf[js.Any], PM = PM.asInstanceOf[js.Any], days = days.asInstanceOf[js.Any], firstDay = firstDay.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], twoDigitYearMax = twoDigitYearMax.asInstanceOf[js.Any])
    __obj.updateDynamic(":")(Colon.asInstanceOf[js.Any])
    __obj.updateDynamic("/")(Slash.asInstanceOf[js.Any])
    __obj.asInstanceOf[AM]
  }
  
  @scala.inline
  implicit class AMMutableBuilder[Self <: AM] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAM(value: js.Array[String]): Self = StObject.set(x, "AM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAMVarargs(value: String*): Self = StObject.set(x, "AM", js.Array(value :_*))
    
    @scala.inline
    def setColon(value: String): Self = StObject.set(x, ":", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDays(value: Names): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDay(value: String): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonths(value: NamesAbbr): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPM(value: js.Array[String]): Self = StObject.set(x, "PM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPMVarargs(value: String*): Self = StObject.set(x, "PM", js.Array(value :_*))
    
    @scala.inline
    def setPatterns(value: D): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlash(value: String): Self = StObject.set(x, "/", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTwoDigitYearMax(value: Double): Self = StObject.set(x, "twoDigitYearMax", value.asInstanceOf[js.Any])
  }
}
