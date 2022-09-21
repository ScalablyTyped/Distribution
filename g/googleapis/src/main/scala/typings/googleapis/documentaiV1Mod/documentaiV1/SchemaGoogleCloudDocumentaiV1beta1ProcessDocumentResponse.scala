package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta1ProcessDocumentResponse extends StObject {
  
  /**
    * Information about the input file. This is the same as the corresponding input config in the request.
    */
  var inputConfig: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta1InputConfig] = js.undefined
  
  /**
    * The output location of the parsed responses. The responses are written to this location as JSON-serialized `Document` objects.
    */
  var outputConfig: js.UndefOr[SchemaGoogleCloudDocumentaiV1beta1OutputConfig] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta1ProcessDocumentResponse {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta1ProcessDocumentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta1ProcessDocumentResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta1ProcessDocumentResponse](x: Self) {
    
    inline def setInputConfig(value: SchemaGoogleCloudDocumentaiV1beta1InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    inline def setOutputConfig(value: SchemaGoogleCloudDocumentaiV1beta1OutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
