package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInterconnectLocationRegionInfo extends StObject {
  
  /**
    * Expected round-trip time in milliseconds, from this InterconnectLocation to a VM in this region.
    */
  var expectedRttMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies the network presence of this location.
    */
  var locationPresence: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL for the region of this location.
    */
  var region: js.UndefOr[String | Null] = js.undefined
}
object SchemaInterconnectLocationRegionInfo {
  
  inline def apply(): SchemaInterconnectLocationRegionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectLocationRegionInfo]
  }
  
  extension [Self <: SchemaInterconnectLocationRegionInfo](x: Self) {
    
    inline def setExpectedRttMs(value: String): Self = StObject.set(x, "expectedRttMs", value.asInstanceOf[js.Any])
    
    inline def setExpectedRttMsNull: Self = StObject.set(x, "expectedRttMs", null)
    
    inline def setExpectedRttMsUndefined: Self = StObject.set(x, "expectedRttMs", js.undefined)
    
    inline def setLocationPresence(value: String): Self = StObject.set(x, "locationPresence", value.asInstanceOf[js.Any])
    
    inline def setLocationPresenceNull: Self = StObject.set(x, "locationPresence", null)
    
    inline def setLocationPresenceUndefined: Self = StObject.set(x, "locationPresence", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
