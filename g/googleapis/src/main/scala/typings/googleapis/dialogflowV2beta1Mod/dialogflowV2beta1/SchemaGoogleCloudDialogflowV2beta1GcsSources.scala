package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1GcsSources extends StObject {
  
  /**
    * Required. Google Cloud Storage URIs for the inputs. A URI is of the form: gs://bucket/object-prefix-or-name Whether a prefix or name is used depends on the use case.
    */
  var uris: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1GcsSources {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1GcsSources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1GcsSources]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1GcsSources](x: Self) {
    
    inline def setUris(value: js.Array[String]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    inline def setUrisNull: Self = StObject.set(x, "uris", null)
    
    inline def setUrisUndefined: Self = StObject.set(x, "uris", js.undefined)
    
    inline def setUrisVarargs(value: String*): Self = StObject.set(x, "uris", js.Array(value*))
  }
}
