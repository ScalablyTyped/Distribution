package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReturnPolicySeasonalOverride extends StObject {
  
  /**
    * Required. Last day on which the override applies. In ISO 8601 format.
    */
  var endDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The name of the seasonal override as shown in Merchant Center.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The policy which is in effect during that time.
    */
  var policy: js.UndefOr[SchemaReturnPolicyPolicy] = js.undefined
  
  /**
    * Required. First day on which the override applies. In ISO 8601 format.
    */
  var startDate: js.UndefOr[String | Null] = js.undefined
}
object SchemaReturnPolicySeasonalOverride {
  
  inline def apply(): SchemaReturnPolicySeasonalOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReturnPolicySeasonalOverride]
  }
  
  extension [Self <: SchemaReturnPolicySeasonalOverride](x: Self) {
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateNull: Self = StObject.set(x, "endDate", null)
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPolicy(value: SchemaReturnPolicyPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateNull: Self = StObject.set(x, "startDate", null)
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
