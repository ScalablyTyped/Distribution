package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingStageLocation extends StObject {
  
  /** Identifies the particular stream within the streaming Dataflow job. */
  var streamId: js.UndefOr[String] = js.undefined
}
object StreamingStageLocation {
  
  @scala.inline
  def apply(): StreamingStageLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingStageLocation]
  }
  
  @scala.inline
  implicit class StreamingStageLocationMutableBuilder[Self <: StreamingStageLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
  }
}
