package typings.luxon.srcDatetimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToSQLOptions extends StObject {
  
  /**
    * Include the offset, such as 'Z' or '-04:00'
    * @default true
    */
  var includeOffset: js.UndefOr[Boolean] = js.undefined
  
  /**
    * include the space between the time and the offset, such as '05:15:16.345 -04:00'
    * @default true
    */
  var includeOffsetSpace: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Include the zone, such as 'America/New_York'. Overrides includeOffset.
    * @default false
    */
  var includeZone: js.UndefOr[Boolean] = js.undefined
}
object ToSQLOptions {
  
  inline def apply(): ToSQLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToSQLOptions]
  }
  
  extension [Self <: ToSQLOptions](x: Self) {
    
    inline def setIncludeOffset(value: Boolean): Self = StObject.set(x, "includeOffset", value.asInstanceOf[js.Any])
    
    inline def setIncludeOffsetSpace(value: Boolean): Self = StObject.set(x, "includeOffsetSpace", value.asInstanceOf[js.Any])
    
    inline def setIncludeOffsetSpaceUndefined: Self = StObject.set(x, "includeOffsetSpace", js.undefined)
    
    inline def setIncludeOffsetUndefined: Self = StObject.set(x, "includeOffset", js.undefined)
    
    inline def setIncludeZone(value: Boolean): Self = StObject.set(x, "includeZone", value.asInstanceOf[js.Any])
    
    inline def setIncludeZoneUndefined: Self = StObject.set(x, "includeZone", js.undefined)
  }
}
