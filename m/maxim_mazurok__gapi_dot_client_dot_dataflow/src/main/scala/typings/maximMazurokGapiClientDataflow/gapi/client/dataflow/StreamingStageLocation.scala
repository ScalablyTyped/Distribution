package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamingStageLocation extends StObject {
  
  /** Identifies the particular stream within the streaming Dataflow job. */
  var streamId: js.UndefOr[String] = js.undefined
}
object StreamingStageLocation {
  
  inline def apply(): StreamingStageLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamingStageLocation]
  }
  
  extension [Self <: StreamingStageLocation](x: Self) {
    
    inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
  }
}
