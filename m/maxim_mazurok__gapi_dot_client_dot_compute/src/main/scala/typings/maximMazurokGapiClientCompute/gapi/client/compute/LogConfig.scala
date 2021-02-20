package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogConfig extends StObject {
  
  /** Cloud audit options. */
  var cloudAudit: js.UndefOr[LogConfigCloudAuditOptions] = js.native
  
  /** Counter options. */
  var counter: js.UndefOr[LogConfigCounterOptions] = js.native
  
  /** Data access options. */
  var dataAccess: js.UndefOr[LogConfigDataAccessOptions] = js.native
}
object LogConfig {
  
  @scala.inline
  def apply(): LogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfig]
  }
  
  @scala.inline
  implicit class LogConfigMutableBuilder[Self <: LogConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudAudit(value: LogConfigCloudAuditOptions): Self = StObject.set(x, "cloudAudit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudAuditUndefined: Self = StObject.set(x, "cloudAudit", js.undefined)
    
    @scala.inline
    def setCounter(value: LogConfigCounterOptions): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    @scala.inline
    def setDataAccess(value: LogConfigDataAccessOptions): Self = StObject.set(x, "dataAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataAccessUndefined: Self = StObject.set(x, "dataAccess", js.undefined)
  }
}
