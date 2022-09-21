package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDatalabelingV1p2alpha1GcsDestination extends StObject {
  
  /**
    * Required. The format of the gcs destination. Only "text/csv" and "application/json" are supported.
    */
  var mimeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The output uri of destination file.
    */
  var outputUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDatalabelingV1p2alpha1GcsDestination {
  
  inline def apply(): SchemaGoogleCloudDatalabelingV1p2alpha1GcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDatalabelingV1p2alpha1GcsDestination]
  }
  
  extension [Self <: SchemaGoogleCloudDatalabelingV1p2alpha1GcsDestination](x: Self) {
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setOutputUri(value: String): Self = StObject.set(x, "outputUri", value.asInstanceOf[js.Any])
    
    inline def setOutputUriNull: Self = StObject.set(x, "outputUri", null)
    
    inline def setOutputUriUndefined: Self = StObject.set(x, "outputUri", js.undefined)
  }
}
