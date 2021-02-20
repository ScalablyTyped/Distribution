package typings.kurentoClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementConnectionData extends StObject {
  
  var sink: WebRtcEndpoint = js.native
  
  var sinkDescription: String = js.native
  
  var source: WebRtcEndpoint = js.native
  
  var sourceDescription: String = js.native
  
  var `type`: js.Any = js.native
}
object ElementConnectionData {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class ElementConnectionDataMutableBuilder[Self <: ElementConnectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSink(value: WebRtcEndpoint): Self = StObject.set(x, "sink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSinkDescription(value: String): Self = StObject.set(x, "sinkDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: WebRtcEndpoint): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDescription(value: String): Self = StObject.set(x, "sourceDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
