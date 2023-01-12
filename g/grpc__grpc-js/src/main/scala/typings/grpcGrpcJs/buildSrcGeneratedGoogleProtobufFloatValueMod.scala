package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGeneratedGoogleProtobufFloatValueMod {
  
  trait FloatValue extends StObject {
    
    var value: js.UndefOr[Double | String] = js.undefined
  }
  object FloatValue {
    
    inline def apply(): FloatValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FloatValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FloatValue] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait FloatValueOutput extends StObject {
    
    var value: Double
  }
  object FloatValueOutput {
    
    inline def apply(value: Double): FloatValueOutput = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[FloatValueOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FloatValueOutput] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
