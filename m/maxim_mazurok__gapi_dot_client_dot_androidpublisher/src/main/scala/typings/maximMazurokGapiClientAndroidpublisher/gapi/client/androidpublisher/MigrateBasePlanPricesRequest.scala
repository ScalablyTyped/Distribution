package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MigrateBasePlanPricesRequest extends StObject {
  
  /** Required. The regional prices to update. */
  var regionalPriceMigrations: js.UndefOr[js.Array[RegionalPriceMigrationConfig]] = js.undefined
  
  /** Required. The version of the available regions being used for the regional_price_migrations. */
  var regionsVersion: js.UndefOr[RegionsVersion] = js.undefined
}
object MigrateBasePlanPricesRequest {
  
  inline def apply(): MigrateBasePlanPricesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MigrateBasePlanPricesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MigrateBasePlanPricesRequest] (val x: Self) extends AnyVal {
    
    inline def setRegionalPriceMigrations(value: js.Array[RegionalPriceMigrationConfig]): Self = StObject.set(x, "regionalPriceMigrations", value.asInstanceOf[js.Any])
    
    inline def setRegionalPriceMigrationsUndefined: Self = StObject.set(x, "regionalPriceMigrations", js.undefined)
    
    inline def setRegionalPriceMigrationsVarargs(value: RegionalPriceMigrationConfig*): Self = StObject.set(x, "regionalPriceMigrations", js.Array(value*))
    
    inline def setRegionsVersion(value: RegionsVersion): Self = StObject.set(x, "regionsVersion", value.asInstanceOf[js.Any])
    
    inline def setRegionsVersionUndefined: Self = StObject.set(x, "regionsVersion", js.undefined)
  }
}
