package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamLocation extends StObject {
  
  /** The stream is a custom source. */
  var customSourceLocation: js.UndefOr[CustomSourceLocation] = js.undefined
  
  /** The stream is a pubsub stream. */
  var pubsubLocation: js.UndefOr[PubsubLocation] = js.undefined
  
  /** The stream is a streaming side input. */
  var sideInputLocation: js.UndefOr[StreamingSideInputLocation] = js.undefined
  
  /** The stream is part of another computation within the current streaming Dataflow job. */
  var streamingStageLocation: js.UndefOr[StreamingStageLocation] = js.undefined
}
object StreamLocation {
  
  inline def apply(): StreamLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamLocation] (val x: Self) extends AnyVal {
    
    inline def setCustomSourceLocation(value: CustomSourceLocation): Self = StObject.set(x, "customSourceLocation", value.asInstanceOf[js.Any])
    
    inline def setCustomSourceLocationUndefined: Self = StObject.set(x, "customSourceLocation", js.undefined)
    
    inline def setPubsubLocation(value: PubsubLocation): Self = StObject.set(x, "pubsubLocation", value.asInstanceOf[js.Any])
    
    inline def setPubsubLocationUndefined: Self = StObject.set(x, "pubsubLocation", js.undefined)
    
    inline def setSideInputLocation(value: StreamingSideInputLocation): Self = StObject.set(x, "sideInputLocation", value.asInstanceOf[js.Any])
    
    inline def setSideInputLocationUndefined: Self = StObject.set(x, "sideInputLocation", js.undefined)
    
    inline def setStreamingStageLocation(value: StreamingStageLocation): Self = StObject.set(x, "streamingStageLocation", value.asInstanceOf[js.Any])
    
    inline def setStreamingStageLocationUndefined: Self = StObject.set(x, "streamingStageLocation", js.undefined)
  }
}
