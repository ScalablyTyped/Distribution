package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPartnerGeneralConfig extends StObject {
  
  /**
    * Immutable. Partner's currency in ISO 4217 format.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The standard TZ database name of the partner's time zone. For example, `America/New_York`. See more at: https://en.wikipedia.org/wiki/List_of_tz_database_time_zones
    */
  var timeZone: js.UndefOr[String | Null] = js.undefined
}
object SchemaPartnerGeneralConfig {
  
  inline def apply(): SchemaPartnerGeneralConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartnerGeneralConfig]
  }
  
  extension [Self <: SchemaPartnerGeneralConfig](x: Self) {
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
