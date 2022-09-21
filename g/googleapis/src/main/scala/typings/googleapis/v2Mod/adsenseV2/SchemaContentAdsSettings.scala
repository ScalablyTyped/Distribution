package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaContentAdsSettings extends StObject {
  
  /**
    * Required. Size of the ad unit. e.g. "728x90", "1x3" (for responsive ad units).
    */
  var size: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Type of the ad unit.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaContentAdsSettings {
  
  inline def apply(): SchemaContentAdsSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContentAdsSettings]
  }
  
  extension [Self <: SchemaContentAdsSettings](x: Self) {
    
    inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeNull: Self = StObject.set(x, "size", null)
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
