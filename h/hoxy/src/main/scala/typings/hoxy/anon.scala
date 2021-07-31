package typings.hoxy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<hoxy.hoxy.Slow> */
  trait PartialSlow extends StObject {
    
    var down: js.UndefOr[Double] = js.undefined
    
    var latency: js.UndefOr[Double] = js.undefined
    
    var rate: js.UndefOr[Double] = js.undefined
    
    var up: js.UndefOr[Double] = js.undefined
  }
  object PartialSlow {
    
    @scala.inline
    def apply(): PartialSlow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSlow]
    }
    
    @scala.inline
    implicit class PartialSlowMutableBuilder[Self <: PartialSlow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDown(value: Double): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      @scala.inline
      def setLatency(value: Double): Self = StObject.set(x, "latency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatencyUndefined: Self = StObject.set(x, "latency", js.undefined)
      
      @scala.inline
      def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
      
      @scala.inline
      def setUp(value: Double): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
    }
  }
}
