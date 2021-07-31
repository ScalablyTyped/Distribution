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
  
  @scala.inline
  def apply(): NativeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NativeOptions]
  }
  
  @scala.inline
  implicit class NativeOptionsMutableBuilder[Self <: NativeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSendLogs(value: Boolean): Self = StObject.set(x, "autoSendLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSendLogsUndefined: Self = StObject.set(x, "autoSendLogs", js.undefined)
    
    @scala.inline
    def setAutoUpdateConfig(value: Boolean): Self = StObject.set(x, "autoUpdateConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdateConfigUndefined: Self = StObject.set(x, "autoUpdateConfig", js.undefined)
    
    @scala.inline
    def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    @scala.inline
    def setFilters(value: Filter): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
  }
}
