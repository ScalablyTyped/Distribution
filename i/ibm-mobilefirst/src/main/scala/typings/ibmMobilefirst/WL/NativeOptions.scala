package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeOptions extends StObject {
  
  var autoSendLogs: js.UndefOr[Boolean] = js.undefined
  
  var autoUpdateConfig: js.UndefOr[Boolean] = js.undefined
  
  var capture: js.UndefOr[Boolean] = js.undefined
  
  var filters: js.UndefOr[Filter] = js.undefined
  
  var level: js.UndefOr[String] = js.undefined
  
  var maxFileSize: js.UndefOr[Double] = js.undefined
}
object NativeOptions {
  
  inline def apply(): NativeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeOptions]
  }
  
  extension [Self <: NativeOptions](x: Self) {
    
    inline def setAutoSendLogs(value: Boolean): Self = StObject.set(x, "autoSendLogs", value.asInstanceOf[js.Any])
    
    inline def setAutoSendLogsUndefined: Self = StObject.set(x, "autoSendLogs", js.undefined)
    
    inline def setAutoUpdateConfig(value: Boolean): Self = StObject.set(x, "autoUpdateConfig", value.asInstanceOf[js.Any])
    
    inline def setAutoUpdateConfigUndefined: Self = StObject.set(x, "autoUpdateConfig", js.undefined)
    
    inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setFilters(value: Filter): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
  }
}
