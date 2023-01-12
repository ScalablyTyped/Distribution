package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGeneratedGoogleProtobufUint32valueMod {
  
  trait UInt32Value extends StObject {
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object UInt32Value {
    
    inline def apply(): UInt32Value = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UInt32Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UInt32Value] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait UInt32ValueOutput extends StObject {
    
    var value: Double
  }
  object UInt32ValueOutput {
    
    inline def apply(value: Double): UInt32ValueOutput = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[UInt32ValueOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UInt32ValueOutput] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
