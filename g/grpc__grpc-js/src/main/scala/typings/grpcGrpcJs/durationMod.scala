package typings.grpcGrpcJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object durationMod {
  
  @JSImport("@grpc/grpc-js/build/src/duration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def durationToMs(duration: Duration): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("durationToMs")(duration.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def isDuration(value: Any): /* is @grpc/grpc-js.@grpc/grpc-js/build/src/duration.Duration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDuration")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @grpc/grpc-js.@grpc/grpc-js/build/src/duration.Duration */ Boolean]
  
  inline def msToDuration(millis: Double): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("msToDuration")(millis.asInstanceOf[js.Any]).asInstanceOf[Duration]
  
  trait Duration extends StObject {
    
    var nanos: Double
    
    var seconds: Double
  }
  object Duration {
    
    inline def apply(nanos: Double, seconds: Double): Duration = {
      val __obj = js.Dynamic.literal(nanos = nanos.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[Duration]
    }
    
    extension [Self <: Duration](x: Self) {
      
      inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
}
