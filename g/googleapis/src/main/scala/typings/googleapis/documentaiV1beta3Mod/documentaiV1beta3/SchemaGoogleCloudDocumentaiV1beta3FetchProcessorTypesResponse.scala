package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3FetchProcessorTypesResponse extends StObject {
  
  /**
    * The list of processor types.
    */
  var processorTypes: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta3ProcessorType]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3FetchProcessorTypesResponse {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3FetchProcessorTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3FetchProcessorTypesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3FetchProcessorTypesResponse](x: Self) {
    
    inline def setProcessorTypes(value: js.Array[SchemaGoogleCloudDocumentaiV1beta3ProcessorType]): Self = StObject.set(x, "processorTypes", value.asInstanceOf[js.Any])
    
    inline def setProcessorTypesUndefined: Self = StObject.set(x, "processorTypes", js.undefined)
    
    inline def setProcessorTypesVarargs(value: SchemaGoogleCloudDocumentaiV1beta3ProcessorType*): Self = StObject.set(x, "processorTypes", js.Array(value*))
  }
}
