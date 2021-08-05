package typings.historyJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryOptions extends StObject {
  
  var busyDelay: js.UndefOr[Double] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var delayInit: js.UndefOr[Double] = js.undefined
  
  var disableSuid: js.UndefOr[Boolean] = js.undefined
  
  var doubleCheckInterval: js.UndefOr[Double] = js.undefined
  
  var hashChangeInterval: js.UndefOr[Double] = js.undefined
  
  var html4Mode: js.UndefOr[Boolean] = js.undefined
  
  var initialTitle: js.UndefOr[String] = js.undefined
  
  var safariPollInterval: js.UndefOr[Double] = js.undefined
  
  var storeInterval: js.UndefOr[Double] = js.undefined
}
object HistoryOptions {
  
  inline def apply(): HistoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryOptions]
  }
  
  extension [Self <: HistoryOptions](x: Self) {
    
    inline def setBusyDelay(value: Double): Self = StObject.set(x, "busyDelay", value.asInstanceOf[js.Any])
    
    inline def setBusyDelayUndefined: Self = StObject.set(x, "busyDelay", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDelayInit(value: Double): Self = StObject.set(x, "delayInit", value.asInstanceOf[js.Any])
    
    inline def setDelayInitUndefined: Self = StObject.set(x, "delayInit", js.undefined)
    
    inline def setDisableSuid(value: Boolean): Self = StObject.set(x, "disableSuid", value.asInstanceOf[js.Any])
    
    inline def setDisableSuidUndefined: Self = StObject.set(x, "disableSuid", js.undefined)
    
    inline def setDoubleCheckInterval(value: Double): Self = StObject.set(x, "doubleCheckInterval", value.asInstanceOf[js.Any])
    
    inline def setDoubleCheckIntervalUndefined: Self = StObject.set(x, "doubleCheckInterval", js.undefined)
    
    inline def setHashChangeInterval(value: Double): Self = StObject.set(x, "hashChangeInterval", value.asInstanceOf[js.Any])
    
    inline def setHashChangeIntervalUndefined: Self = StObject.set(x, "hashChangeInterval", js.undefined)
    
    inline def setHtml4Mode(value: Boolean): Self = StObject.set(x, "html4Mode", value.asInstanceOf[js.Any])
    
    inline def setHtml4ModeUndefined: Self = StObject.set(x, "html4Mode", js.undefined)
    
    inline def setInitialTitle(value: String): Self = StObject.set(x, "initialTitle", value.asInstanceOf[js.Any])
    
    inline def setInitialTitleUndefined: Self = StObject.set(x, "initialTitle", js.undefined)
    
    inline def setSafariPollInterval(value: Double): Self = StObject.set(x, "safariPollInterval", value.asInstanceOf[js.Any])
    
    inline def setSafariPollIntervalUndefined: Self = StObject.set(x, "safariPollInterval", js.undefined)
    
    inline def setStoreInterval(value: Double): Self = StObject.set(x, "storeInterval", value.asInstanceOf[js.Any])
    
    inline def setStoreIntervalUndefined: Self = StObject.set(x, "storeInterval", js.undefined)
  }
}
