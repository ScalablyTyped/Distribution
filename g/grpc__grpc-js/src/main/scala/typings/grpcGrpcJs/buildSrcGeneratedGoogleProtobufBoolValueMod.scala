package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGeneratedGoogleProtobufBoolValueMod {
  
  trait BoolValue extends StObject {
    
    var value: js.UndefOr[Boolean] = js.undefined
  }
  object BoolValue {
    
    inline def apply(): BoolValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoolValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BoolValue] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait BoolValueOutput extends StObject {
    
    var value: Boolean
  }
  object BoolValueOutput {
    
    inline def apply(value: Boolean): BoolValueOutput = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoolValueOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BoolValueOutput] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
