package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaRuleIgnoreAction extends StObject {
  
  /**
    * Terms to ignore in the search query.
    */
  var ignoreTerms: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaRuleIgnoreAction {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaRuleIgnoreAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaRuleIgnoreAction]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaRuleIgnoreAction](x: Self) {
    
    inline def setIgnoreTerms(value: js.Array[String]): Self = StObject.set(x, "ignoreTerms", value.asInstanceOf[js.Any])
    
    inline def setIgnoreTermsNull: Self = StObject.set(x, "ignoreTerms", null)
    
    inline def setIgnoreTermsUndefined: Self = StObject.set(x, "ignoreTerms", js.undefined)
    
    inline def setIgnoreTermsVarargs(value: String*): Self = StObject.set(x, "ignoreTerms", js.Array(value*))
  }
}
