package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1GcsSource extends StObject {
  
  /** Required. The input URI of source file. This must be a Cloud Storage path (`gs://...`). */
  var inputUri: js.UndefOr[String] = js.undefined
  
  /** Required. The format of the source file. Only "text/csv" is supported. */
  var mimeType: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1beta1GcsSource {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1GcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1GcsSource]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1GcsSource](x: Self) {
    
    inline def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    inline def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
