package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSslPoliciesListAvailableFeaturesResponse extends StObject {
  
  var features: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaSslPoliciesListAvailableFeaturesResponse {
  
  inline def apply(): SchemaSslPoliciesListAvailableFeaturesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslPoliciesListAvailableFeaturesResponse]
  }
  
  extension [Self <: SchemaSslPoliciesListAvailableFeaturesResponse](x: Self) {
    
    inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
  }
}
