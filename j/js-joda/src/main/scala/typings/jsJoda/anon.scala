package typings.jsJoda

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait ToDate extends StObject {
    
    def toDate(): Date = js.native
    
    def toEpochMilli(): Double = js.native
  }
  object ToDate {
    
    @scala.inline
    def apply(toDate: () => Date, toEpochMilli: () => Double): ToDate = {
      val __obj = js.Dynamic.literal(toDate = js.Any.fromFunction0(toDate), toEpochMilli = js.Any.fromFunction0(toEpochMilli))
      __obj.asInstanceOf[ToDate]
    }
    
    @scala.inline
    implicit class ToDateMutableBuilder[Self <: ToDate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToDate(value: () => Date): Self = StObject.set(x, "toDate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToEpochMilli(value: () => Double): Self = StObject.set(x, "toEpochMilli", js.Any.fromFunction0(value))
    }
  }
}
