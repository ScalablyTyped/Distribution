package typings.ionicCore

import typings.ionicCore.anon.Lower
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeInterfaceMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicCore.ionicCoreStrings.A
    - typings.ionicCore.ionicCoreStrings.B
    - scala.Unit
  */
  type KnobName = js.UndefOr[_KnobName]
  
  trait RangeChangeEventDetail extends StObject {
    
    var value: RangeValue
  }
  object RangeChangeEventDetail {
    
    @scala.inline
    def apply(value: RangeValue): RangeChangeEventDetail = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeChangeEventDetail]
    }
    
    @scala.inline
    implicit class RangeChangeEventDetailMutableBuilder[Self <: RangeChangeEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: RangeValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type RangeValue = Double | Lower
  
  trait _KnobName extends StObject
}
