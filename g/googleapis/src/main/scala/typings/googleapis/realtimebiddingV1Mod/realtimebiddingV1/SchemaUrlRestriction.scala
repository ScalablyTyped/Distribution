package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUrlRestriction extends StObject {
  
  /**
    * End date (if specified) of the URL restriction. End date should be later than the start date for the date range to be valid.
    */
  var endDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * The restriction type for the specified URL.
    */
  var restrictionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Start date (if specified) of the URL restriction.
    */
  var startDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * Required. The URL to use for applying the restriction on the user list.
    */
  var url: js.UndefOr[String | Null] = js.undefined
}
object SchemaUrlRestriction {
  
  inline def apply(): SchemaUrlRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlRestriction]
  }
  
  extension [Self <: SchemaUrlRestriction](x: Self) {
    
    inline def setEndDate(value: SchemaDate): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setRestrictionType(value: String): Self = StObject.set(x, "restrictionType", value.asInstanceOf[js.Any])
    
    inline def setRestrictionTypeNull: Self = StObject.set(x, "restrictionType", null)
    
    inline def setRestrictionTypeUndefined: Self = StObject.set(x, "restrictionType", js.undefined)
    
    inline def setStartDate(value: SchemaDate): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlNull: Self = StObject.set(x, "url", null)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
