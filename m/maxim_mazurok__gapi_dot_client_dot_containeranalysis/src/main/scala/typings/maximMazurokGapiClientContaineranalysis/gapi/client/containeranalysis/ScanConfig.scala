package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScanConfig extends StObject {
  
  /** Output only. The time this scan config was created. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. A human-readable description of what the scan configuration does. */
  var description: js.UndefOr[String] = js.undefined
  
  /** Whether the scan is enabled. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. The name of the scan configuration in the form of `projects/[PROJECT_ID]/scanConfigs/[SCAN_CONFIG_ID]`. */
  var name: js.UndefOr[String] = js.undefined
  
  /** Output only. The time this scan config was last updated. */
  var updateTime: js.UndefOr[String] = js.undefined
}
object ScanConfig {
  
  inline def apply(): ScanConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScanConfig]
  }
  
  extension [Self <: ScanConfig](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
