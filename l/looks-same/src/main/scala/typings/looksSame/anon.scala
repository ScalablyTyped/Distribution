package typings.looksSame

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Tolerance extends StObject {
    
    var tolerance: Double
  }
  object Tolerance {
    
    @scala.inline
    def apply(tolerance: Double): Tolerance = {
      val __obj = js.Dynamic.literal(tolerance = tolerance.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tolerance]
    }
    
    @scala.inline
    implicit class ToleranceMutableBuilder[Self <: Tolerance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    }
  }
}
