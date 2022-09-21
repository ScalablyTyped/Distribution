package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaRuleIgnoreAction extends StObject {
  
  /**
    * Terms to ignore in the search query.
    */
  var ignoreTerms: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaRuleIgnoreAction {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaRuleIgnoreAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaRuleIgnoreAction]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaRuleIgnoreAction](x: Self) {
    
    inline def setIgnoreTerms(value: js.Array[String]): Self = StObject.set(x, "ignoreTerms", value.asInstanceOf[js.Any])
    
    inline def setIgnoreTermsNull: Self = StObject.set(x, "ignoreTerms", null)
    
    inline def setIgnoreTermsUndefined: Self = StObject.set(x, "ignoreTerms", js.undefined)
    
    inline def setIgnoreTermsVarargs(value: String*): Self = StObject.set(x, "ignoreTerms", js.Array(value*))
  }
}
