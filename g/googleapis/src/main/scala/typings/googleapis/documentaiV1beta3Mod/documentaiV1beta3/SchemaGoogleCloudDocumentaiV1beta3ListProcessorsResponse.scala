package typings.googleapis.documentaiV1beta3Mod.documentaiV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta3ListProcessorsResponse extends StObject {
  
  /**
    * Points to the next processor, otherwise empty.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of processors.
    */
  var processors: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta3Processor]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta3ListProcessorsResponse {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta3ListProcessorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta3ListProcessorsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta3ListProcessorsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProcessors(value: js.Array[SchemaGoogleCloudDocumentaiV1beta3Processor]): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
    
    inline def setProcessorsUndefined: Self = StObject.set(x, "processors", js.undefined)
    
    inline def setProcessorsVarargs(value: SchemaGoogleCloudDocumentaiV1beta3Processor*): Self = StObject.set(x, "processors", js.Array(value*))
  }
}
