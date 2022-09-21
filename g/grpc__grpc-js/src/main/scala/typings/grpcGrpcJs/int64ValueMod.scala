package typings.grpcGrpcJs

import typings.grpcProtoLoader.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object int64ValueMod {
  
  trait Int64Value extends StObject {
    
    var value: js.UndefOr[Double | String | Long] = js.undefined
  }
  object Int64Value {
    
    inline def apply(): Int64Value = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Int64Value]
    }
    
    extension [Self <: Int64Value](x: Self) {
      
      inline def setValue(value: Double | String | Long): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Int64ValueOutput extends StObject {
    
    var value: String
  }
  object Int64ValueOutput {
    
    inline def apply(value: String): Int64ValueOutput = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Int64ValueOutput]
    }
    
    extension [Self <: Int64ValueOutput](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
