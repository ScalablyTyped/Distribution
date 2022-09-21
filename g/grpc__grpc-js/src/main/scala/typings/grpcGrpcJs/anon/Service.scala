package typings.grpcGrpcJs.anon

import typings.grpcGrpcJs.v1ChannelzMod.ChannelzDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Service extends StObject {
  
  var service: ChannelzDefinition
}
object Service {
  
  inline def apply(service: ChannelzDefinition): Service = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Service]
  }
  
  extension [Self <: Service](x: Self) {
    
    inline def setService(value: ChannelzDefinition): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
  }
}
