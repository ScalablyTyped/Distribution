package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConceptmaptranslate
  extends StObject
     with StandardParameters {
  
  /**
    * The code to translate.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the concept map to use. If unset, the most current version is used.
    */
  var conceptMapVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The URL for the concept map to use for the translation.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The system for the code to be translated.
    */
  var system: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConceptmaptranslate {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConceptmaptranslate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConceptmaptranslate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConceptmaptranslate](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setConceptMapVersion(value: String): Self = StObject.set(x, "conceptMapVersion", value.asInstanceOf[js.Any])
    
    inline def setConceptMapVersionUndefined: Self = StObject.set(x, "conceptMapVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
  }
}
