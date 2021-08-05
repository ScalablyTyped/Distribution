package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemInfo extends StObject {
  
  /** Instantenous memory limit in bytes. */
  var currentLimitBytes: js.UndefOr[String] = js.undefined
  
  /** Instantenous memory (RSS) size in bytes. */
  var currentRssBytes: js.UndefOr[String] = js.undefined
  
  /** Timestamp of the measurement. */
  var timestamp: js.UndefOr[String] = js.undefined
  
  /** Total memory (RSS) usage since start up in GB * ms. */
  var totalGbMs: js.UndefOr[String] = js.undefined
}
object MemInfo {
  
  inline def apply(): MemInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemInfo]
  }
  
  extension [Self <: MemInfo](x: Self) {
    
    inline def setCurrentLimitBytes(value: String): Self = StObject.set(x, "currentLimitBytes", value.asInstanceOf[js.Any])
    
    inline def setCurrentLimitBytesUndefined: Self = StObject.set(x, "currentLimitBytes", js.undefined)
    
    inline def setCurrentRssBytes(value: String): Self = StObject.set(x, "currentRssBytes", value.asInstanceOf[js.Any])
    
    inline def setCurrentRssBytesUndefined: Self = StObject.set(x, "currentRssBytes", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTotalGbMs(value: String): Self = StObject.set(x, "totalGbMs", value.asInstanceOf[js.Any])
    
    inline def setTotalGbMsUndefined: Self = StObject.set(x, "totalGbMs", js.undefined)
  }
}
