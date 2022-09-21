package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3ExportTestCasesResponse extends StObject {
  
  /**
    * Uncompressed raw byte content for test cases.
    */
  var content: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URI to a file containing the exported test cases. This field is populated only if `gcs_uri` is specified in ExportTestCasesRequest.
    */
  var gcsUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3ExportTestCasesResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3ExportTestCasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3ExportTestCasesResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3ExportTestCasesResponse](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setGcsUri(value: String): Self = StObject.set(x, "gcsUri", value.asInstanceOf[js.Any])
    
    inline def setGcsUriNull: Self = StObject.set(x, "gcsUri", null)
    
    inline def setGcsUriUndefined: Self = StObject.set(x, "gcsUri", js.undefined)
  }
}
