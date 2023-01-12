package typings.jsJodaCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ToDate extends StObject {
    
    def toDate(): js.Date
    
    def toEpochMilli(): Double
  }
  object ToDate {
    
    inline def apply(toDate: () => js.Date, toEpochMilli: () => Double): ToDate = {
      val __obj = js.Dynamic.literal(toDate = js.Any.fromFunction0(toDate), toEpochMilli = js.Any.fromFunction0(toEpochMilli))
      __obj.asInstanceOf[ToDate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToDate] (val x: Self) extends AnyVal {
      
      inline def setToDate(value: () => js.Date): Self = StObject.set(x, "toDate", js.Any.fromFunction0(value))
      
      inline def setToEpochMilli(value: () => Double): Self = StObject.set(x, "toEpochMilli", js.Any.fromFunction0(value))
    }
  }
}
