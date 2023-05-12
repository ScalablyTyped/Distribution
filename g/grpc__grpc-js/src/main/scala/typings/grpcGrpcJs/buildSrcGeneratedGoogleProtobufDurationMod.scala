package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGeneratedGoogleProtobufDurationMod {
  
  trait Duration extends StObject {
    
    var nanos: js.UndefOr[Double] = js.undefined
    
    var seconds: js.UndefOr[
        Double | String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ] = js.undefined
  }
  object Duration {
    
    inline def apply(): Duration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Duration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Duration] (val x: Self) extends AnyVal {
      
      inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
      
      inline def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
      
      inline def setSeconds(
        value: Double | String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ Any)
      ): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
    }
  }
  
  trait DurationOutput extends StObject {
    
    var nanos: Double
    
    var seconds: String
  }
  object DurationOutput {
    
    inline def apply(nanos: Double, seconds: String): DurationOutput = {
      val __obj = js.Dynamic.literal(nanos = nanos.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[DurationOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DurationOutput] (val x: Self) extends AnyVal {
      
      inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
}
