package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1GcsDestination extends StObject {
  
  /**
    * Required. The Google Cloud Storage URIs for the output. A URI is of the form: gs://bucket/object-prefix-or-name Whether a prefix or name is used depends on the use case. The requesting user must have "write-permission" to the bucket.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1GcsDestination {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1GcsDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1GcsDestination]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1GcsDestination](x: Self) {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
