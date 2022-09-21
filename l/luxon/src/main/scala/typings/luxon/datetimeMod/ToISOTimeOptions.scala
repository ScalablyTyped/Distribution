package typings.luxon.datetimeMod

import typings.luxon.durationMod.ToISOTimeDurationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToISOTimeOptions
  extends StObject
     with ToISOTimeDurationOptions {
  
  /**
    * add the time zone format extension
    * @default false
    */
  var extendedZone: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Include the offset, such as 'Z' or '-04:00'
    * @default true
    */
  var includeOffset: js.UndefOr[Boolean] = js.undefined
}
object ToISOTimeOptions {
  
  inline def apply(): ToISOTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToISOTimeOptions]
  }
  
  extension [Self <: ToISOTimeOptions](x: Self) {
    
    inline def setExtendedZone(value: Boolean): Self = StObject.set(x, "extendedZone", value.asInstanceOf[js.Any])
    
    inline def setExtendedZoneUndefined: Self = StObject.set(x, "extendedZone", js.undefined)
    
    inline def setIncludeOffset(value: Boolean): Self = StObject.set(x, "includeOffset", value.asInstanceOf[js.Any])
    
    inline def setIncludeOffsetUndefined: Self = StObject.set(x, "includeOffset", js.undefined)
  }
}
