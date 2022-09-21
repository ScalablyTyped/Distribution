package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaConditionQueryTerm extends StObject {
  
  /**
    * Whether this is supposed to be a full or partial match.
    */
  var fullMatch: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The value of the term to match on. Value cannot be empty. Value can have at most 3 terms if specified as a partial match. Each space separated string is considered as one term. Example) "a b c" is 3 terms and allowed, " a b c d" is 4 terms and not allowed for partial match.
    */
  var value: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaConditionQueryTerm {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaConditionQueryTerm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaConditionQueryTerm]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaConditionQueryTerm](x: Self) {
    
    inline def setFullMatch(value: Boolean): Self = StObject.set(x, "fullMatch", value.asInstanceOf[js.Any])
    
    inline def setFullMatchNull: Self = StObject.set(x, "fullMatch", null)
    
    inline def setFullMatchUndefined: Self = StObject.set(x, "fullMatch", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
