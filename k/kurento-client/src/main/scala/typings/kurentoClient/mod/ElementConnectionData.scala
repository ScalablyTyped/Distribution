package typings.kurentoClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementConnectionData extends StObject {
  
  var sink: MediaElement
  
  var sinkDescription: String
  
  var source: MediaElement
  
  var sourceDescription: String
  
  var `type`: MediaType
}
object ElementConnectionData {
  
  inline def apply(
    sink: MediaElement,
    sinkDescription: String,
    source: MediaElement,
    sourceDescription: String,
    `type`: MediaType
  ): ElementConnectionData = {
    val __obj = js.Dynamic.literal(sink = sink.asInstanceOf[js.Any], sinkDescription = sinkDescription.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], sourceDescription = sourceDescription.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementConnectionData]
  }
  
  extension [Self <: ElementConnectionData](x: Self) {
    
    inline def setSink(value: MediaElement): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    inline def setSinkDescription(value: String): Self = StObject.set(x, "sinkDescription", value.asInstanceOf[js.Any])
    
    inline def setSource(value: MediaElement): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceDescription(value: String): Self = StObject.set(x, "sourceDescription", value.asInstanceOf[js.Any])
    
    inline def setType(value: MediaType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
