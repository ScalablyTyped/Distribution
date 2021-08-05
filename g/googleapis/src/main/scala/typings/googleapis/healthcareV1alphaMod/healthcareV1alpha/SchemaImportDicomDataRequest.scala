package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Imports data into the specified DICOM store. Returns an error if any of the
  * files to import are not DICOM files. This API will accept duplicate DICOM
  * instances, by simply ignoring the newly pushed instance (it will not
  * overwrite).
  */
trait SchemaImportDicomDataRequest extends StObject {
  
  /**
    * Specifies where the imported data resides.
    */
  var inputConfig: js.UndefOr[SchemaInputConfig] = js.undefined
}
object SchemaImportDicomDataRequest {
  
  inline def apply(): SchemaImportDicomDataRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaImportDicomDataRequest]
  }
  
  extension [Self <: SchemaImportDicomDataRequest](x: Self) {
    
    inline def setInputConfig(value: SchemaInputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
  }
}
