package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionalPriceMigrationConfig extends StObject {
  
  /**
    * Required. The cutoff time for historical prices that subscribers can remain paying. Subscribers who are on a price that was created before this cutoff time will be migrated to the
    * currently-offered price. These subscribers will receive a notification that they will be paying a different price. Subscribers who do not agree to the new price will have their
    * subscription ended at the next renewal.
    */
  var oldestAllowedPriceVersionTime: js.UndefOr[String] = js.undefined
  
  /** Required. Region code this configuration applies to, as defined by ISO 3166-2, e.g. "US". */
  var regionCode: js.UndefOr[String] = js.undefined
}
object RegionalPriceMigrationConfig {
  
  inline def apply(): RegionalPriceMigrationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionalPriceMigrationConfig]
  }
  
  extension [Self <: RegionalPriceMigrationConfig](x: Self) {
    
    inline def setOldestAllowedPriceVersionTime(value: String): Self = StObject.set(x, "oldestAllowedPriceVersionTime", value.asInstanceOf[js.Any])
    
    inline def setOldestAllowedPriceVersionTimeUndefined: Self = StObject.set(x, "oldestAllowedPriceVersionTime", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
