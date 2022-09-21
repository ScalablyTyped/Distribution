package typings.googleapis.networkmanagementV1Mod.networkmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkInfo extends StObject {
  
  /**
    * Name of a Compute Engine network.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The IP range that matches the test.
    */
  var matchedIpRange: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI of a Compute Engine network.
    */
  var uri: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworkInfo {
  
  inline def apply(): SchemaNetworkInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkInfo]
  }
  
  extension [Self <: SchemaNetworkInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMatchedIpRange(value: String): Self = StObject.set(x, "matchedIpRange", value.asInstanceOf[js.Any])
    
    inline def setMatchedIpRangeNull: Self = StObject.set(x, "matchedIpRange", null)
    
    inline def setMatchedIpRangeUndefined: Self = StObject.set(x, "matchedIpRange", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriNull: Self = StObject.set(x, "uri", null)
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
