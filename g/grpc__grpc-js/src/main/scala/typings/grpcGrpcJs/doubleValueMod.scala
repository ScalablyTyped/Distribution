package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object doubleValueMod {
  
  trait DoubleValue extends StObject {
    
    var value: js.UndefOr[Double | String] = js.undefined
  }
  object DoubleValue {
    
    inline def apply(): DoubleValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleValue]
    }
    
    extension [Self <: DoubleValue](x: Self) {
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait DoubleValueOutput extends StObject {
    
    var value: Double
  }
  object DoubleValueOutput {
    
    inline def apply(value: Double): DoubleValueOutput = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DoubleValueOutput]
    }
    
    extension [Self <: DoubleValueOutput](x: Self) {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
