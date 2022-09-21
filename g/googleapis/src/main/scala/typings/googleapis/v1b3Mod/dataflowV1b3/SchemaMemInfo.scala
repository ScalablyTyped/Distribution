package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMemInfo extends StObject {
  
  /**
    * Instantenous memory limit in bytes.
    */
  var currentLimitBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of Out of Memory (OOM) events recorded since the previous measurement.
    */
  var currentOoms: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Instantenous memory (RSS) size in bytes.
    */
  var currentRssBytes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Timestamp of the measurement.
    */
  var timestamp: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Total memory (RSS) usage since start up in GB * ms.
    */
  var totalGbMs: js.UndefOr[String | Null] = js.undefined
}
object SchemaMemInfo {
  
  inline def apply(): SchemaMemInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMemInfo]
  }
  
  extension [Self <: SchemaMemInfo](x: Self) {
    
    inline def setCurrentLimitBytes(value: String): Self = StObject.set(x, "currentLimitBytes", value.asInstanceOf[js.Any])
    
    inline def setCurrentLimitBytesNull: Self = StObject.set(x, "currentLimitBytes", null)
    
    inline def setCurrentLimitBytesUndefined: Self = StObject.set(x, "currentLimitBytes", js.undefined)
    
    inline def setCurrentOoms(value: String): Self = StObject.set(x, "currentOoms", value.asInstanceOf[js.Any])
    
    inline def setCurrentOomsNull: Self = StObject.set(x, "currentOoms", null)
    
    inline def setCurrentOomsUndefined: Self = StObject.set(x, "currentOoms", js.undefined)
    
    inline def setCurrentRssBytes(value: String): Self = StObject.set(x, "currentRssBytes", value.asInstanceOf[js.Any])
    
    inline def setCurrentRssBytesNull: Self = StObject.set(x, "currentRssBytes", null)
    
    inline def setCurrentRssBytesUndefined: Self = StObject.set(x, "currentRssBytes", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampNull: Self = StObject.set(x, "timestamp", null)
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTotalGbMs(value: String): Self = StObject.set(x, "totalGbMs", value.asInstanceOf[js.Any])
    
    inline def setTotalGbMsNull: Self = StObject.set(x, "totalGbMs", null)
    
    inline def setTotalGbMsUndefined: Self = StObject.set(x, "totalGbMs", js.undefined)
  }
}
