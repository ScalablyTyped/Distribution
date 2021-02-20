package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDatalabelingV1beta1GcsSource extends StObject {
  
  /** Required. The input URI of source file. This must be a Cloud Storage path (`gs://...`). */
  var inputUri: js.UndefOr[String] = js.native
  
  /** Required. The format of the source file. Only "text/csv" is supported. */
  var mimeType: js.UndefOr[String] = js.native
}
object GoogleCloudDatalabelingV1beta1GcsSource {
  
  @scala.inline
  def apply(): GoogleCloudDatalabelingV1beta1GcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1GcsSource]
  }
  
  @scala.inline
  implicit class GoogleCloudDatalabelingV1beta1GcsSourceMutableBuilder[Self <: GoogleCloudDatalabelingV1beta1GcsSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputUri(value: String): Self = StObject.set(x, "inputUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUriUndefined: Self = StObject.set(x, "inputUri", js.undefined)
    
    @scala.inline
    def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
