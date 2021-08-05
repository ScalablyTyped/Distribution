package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceGetMetadataRequest extends StObject {
  
  /** Specification of the source whose metadata should be computed. */
  var source: js.UndefOr[Source] = js.undefined
}
object SourceGetMetadataRequest {
  
  inline def apply(): SourceGetMetadataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceGetMetadataRequest]
  }
  
  extension [Self <: SourceGetMetadataRequest](x: Self) {
    
    inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
