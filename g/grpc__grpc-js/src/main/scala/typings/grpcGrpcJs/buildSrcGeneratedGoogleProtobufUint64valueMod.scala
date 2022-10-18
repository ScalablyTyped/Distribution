package typings.grpcGrpcJs

import typings.grpcProtoLoader.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGeneratedGoogleProtobufUint64valueMod {
  
  trait UInt64Value extends StObject {
    
    var value: js.UndefOr[Double | String | Long] = js.undefined
  }
  object UInt64Value {
    
    inline def apply(): UInt64Value = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UInt64Value]
    }
    
    extension [Self <: UInt64Value](x: Self) {
      
      inline def setValue(value: Double | String | Long): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait UInt64ValueOutput extends StObject {
    
    var value: String
  }
  object UInt64ValueOutput {
    
    inline def apply(value: String): UInt64ValueOutput = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[UInt64ValueOutput]
    }
    
    extension [Self <: UInt64ValueOutput](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
