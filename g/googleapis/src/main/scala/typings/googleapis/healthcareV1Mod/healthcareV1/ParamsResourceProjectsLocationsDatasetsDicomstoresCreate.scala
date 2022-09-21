package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsDicomstoresCreate
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the DICOM store that is being created. Any string value up to 256 characters in length.
    */
  var dicomStoreId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the dataset this DICOM store belongs to.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaDicomStore] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsDicomstoresCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsDicomstoresCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsDicomstoresCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsDicomstoresCreate](x: Self) {
    
    inline def setDicomStoreId(value: String): Self = StObject.set(x, "dicomStoreId", value.asInstanceOf[js.Any])
    
    inline def setDicomStoreIdUndefined: Self = StObject.set(x, "dicomStoreId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaDicomStore): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
