package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGeneratedGoogleProtobufUint64valueMod {
  
  trait UInt64Value extends StObject {
    
    var value: js.UndefOr[
        Double | String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
  }
  object UInt64Value {
    
    inline def apply(): UInt64Value = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UInt64Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UInt64Value] (val x: Self) extends AnyVal {
      
      inline def setValue(
        value: Double | String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UInt64ValueOutput] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
