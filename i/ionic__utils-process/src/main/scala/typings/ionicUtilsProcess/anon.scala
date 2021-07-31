package typings.ionicUtilsProcess

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Interval extends StObject {
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Interval {
    
    @scala.inline
    def apply(): Interval = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Interval]
    }
    
    @scala.inline
    implicit class IntervalMutableBuilder[Self <: Interval] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
