package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1FetchProcessorTypesResponse extends StObject {
  
  /**
    * The list of processor types.
    */
  var processorTypes: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1ProcessorType]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1FetchProcessorTypesResponse {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1FetchProcessorTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1FetchProcessorTypesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1FetchProcessorTypesResponse](x: Self) {
    
    inline def setProcessorTypes(value: js.Array[SchemaGoogleCloudDocumentaiV1ProcessorType]): Self = StObject.set(x, "processorTypes", value.asInstanceOf[js.Any])
    
    inline def setProcessorTypesUndefined: Self = StObject.set(x, "processorTypes", js.undefined)
    
    inline def setProcessorTypesVarargs(value: SchemaGoogleCloudDocumentaiV1ProcessorType*): Self = StObject.set(x, "processorTypes", js.Array(value*))
  }
}
