package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogConfig extends StObject {
  
  /** Cloud audit options. */
  var cloudAudit: js.UndefOr[LogConfigCloudAuditOptions] = js.undefined
  
  /** Counter options. */
  var counter: js.UndefOr[LogConfigCounterOptions] = js.undefined
  
  /** Data access options. */
  var dataAccess: js.UndefOr[LogConfigDataAccessOptions] = js.undefined
}
object LogConfig {
  
  inline def apply(): LogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfig]
  }
  
  extension [Self <: LogConfig](x: Self) {
    
    inline def setCloudAudit(value: LogConfigCloudAuditOptions): Self = StObject.set(x, "cloudAudit", value.asInstanceOf[js.Any])
    
    inline def setCloudAuditUndefined: Self = StObject.set(x, "cloudAudit", js.undefined)
    
    inline def setCounter(value: LogConfigCounterOptions): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    inline def setDataAccess(value: LogConfigDataAccessOptions): Self = StObject.set(x, "dataAccess", value.asInstanceOf[js.Any])
    
    inline def setDataAccessUndefined: Self = StObject.set(x, "dataAccess", js.undefined)
  }
}
