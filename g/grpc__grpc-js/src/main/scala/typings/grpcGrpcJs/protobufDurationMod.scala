package typings.grpcGrpcJs

import typings.grpcProtoLoader.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protobufDurationMod {
  
  trait Duration extends StObject {
    
    var nanos: js.UndefOr[Double] = js.undefined
    
    var seconds: js.UndefOr[Double | String | Long] = js.undefined
  }
  object Duration {
    
    inline def apply(): Duration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Duration]
    }
    
    extension [Self <: Duration](x: Self) {
      
      inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
      
      inline def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
      
      inline def setSeconds(value: Double | String | Long): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
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
    
    extension [Self <: DurationOutput](x: Self) {
      
      inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
}
