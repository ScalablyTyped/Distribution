package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaImportAnnotationsRequest extends StObject {
  
  var gcsSource: js.UndefOr[SchemaGoogleCloudHealthcareV1beta1AnnotationGcsSource] = js.undefined
}
object SchemaImportAnnotationsRequest {
  
  inline def apply(): SchemaImportAnnotationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportAnnotationsRequest]
  }
  
  extension [Self <: SchemaImportAnnotationsRequest](x: Self) {
    
    inline def setGcsSource(value: SchemaGoogleCloudHealthcareV1beta1AnnotationGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}
