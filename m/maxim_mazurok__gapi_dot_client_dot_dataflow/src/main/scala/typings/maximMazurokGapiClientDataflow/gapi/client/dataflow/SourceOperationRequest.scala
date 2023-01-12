package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceOperationRequest extends StObject {
  
  /** Information about a request to get metadata about a source. */
  var getMetadata: js.UndefOr[SourceGetMetadataRequest] = js.undefined
  
  /** User-provided name of the Read instruction for this source. */
  var name: js.UndefOr[String] = js.undefined
  
  /** System-defined name for the Read instruction for this source in the original workflow graph. */
  var originalName: js.UndefOr[String] = js.undefined
  
  /** Information about a request to split a source. */
  var split: js.UndefOr[SourceSplitRequest] = js.undefined
  
  /** System-defined name of the stage containing the source operation. Unique across the workflow. */
  var stageName: js.UndefOr[String] = js.undefined
  
  /** System-defined name of the Read instruction for this source. Unique across the workflow. */
  var systemName: js.UndefOr[String] = js.undefined
}
object SourceOperationRequest {
  
  inline def apply(): SourceOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceOperationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceOperationRequest] (val x: Self) extends AnyVal {
    
    inline def setGetMetadata(value: SourceGetMetadataRequest): Self = StObject.set(x, "getMetadata", value.asInstanceOf[js.Any])
    
    inline def setGetMetadataUndefined: Self = StObject.set(x, "getMetadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    inline def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    
    inline def setSplit(value: SourceSplitRequest): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    
    inline def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    inline def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    
    inline def setSystemName(value: String): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
    
    inline def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
  }
}
