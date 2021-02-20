package typings.long

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait High extends StObject {
    
    var high: Double = js.native
    
    var low: Double = js.native
    
    var unsigned: Boolean = js.native
  }
  object High {
    
    @scala.inline
    def apply(high: Double, low: Double, unsigned: Boolean): High = {
      val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], unsigned = unsigned.asInstanceOf[js.Any])
      __obj.asInstanceOf[High]
    }
    
    @scala.inline
    implicit class HighMutableBuilder[Self <: High] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsigned(value: Boolean): Self = StObject.set(x, "unsigned", value.asInstanceOf[js.Any])
    }
  }
}
