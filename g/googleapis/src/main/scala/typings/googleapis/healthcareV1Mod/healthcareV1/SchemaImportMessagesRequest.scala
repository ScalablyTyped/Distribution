package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImportMessagesRequest extends StObject {
  
  /**
    * Cloud Storage source data location and import configuration. The Cloud Healthcare Service Agent requires the `roles/storage.objectViewer` Cloud IAM roles on the Cloud Storage location.
    */
  var gcsSource: js.UndefOr[SchemaGcsSource] = js.undefined
}
object SchemaImportMessagesRequest {
  
  inline def apply(): SchemaImportMessagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportMessagesRequest]
  }
  
  extension [Self <: SchemaImportMessagesRequest](x: Self) {
    
    inline def setGcsSource(value: SchemaGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
