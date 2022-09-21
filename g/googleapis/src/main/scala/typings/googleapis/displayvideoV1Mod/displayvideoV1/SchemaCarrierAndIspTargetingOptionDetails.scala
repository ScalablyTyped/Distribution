package typings.googleapis.displayvideoV1Mod.displayvideoV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCarrierAndIspTargetingOptionDetails extends StObject {
  
  /**
    * Output only. The display name of the carrier or ISP.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The type indicating if it's carrier or ISP.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaCarrierAndIspTargetingOptionDetails {
  
  inline def apply(): SchemaCarrierAndIspTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCarrierAndIspTargetingOptionDetails]
  }
  
  extension [Self <: SchemaCarrierAndIspTargetingOptionDetails](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
