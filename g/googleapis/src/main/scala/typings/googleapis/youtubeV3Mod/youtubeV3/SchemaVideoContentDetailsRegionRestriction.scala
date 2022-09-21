package typings.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVideoContentDetailsRegionRestriction extends StObject {
  
  /**
    * A list of region codes that identify countries where the video is viewable. If this property is present and a country is not listed in its value, then the video is blocked from appearing in that country. If this property is present and contains an empty list, the video is blocked in all countries.
    */
  var allowed: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of region codes that identify countries where the video is blocked. If this property is present and a country is not listed in its value, then the video is viewable in that country. If this property is present and contains an empty list, the video is viewable in all countries.
    */
  var blocked: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaVideoContentDetailsRegionRestriction {
  
  inline def apply(): SchemaVideoContentDetailsRegionRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoContentDetailsRegionRestriction]
  }
  
  extension [Self <: SchemaVideoContentDetailsRegionRestriction](x: Self) {
    
    inline def setAllowed(value: js.Array[String]): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    inline def setAllowedNull: Self = StObject.set(x, "allowed", null)
    
    inline def setAllowedUndefined: Self = StObject.set(x, "allowed", js.undefined)
    
    inline def setAllowedVarargs(value: String*): Self = StObject.set(x, "allowed", js.Array(value*))
    
    inline def setBlocked(value: js.Array[String]): Self = StObject.set(x, "blocked", value.asInstanceOf[js.Any])
    
    inline def setBlockedNull: Self = StObject.set(x, "blocked", null)
    
    inline def setBlockedUndefined: Self = StObject.set(x, "blocked", js.undefined)
    
    inline def setBlockedVarargs(value: String*): Self = StObject.set(x, "blocked", js.Array(value*))
  }
}
