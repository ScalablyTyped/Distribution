package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaResourceQuotasRemaining extends StObject {
  
  /**
    * Daily resource quota remaining remaining.
    */
  var dailyQuotaTokensRemaining: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Hourly resource quota tokens remaining.
    */
  var hourlyQuotaTokensRemaining: js.UndefOr[Double | Null] = js.undefined
}
object SchemaResourceQuotasRemaining {
  
  inline def apply(): SchemaResourceQuotasRemaining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceQuotasRemaining]
  }
  
  extension [Self <: SchemaResourceQuotasRemaining](x: Self) {
    
    inline def setDailyQuotaTokensRemaining(value: Double): Self = StObject.set(x, "dailyQuotaTokensRemaining", value.asInstanceOf[js.Any])
    
    inline def setDailyQuotaTokensRemainingNull: Self = StObject.set(x, "dailyQuotaTokensRemaining", null)
    
    inline def setDailyQuotaTokensRemainingUndefined: Self = StObject.set(x, "dailyQuotaTokensRemaining", js.undefined)
    
    inline def setHourlyQuotaTokensRemaining(value: Double): Self = StObject.set(x, "hourlyQuotaTokensRemaining", value.asInstanceOf[js.Any])
    
    inline def setHourlyQuotaTokensRemainingNull: Self = StObject.set(x, "hourlyQuotaTokensRemaining", null)
    
    inline def setHourlyQuotaTokensRemainingUndefined: Self = StObject.set(x, "hourlyQuotaTokensRemaining", js.undefined)
  }
}
