package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1ListProcessorTypesResponse extends StObject {
  
  /**
    * Points to the next page, otherwise empty.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The processor types.
    */
  var processorTypes: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1ProcessorType]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1ListProcessorTypesResponse {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1ListProcessorTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1ListProcessorTypesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1ListProcessorTypesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProcessorTypes(value: js.Array[SchemaGoogleCloudDocumentaiV1ProcessorType]): Self = StObject.set(x, "processorTypes", value.asInstanceOf[js.Any])
    
    inline def setProcessorTypesUndefined: Self = StObject.set(x, "processorTypes", js.undefined)
    
    inline def setProcessorTypesVarargs(value: SchemaGoogleCloudDocumentaiV1ProcessorType*): Self = StObject.set(x, "processorTypes", js.Array(value*))
  }
}
