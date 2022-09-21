package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3ListProcessorVersionsResponse extends StObject {
  
  /**
    * Points to the next processor, otherwise empty.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of processors.
    */
  var processorVersions: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta3ProcessorVersion]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3ListProcessorVersionsResponse {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3ListProcessorVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3ListProcessorVersionsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3ListProcessorVersionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProcessorVersions(value: js.Array[SchemaGoogleCloudDocumentaiV1beta3ProcessorVersion]): Self = StObject.set(x, "processorVersions", value.asInstanceOf[js.Any])
    
    inline def setProcessorVersionsUndefined: Self = StObject.set(x, "processorVersions", js.undefined)
    
    inline def setProcessorVersionsVarargs(value: SchemaGoogleCloudDocumentaiV1beta3ProcessorVersion*): Self = StObject.set(x, "processorVersions", js.Array(value*))
  }
}
