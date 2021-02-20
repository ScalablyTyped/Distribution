package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamLocation extends StObject {
  
  /** The stream is a custom source. */
  var customSourceLocation: js.UndefOr[CustomSourceLocation] = js.native
  
  /** The stream is a pubsub stream. */
  var pubsubLocation: js.UndefOr[PubsubLocation] = js.native
  
  /** The stream is a streaming side input. */
  var sideInputLocation: js.UndefOr[StreamingSideInputLocation] = js.native
  
  /** The stream is part of another computation within the current streaming Dataflow job. */
  var streamingStageLocation: js.UndefOr[StreamingStageLocation] = js.native
}
object StreamLocation {
  
  @scala.inline
  def apply(): StreamLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamLocation]
  }
  
  @scala.inline
  implicit class StreamLocationMutableBuilder[Self <: StreamLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomSourceLocation(value: CustomSourceLocation): Self = StObject.set(x, "customSourceLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSourceLocationUndefined: Self = StObject.set(x, "customSourceLocation", js.undefined)
    
    @scala.inline
    def setPubsubLocation(value: PubsubLocation): Self = StObject.set(x, "pubsubLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubsubLocationUndefined: Self = StObject.set(x, "pubsubLocation", js.undefined)
    
    @scala.inline
    def setSideInputLocation(value: StreamingSideInputLocation): Self = StObject.set(x, "sideInputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideInputLocationUndefined: Self = StObject.set(x, "sideInputLocation", js.undefined)
    
    @scala.inline
    def setStreamingStageLocation(value: StreamingStageLocation): Self = StObject.set(x, "streamingStageLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamingStageLocationUndefined: Self = StObject.set(x, "streamingStageLocation", js.undefined)
  }
}
