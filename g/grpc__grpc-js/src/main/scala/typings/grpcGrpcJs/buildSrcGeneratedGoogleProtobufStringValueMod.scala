package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGeneratedGoogleProtobufStringValueMod {
  
  trait StringValue extends StObject {
    
    var value: js.UndefOr[String] = js.undefined
  }
  object StringValue {
    
    inline def apply(): StringValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StringValue]
    }
    
    extension [Self <: StringValue](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait StringValueOutput extends StObject {
    
    var value: String
  }
  object StringValueOutput {
    
    inline def apply(value: String): StringValueOutput = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StringValueOutput]
    }
    
    extension [Self <: StringValueOutput](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
