package typings.jsJoda

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ToDate extends StObject {
    
    def toDate(): Date
    
    def toEpochMilli(): Double
  }
  object ToDate {
    
    inline def apply(toDate: () => Date, toEpochMilli: () => Double): ToDate = {
      val __obj = js.Dynamic.literal(toDate = js.Any.fromFunction0(toDate), toEpochMilli = js.Any.fromFunction0(toEpochMilli))
      __obj.asInstanceOf[ToDate]
    }
    
    extension [Self <: ToDate](x: Self) {
      
      inline def setToDate(value: () => Date): Self = StObject.set(x, "toDate", js.Any.fromFunction0(value))
      
      inline def setToEpochMilli(value: () => Double): Self = StObject.set(x, "toEpochMilli", js.Any.fromFunction0(value))
    }
  }
}
