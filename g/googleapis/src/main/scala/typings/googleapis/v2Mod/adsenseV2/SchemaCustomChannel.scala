package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomChannel extends StObject {
  
  /**
    * Required. Display name of the custom channel.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name of the custom channel. Format: accounts/{account\}/adclients/{adclient\}/customchannels/{customchannel\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Unique ID of the custom channel as used in the `CUSTOM_CHANNEL_ID` reporting dimension.
    */
  var reportingDimensionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomChannel {
  
  inline def apply(): SchemaCustomChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomChannel]
  }
  
  extension [Self <: SchemaCustomChannel](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReportingDimensionId(value: String): Self = StObject.set(x, "reportingDimensionId", value.asInstanceOf[js.Any])
    
    inline def setReportingDimensionIdNull: Self = StObject.set(x, "reportingDimensionId", null)
    
    inline def setReportingDimensionIdUndefined: Self = StObject.set(x, "reportingDimensionId", js.undefined)
  }
}
