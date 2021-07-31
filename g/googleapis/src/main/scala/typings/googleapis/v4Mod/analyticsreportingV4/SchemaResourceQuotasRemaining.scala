package typings.googleapis.v4Mod.analyticsreportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The resource quota tokens remaining for the property after the request is
  * completed.
  */
trait SchemaResourceQuotasRemaining extends StObject {
  
  /**
    * Daily resource quota remaining remaining.
    */
  var dailyQuotaTokensRemaining: js.UndefOr[Double] = js.undefined
  
  /**
    * Hourly resource quota tokens remaining.
    */
  var hourlyQuotaTokensRemaining: js.UndefOr[Double] = js.undefined
}
object SchemaResourceQuotasRemaining {
  
  @scala.inline
  def apply(): SchemaResourceQuotasRemaining = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResourceQuotasRemaining]
  }
  
  @scala.inline
  implicit class SchemaResourceQuotasRemainingMutableBuilder[Self <: SchemaResourceQuotasRemaining] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDailyQuotaTokensRemaining(value: Double): Self = StObject.set(x, "dailyQuotaTokensRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDailyQuotaTokensRemainingUndefined: Self = StObject.set(x, "dailyQuotaTokensRemaining", js.undefined)
    
    @scala.inline
    def setHourlyQuotaTokensRemaining(value: Double): Self = StObject.set(x, "hourlyQuotaTokensRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourlyQuotaTokensRemainingUndefined: Self = StObject.set(x, "hourlyQuotaTokensRemaining", js.undefined)
  }
}
