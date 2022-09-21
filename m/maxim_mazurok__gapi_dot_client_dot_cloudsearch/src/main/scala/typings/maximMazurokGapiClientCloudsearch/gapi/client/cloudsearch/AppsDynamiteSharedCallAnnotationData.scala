package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteSharedCallAnnotationData extends StObject {
  
  /** Timestamp when the call ended. Used to render the call ended system message. */
  var callEndedTimestamp: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Call metadata required to create the call artifacts. For now, the metadata contains only the call id to identify the call. This field allows additional data (e.g. voice
    * call type) to be added if needed in the future.
    */
  var callMetadata: js.UndefOr[AppsDynamiteSharedCallMetadata] = js.undefined
  
  /** Required. Indicates the call status for the space. Used to determine the chip's state. */
  var callStatus: js.UndefOr[String] = js.undefined
}
object AppsDynamiteSharedCallAnnotationData {
  
  inline def apply(): AppsDynamiteSharedCallAnnotationData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteSharedCallAnnotationData]
  }
  
  extension [Self <: AppsDynamiteSharedCallAnnotationData](x: Self) {
    
    inline def setCallEndedTimestamp(value: String): Self = StObject.set(x, "callEndedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCallEndedTimestampUndefined: Self = StObject.set(x, "callEndedTimestamp", js.undefined)
    
    inline def setCallMetadata(value: AppsDynamiteSharedCallMetadata): Self = StObject.set(x, "callMetadata", value.asInstanceOf[js.Any])
    
    inline def setCallMetadataUndefined: Self = StObject.set(x, "callMetadata", js.undefined)
    
    inline def setCallStatus(value: String): Self = StObject.set(x, "callStatus", value.asInstanceOf[js.Any])
    
    inline def setCallStatusUndefined: Self = StObject.set(x, "callStatus", js.undefined)
  }
}
