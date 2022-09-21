package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppTargeting extends StObject {
  
  /**
    * Lists of included and excluded mobile app categories as defined in https://developers.google.com/adwords/api/docs/appendix/mobileappcategories.csv.
    */
  var mobileAppCategoryTargeting: js.UndefOr[SchemaNumericTargetingDimension] = js.undefined
  
  /**
    * Targeted app IDs. App IDs can refer to those found in an app store or ones that are not published in an app store. A maximum of 30,000 app IDs can be targeted.
    */
  var mobileAppTargeting: js.UndefOr[SchemaStringTargetingDimension] = js.undefined
}
object SchemaAppTargeting {
  
  inline def apply(): SchemaAppTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppTargeting]
  }
  
  extension [Self <: SchemaAppTargeting](x: Self) {
    
    inline def setMobileAppCategoryTargeting(value: SchemaNumericTargetingDimension): Self = StObject.set(x, "mobileAppCategoryTargeting", value.asInstanceOf[js.Any])
    
    inline def setMobileAppCategoryTargetingUndefined: Self = StObject.set(x, "mobileAppCategoryTargeting", js.undefined)
    
    inline def setMobileAppTargeting(value: SchemaStringTargetingDimension): Self = StObject.set(x, "mobileAppTargeting", value.asInstanceOf[js.Any])
    
    inline def setMobileAppTargetingUndefined: Self = StObject.set(x, "mobileAppTargeting", js.undefined)
  }
}
