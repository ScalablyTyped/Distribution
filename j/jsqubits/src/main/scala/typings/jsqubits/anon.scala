package typings.jsqubits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DecimalPlaces extends StObject {
    
    var decimalPlaces: js.UndefOr[Double] = js.undefined
  }
  object DecimalPlaces {
    
    @scala.inline
    def apply(): DecimalPlaces = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecimalPlaces]
    }
    
    @scala.inline
    implicit class DecimalPlacesMutableBuilder[Self <: DecimalPlaces] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecimalPlaces(value: Double): Self = StObject.set(x, "decimalPlaces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecimalPlacesUndefined: Self = StObject.set(x, "decimalPlaces", js.undefined)
    }
  }
}
