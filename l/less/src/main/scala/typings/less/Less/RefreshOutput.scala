package typings.less.Less

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefreshOutput extends StObject {
  
  var endTime: js.Date
  
  var sheets: Double
  
  var startTime: js.Date
  
  var totalMilliseconds: Double
}
object RefreshOutput {
  
  inline def apply(endTime: js.Date, sheets: Double, startTime: js.Date, totalMilliseconds: Double): RefreshOutput = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], sheets = sheets.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], totalMilliseconds = totalMilliseconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshOutput]
  }
  
  extension [Self <: RefreshOutput](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setSheets(value: Double): Self = StObject.set(x, "sheets", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setTotalMilliseconds(value: Double): Self = StObject.set(x, "totalMilliseconds", value.asInstanceOf[js.Any])
  }
}
