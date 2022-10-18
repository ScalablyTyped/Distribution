package typings.grpcGrpcJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Service extends StObject {
  
  var service: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _grpc_channelz_v1_ChannelzDefinition */ scala.Any
}
object Service {
  
  inline def apply(
    service: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _grpc_channelz_v1_ChannelzDefinition */ scala.Any
  ): Service = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
  
  extension [Self <: Service](x: Self) {
    
    inline def setService(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _grpc_channelz_v1_ChannelzDefinition */ scala.Any
    ): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
