package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiUiv1beta3ExportProcessorVersionResponse extends StObject {
  
  /**
    * The Cloud Storage URI containing the output artifacts.
    */
  var gcsUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDocumentaiUiv1beta3ExportProcessorVersionResponse {
  
  inline def apply(): SchemaGoogleCloudDocumentaiUiv1beta3ExportProcessorVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiUiv1beta3ExportProcessorVersionResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiUiv1beta3ExportProcessorVersionResponse](x: Self) {
    
    inline def setGcsUri(value: String): Self = StObject.set(x, "gcsUri", value.asInstanceOf[js.Any])
    
    inline def setGcsUriNull: Self = StObject.set(x, "gcsUri", null)
    
    inline def setGcsUriUndefined: Self = StObject.set(x, "gcsUri", js.undefined)
  }
}
