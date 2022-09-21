package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsFhirstoresFhirCapabilities
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the FHIR store to retrieve the capabilities for.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsFhirstoresFhirCapabilities {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsFhirstoresFhirCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsFhirstoresFhirCapabilities]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirCapabilities](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
