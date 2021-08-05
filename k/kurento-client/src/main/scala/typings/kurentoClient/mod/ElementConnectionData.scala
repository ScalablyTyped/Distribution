package typings.kurentoClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementConnectionData extends StObject {
  
  var sink: WebRtcEndpoint
  
  var sinkDescription: String
  
  var source: WebRtcEndpoint
  
  var sourceDescription: String
  
  var `type`: js.Any
}
object ElementConnectionData {
  
  inline def apply(
    sink: WebRtcEndpoint,
    sinkDescription: String,
    source: WebRtcEndpoint,
    sourceDescription: String,
    `type`: js.Any
  ): ElementConnectionData = {
    val __obj = js.Dynamic.literal(sink = sink.asInstanceOf[js.Any], sinkDescription = sinkDescription.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceDescription = sourceDescription.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementConnectionData]
  }
  
  extension [Self <: ElementConnectionData](x: Self) {
    
    inline def setSink(value: WebRtcEndpoint): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    inline def setSinkDescription(value: String): Self = StObject.set(x, "sinkDescription", value.asInstanceOf[js.Any])
    
    inline def setSource(value: WebRtcEndpoint): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceDescription(value: String): Self = StObject.set(x, "sourceDescription", value.asInstanceOf[js.Any])
    
    inline def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
