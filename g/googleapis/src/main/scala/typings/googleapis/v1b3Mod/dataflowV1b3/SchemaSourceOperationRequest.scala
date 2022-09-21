package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSourceOperationRequest extends StObject {
  
  /**
    * Information about a request to get metadata about a source.
    */
  var getMetadata: js.UndefOr[SchemaSourceGetMetadataRequest] = js.undefined
  
  /**
    * User-provided name of the Read instruction for this source.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * System-defined name for the Read instruction for this source in the original workflow graph.
    */
  var originalName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Information about a request to split a source.
    */
  var split: js.UndefOr[SchemaSourceSplitRequest] = js.undefined
  
  /**
    * System-defined name of the stage containing the source operation. Unique across the workflow.
    */
  var stageName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * System-defined name of the Read instruction for this source. Unique across the workflow.
    */
  var systemName: js.UndefOr[String | Null] = js.undefined
}
object SchemaSourceOperationRequest {
  
  inline def apply(): SchemaSourceOperationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceOperationRequest]
  }
  
  extension [Self <: SchemaSourceOperationRequest](x: Self) {
    
    inline def setGetMetadata(value: SchemaSourceGetMetadataRequest): Self = StObject.set(x, "getMetadata", value.asInstanceOf[js.Any])
    
    inline def setGetMetadataUndefined: Self = StObject.set(x, "getMetadata", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOriginalName(value: String): Self = StObject.set(x, "originalName", value.asInstanceOf[js.Any])
    
    inline def setOriginalNameNull: Self = StObject.set(x, "originalName", null)
    
    inline def setOriginalNameUndefined: Self = StObject.set(x, "originalName", js.undefined)
    
    inline def setSplit(value: SchemaSourceSplitRequest): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    
    inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    
    inline def setStageName(value: String): Self = StObject.set(x, "stageName", value.asInstanceOf[js.Any])
    
    inline def setStageNameNull: Self = StObject.set(x, "stageName", null)
    
    inline def setStageNameUndefined: Self = StObject.set(x, "stageName", js.undefined)
    
    inline def setSystemName(value: String): Self = StObject.set(x, "systemName", value.asInstanceOf[js.Any])
    
    inline def setSystemNameNull: Self = StObject.set(x, "systemName", null)
    
    inline def setSystemNameUndefined: Self = StObject.set(x, "systemName", js.undefined)
  }
}
