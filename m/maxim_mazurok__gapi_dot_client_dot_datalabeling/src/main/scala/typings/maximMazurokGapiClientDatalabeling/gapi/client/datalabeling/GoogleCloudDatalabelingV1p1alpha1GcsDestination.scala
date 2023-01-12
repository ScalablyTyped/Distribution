package typings.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1p1alpha1GcsDestination extends StObject {
  
  /** Required. The format of the gcs destination. Only "text/csv" and "application/json" are supported. */
  var mimeType: js.UndefOr[String] = js.undefined
  
  /** Required. The output uri of destination file. */
  var outputUri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDatalabelingV1p1alpha1GcsDestination {
  
  inline def apply(): GoogleCloudDatalabelingV1p1alpha1GcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1p1alpha1GcsDestination]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDatalabelingV1p1alpha1GcsDestination] (val x: Self) extends AnyVal {
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setOutputUri(value: String): Self = StObject.set(x, "outputUri", value.asInstanceOf[js.Any])
    
    inline def setOutputUriUndefined: Self = StObject.set(x, "outputUri", js.undefined)
  }
}
