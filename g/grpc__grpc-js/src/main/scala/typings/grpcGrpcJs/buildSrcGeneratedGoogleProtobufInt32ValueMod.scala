package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGeneratedGoogleProtobufInt32ValueMod {
  
  trait Int32Value extends StObject {
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object Int32Value {
    
    inline def apply(): Int32Value = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Int32Value]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Int32Value] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Int32ValueOutput extends StObject {
    
    var value: Double
  }
  object Int32ValueOutput {
    
    inline def apply(value: Double): Int32ValueOutput = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Int32ValueOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Int32ValueOutput] (val x: Self) extends AnyVal {
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
