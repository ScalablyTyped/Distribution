package typings.googleapis.v2Mod.androidpublisherV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMonthDay extends StObject {
  
  /**
    * Day of a month, value in [1, 31] range. Valid range depends on the
    * specified month.
    */
  var day: js.UndefOr[Double] = js.undefined
  
  /**
    * Month of a year. e.g. 1 = JAN, 2 = FEB etc.
    */
  var month: js.UndefOr[Double] = js.undefined
}
object SchemaMonthDay {
  
  inline def apply(): SchemaMonthDay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMonthDay]
  }
  
  extension [Self <: SchemaMonthDay](x: Self) {
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setDayUndefined: Self = StObject.set(x, "day", js.undefined)
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setMonthUndefined: Self = StObject.set(x, "month", js.undefined)
  }
}
