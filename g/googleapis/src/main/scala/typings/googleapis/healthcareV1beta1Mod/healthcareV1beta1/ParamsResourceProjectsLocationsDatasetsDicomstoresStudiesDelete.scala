package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The path of the DeleteStudy request. For example, `studies/{study_uid\}`.
    */
  var dicomWebPath: js.UndefOr[String] = js.undefined
  
  /**
    *
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsDicomstoresStudiesDelete](x: Self) {
    
    inline def setDicomWebPath(value: String): Self = StObject.set(x, "dicomWebPath", value.asInstanceOf[js.Any])
    
    inline def setDicomWebPathUndefined: Self = StObject.set(x, "dicomWebPath", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
