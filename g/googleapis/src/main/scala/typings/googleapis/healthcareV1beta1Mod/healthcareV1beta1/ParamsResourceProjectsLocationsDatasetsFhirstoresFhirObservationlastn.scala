package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsFhirstoresFhirObservationlastn
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the FHIR store to retrieve resources from.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsFhirstoresFhirObservationlastn {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsFhirstoresFhirObservationlastn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsFhirstoresFhirObservationlastn]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirObservationlastn](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
