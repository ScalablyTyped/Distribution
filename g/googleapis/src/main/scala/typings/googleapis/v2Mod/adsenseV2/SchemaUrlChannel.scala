package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUrlChannel extends StObject {
  
  /**
    * Output only. Resource name of the URL channel. Format: accounts/{account\}/adclients/{adclient\}/urlchannels/{urlchannel\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Unique ID of the custom channel as used in the `URL_CHANNEL_ID` reporting dimension.
    */
  var reportingDimensionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URI pattern of the channel. Does not include "http://" or "https://". Example: www.example.com/home
    */
  var uriPattern: js.UndefOr[String | Null] = js.undefined
}
object SchemaUrlChannel {
  
  inline def apply(): SchemaUrlChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlChannel]
  }
  
  extension [Self <: SchemaUrlChannel](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReportingDimensionId(value: String): Self = StObject.set(x, "reportingDimensionId", value.asInstanceOf[js.Any])
    
    inline def setReportingDimensionIdNull: Self = StObject.set(x, "reportingDimensionId", null)
    
    inline def setReportingDimensionIdUndefined: Self = StObject.set(x, "reportingDimensionId", js.undefined)
    
    inline def setUriPattern(value: String): Self = StObject.set(x, "uriPattern", value.asInstanceOf[js.Any])
    
    inline def setUriPatternNull: Self = StObject.set(x, "uriPattern", null)
    
    inline def setUriPatternUndefined: Self = StObject.set(x, "uriPattern", js.undefined)
  }
}
