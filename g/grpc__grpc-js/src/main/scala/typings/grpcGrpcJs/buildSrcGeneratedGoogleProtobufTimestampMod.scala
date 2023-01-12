package typings.grpcGrpcJs

import typings.grpcProtoLoader.mod.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGeneratedGoogleProtobufTimestampMod {
  
  trait Timestamp extends StObject {
    
    var nanos: js.UndefOr[Double] = js.undefined
    
    var seconds: js.UndefOr[Double | String | Long] = js.undefined
  }
  object Timestamp {
    
    inline def apply(): Timestamp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Timestamp]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Timestamp] (val x: Self) extends AnyVal {
      
      inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
      
      inline def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
      
      inline def setSeconds(value: Double | String | Long): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
    }
  }
  
  trait TimestampOutput extends StObject {
    
    var nanos: Double
    
    var seconds: String
  }
  object TimestampOutput {
    
    inline def apply(nanos: Double, seconds: String): TimestampOutput = {
      val __obj = js.Dynamic.literal(nanos = nanos.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimestampOutput]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimestampOutput] (val x: Self) extends AnyVal {
      
      inline def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
      
      inline def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    }
  }
}
