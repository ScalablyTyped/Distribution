package typings.grpcGrpcJs

import org.scalablytyped.runtime.Instantiable1
import typings.grpcGrpcJs.anon.Channelz
import typings.grpcGrpcJs.anon.Protobuf
import typings.std.ConstructorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generatedChannelzMod {
  
  trait ProtoGrpcType extends StObject {
    
    var google: Protobuf
    
    var grpc: Channelz
  }
  object ProtoGrpcType {
    
    inline def apply(google: Protobuf, grpc: Channelz): ProtoGrpcType = {
      val __obj = js.Dynamic.literal(google = google.asInstanceOf[js.Any], grpc = grpc.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtoGrpcType]
    }
    
    extension [Self <: ProtoGrpcType](x: Self) {
      
      inline def setGoogle(value: Protobuf): Self = StObject.set(x, "google", value.asInstanceOf[js.Any])
      
      inline def setGrpc(value: Channelz): Self = StObject.set(x, "grpc", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SubtypeConstructor[Constructor /* <: Instantiable1[/* args */ Any, Any] */, Subtype]
    extends StObject
       with Instantiable1[/* args */ ConstructorParameters[Constructor], Subtype]
}
