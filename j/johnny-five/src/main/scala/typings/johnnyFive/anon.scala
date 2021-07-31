package typings.johnnyFive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Abbr extends StObject {
    
    var abbr: String
    
    var heading: Double
    
    var high: Double
    
    var low: Double
    
    var name: String
  }
  object Abbr {
    
    @scala.inline
    def apply(abbr: String, heading: Double, high: Double, low: Double, name: String): Abbr = {
      val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Abbr]
    }
    
    @scala.inline
    implicit class AbbrMutableBuilder[Self <: Abbr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbbr(value: String): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
