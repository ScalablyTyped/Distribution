package typings.kendoUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _empty extends StObject {
  
  var AM: js.Array[String]
  
  @JSName(":")
  var Colon: String
  
  var PM: js.Array[String]
  
  @JSName("/")
  var Slash: String
  
  var days: Names
  
  var firstDay: Double
  
  var months: NamesAbbr
  
  var patterns: D
  
  var twoDigitYearMax: Double
}
object _empty {
  
  inline def apply(
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
  
  extension [Self <: _empty](x: Self) {
    
    inline def setAM(value: js.Array[String]): Self = StObject.set(x, "AM", value.asInstanceOf[js.Any])
    
    inline def setAMVarargs(value: String*): Self = StObject.set(x, "AM", js.Array(value :_*))
    
    inline def setColon(value: String): Self = StObject.set(x, ":", value.asInstanceOf[js.Any])
    
    inline def setDays(value: Names): Self = StObject.set(x, "days", value.asInstanceOf[js.Any])
    
    inline def setFirstDay(value: Double): Self = StObject.set(x, "firstDay", value.asInstanceOf[js.Any])
    
    inline def setMonths(value: NamesAbbr): Self = StObject.set(x, "months", value.asInstanceOf[js.Any])
    
    inline def setPM(value: js.Array[String]): Self = StObject.set(x, "PM", value.asInstanceOf[js.Any])
    
    inline def setPMVarargs(value: String*): Self = StObject.set(x, "PM", js.Array(value :_*))
    
    inline def setPatterns(value: D): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
    
    inline def setSlash(value: String): Self = StObject.set(x, "/", value.asInstanceOf[js.Any])
    
    inline def setTwoDigitYearMax(value: Double): Self = StObject.set(x, "twoDigitYearMax", value.asInstanceOf[js.Any])
  }
}
