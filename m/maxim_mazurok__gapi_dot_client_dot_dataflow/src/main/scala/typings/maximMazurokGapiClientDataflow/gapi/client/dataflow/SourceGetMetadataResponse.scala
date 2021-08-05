package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceGetMetadataResponse extends StObject {
  
  /** The computed metadata. */
  var metadata: js.UndefOr[SourceMetadata] = js.undefined
}
object SourceGetMetadataResponse {
  
  inline def apply(): SourceGetMetadataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceGetMetadataResponse]
  }
  
  extension [Self <: SourceGetMetadataResponse](x: Self) {
    
    inline def setMetadata(value: SourceMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
