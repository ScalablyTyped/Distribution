package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchParameter extends StObject {
  
  /**
    * The canonical url of the search parameter resource.
    */
  var canonicalUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The versioned name of the search parameter resource. The format is projects/{project-id\}/locations/{location\}/datasets/{dataset-id\}/fhirStores/{fhirStore-id\}/fhir/SearchParameter/{resource-id\}/_history/{version-id\} For fhir stores with disable_resource_versioning=true, the format is projects/{project-id\}/locations/{location\}/datasets/{dataset-id\}/fhirStores/{fhirStore-id\}/fhir/SearchParameter/{resource-id\}/
    */
  var parameter: js.UndefOr[String | Null] = js.undefined
}
object SchemaSearchParameter {
  
  inline def apply(): SchemaSearchParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchParameter]
  }
  
  extension [Self <: SchemaSearchParameter](x: Self) {
    
    inline def setCanonicalUrl(value: String): Self = StObject.set(x, "canonicalUrl", value.asInstanceOf[js.Any])
    
    inline def setCanonicalUrlNull: Self = StObject.set(x, "canonicalUrl", null)
    
    inline def setCanonicalUrlUndefined: Self = StObject.set(x, "canonicalUrl", js.undefined)
    
    inline def setParameter(value: String): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterNull: Self = StObject.set(x, "parameter", null)
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
  }
}
