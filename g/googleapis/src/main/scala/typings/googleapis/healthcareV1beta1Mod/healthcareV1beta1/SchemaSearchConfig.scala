package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSearchConfig extends StObject {
  
  /**
    * A list of search parameters in this FHIR store that are used to configure this FHIR store.
    */
  var searchParameters: js.UndefOr[js.Array[SchemaSearchParameter]] = js.undefined
}
object SchemaSearchConfig {
  
  inline def apply(): SchemaSearchConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchConfig]
  }
  
  extension [Self <: SchemaSearchConfig](x: Self) {
    
    inline def setSearchParameters(value: js.Array[SchemaSearchParameter]): Self = StObject.set(x, "searchParameters", value.asInstanceOf[js.Any])
    
    inline def setSearchParametersUndefined: Self = StObject.set(x, "searchParameters", js.undefined)
    
    inline def setSearchParametersVarargs(value: SchemaSearchParameter*): Self = StObject.set(x, "searchParameters", js.Array(value*))
  }
}
