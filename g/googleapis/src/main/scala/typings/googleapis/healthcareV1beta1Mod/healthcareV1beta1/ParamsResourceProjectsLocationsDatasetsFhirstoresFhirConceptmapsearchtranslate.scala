package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConceptmapsearchtranslate
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
    * The name for the FHIR store containing the concept map(s) to use for the translation.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The source value set of the concept map to be used. If unset, target is used to search for concept maps.
    */
  var source: js.UndefOr[String] = js.undefined
  
  /**
    * The system for the code to be translated.
    */
  var system: js.UndefOr[String] = js.undefined
  
  /**
    * The target value set of the concept map to be used. If unset, source is used to search for concept maps.
    */
  var target: js.UndefOr[String] = js.undefined
  
  /**
    * The canonical url of the concept map to use. If unset, the source and target is used to search for concept maps.
    */
  var url: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConceptmapsearchtranslate {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConceptmapsearchtranslate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConceptmapsearchtranslate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsFhirstoresFhirConceptmapsearchtranslate](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setConceptMapVersion(value: String): Self = StObject.set(x, "conceptMapVersion", value.asInstanceOf[js.Any])
    
    inline def setConceptMapVersionUndefined: Self = StObject.set(x, "conceptMapVersion", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSystem(value: String): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
    
    inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
