package typings.luxon.srcDatetimeMod

import typings.luxon.srcZoneMod.Zone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateTimeOptions
  extends StObject
     with LocaleOptions {
  
  /**
    * Override the zone with a fixed-offset zone specified in the string itself, if it specifies one.
    * @default false
    */
  var setZone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use this zone if no offset is specified in the input string itself. Will also convert the time to this zone.
    * @default local
    */
  var zone: js.UndefOr[String | Zone] = js.undefined
}
object DateTimeOptions {
  
  inline def apply(): DateTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeOptions]
  }
  
  extension [Self <: DateTimeOptions](x: Self) {
    
    inline def setSetZone(value: Boolean): Self = StObject.set(x, "setZone", value.asInstanceOf[js.Any])
    
    inline def setSetZoneUndefined: Self = StObject.set(x, "setZone", js.undefined)
    
    inline def setZone(value: String | Zone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
