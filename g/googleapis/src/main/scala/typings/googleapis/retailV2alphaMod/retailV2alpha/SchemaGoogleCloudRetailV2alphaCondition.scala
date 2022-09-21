package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaCondition extends StObject {
  
  /**
    * Range of time(s) specifying when Condition is active. Condition true if any time range matches.
    */
  var activeTimeRange: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2alphaConditionTimeRange]] = js.undefined
  
  /**
    * A list (up to 10 entries) of terms to match the query on. If not specified, match all queries. If many query terms are specified, the condition is matched if any of the terms is a match (i.e. using the OR operator).
    */
  var queryTerms: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2alphaConditionQueryTerm]] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaCondition {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaCondition]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaCondition](x: Self) {
    
    inline def setActiveTimeRange(value: js.Array[SchemaGoogleCloudRetailV2alphaConditionTimeRange]): Self = StObject.set(x, "activeTimeRange", value.asInstanceOf[js.Any])
    
    inline def setActiveTimeRangeUndefined: Self = StObject.set(x, "activeTimeRange", js.undefined)
    
    inline def setActiveTimeRangeVarargs(value: SchemaGoogleCloudRetailV2alphaConditionTimeRange*): Self = StObject.set(x, "activeTimeRange", js.Array(value*))
    
    inline def setQueryTerms(value: js.Array[SchemaGoogleCloudRetailV2alphaConditionQueryTerm]): Self = StObject.set(x, "queryTerms", value.asInstanceOf[js.Any])
    
    inline def setQueryTermsUndefined: Self = StObject.set(x, "queryTerms", js.undefined)
    
    inline def setQueryTermsVarargs(value: SchemaGoogleCloudRetailV2alphaConditionQueryTerm*): Self = StObject.set(x, "queryTerms", js.Array(value*))
  }
}
