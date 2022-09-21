package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigureSearchRequest extends StObject {
  
  /**
    * The canonical URLs of the search parameters that are intended to be used for the FHIR store. See https://www.hl7.org/fhir/references.html#canonical for explanation on FHIR canonical urls
    */
  var canonicalUrls: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * If `validate_only` is set to true, the method will compile all the search parameters without actually setting the search config for the store and triggering the reindex.
    */
  var validateOnly: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaConfigureSearchRequest {
  
  inline def apply(): SchemaConfigureSearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigureSearchRequest]
  }
  
  extension [Self <: SchemaConfigureSearchRequest](x: Self) {
    
    inline def setCanonicalUrls(value: js.Array[String]): Self = StObject.set(x, "canonicalUrls", value.asInstanceOf[js.Any])
    
    inline def setCanonicalUrlsNull: Self = StObject.set(x, "canonicalUrls", null)
    
    inline def setCanonicalUrlsUndefined: Self = StObject.set(x, "canonicalUrls", js.undefined)
    
    inline def setCanonicalUrlsVarargs(value: String*): Self = StObject.set(x, "canonicalUrls", js.Array(value*))
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyNull: Self = StObject.set(x, "validateOnly", null)
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
