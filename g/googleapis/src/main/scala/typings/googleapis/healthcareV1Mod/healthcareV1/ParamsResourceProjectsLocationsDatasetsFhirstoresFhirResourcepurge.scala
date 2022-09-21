package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsFhirstoresFhirResourcepurge
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the resource to purge.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsFhirstoresFhirResourcepurge {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsFhirstoresFhirResourcepurge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsFhirstoresFhirResourcepurge]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirResourcepurge](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
