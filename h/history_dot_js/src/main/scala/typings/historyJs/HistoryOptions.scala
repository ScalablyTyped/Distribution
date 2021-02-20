package typings.historyJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryOptions extends StObject {
  
  var busyDelay: js.UndefOr[Double] = js.native
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var delayInit: js.UndefOr[Double] = js.native
  
  var disableSuid: js.UndefOr[Boolean] = js.native
  
  var doubleCheckInterval: js.UndefOr[Double] = js.native
  
  var hashChangeInterval: js.UndefOr[Double] = js.native
  
  var html4Mode: js.UndefOr[Boolean] = js.native
  
  var initialTitle: js.UndefOr[String] = js.native
  
  var safariPollInterval: js.UndefOr[Double] = js.native
  
  var storeInterval: js.UndefOr[Double] = js.native
}
object HistoryOptions {
  
  @scala.inline
  def apply(): HistoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryOptions]
  }
  
  @scala.inline
  implicit class HistoryOptionsMutableBuilder[Self <: HistoryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBusyDelay(value: Double): Self = StObject.set(x, "busyDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusyDelayUndefined: Self = StObject.set(x, "busyDelay", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setDelayInit(value: Double): Self = StObject.set(x, "delayInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayInitUndefined: Self = StObject.set(x, "delayInit", js.undefined)
    
    @scala.inline
    def setDisableSuid(value: Boolean): Self = StObject.set(x, "disableSuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableSuidUndefined: Self = StObject.set(x, "disableSuid", js.undefined)
    
    @scala.inline
    def setDoubleCheckInterval(value: Double): Self = StObject.set(x, "doubleCheckInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoubleCheckIntervalUndefined: Self = StObject.set(x, "doubleCheckInterval", js.undefined)
    
    @scala.inline
    def setHashChangeInterval(value: Double): Self = StObject.set(x, "hashChangeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashChangeIntervalUndefined: Self = StObject.set(x, "hashChangeInterval", js.undefined)
    
    @scala.inline
    def setHtml4Mode(value: Boolean): Self = StObject.set(x, "html4Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml4ModeUndefined: Self = StObject.set(x, "html4Mode", js.undefined)
    
    @scala.inline
    def setInitialTitle(value: String): Self = StObject.set(x, "initialTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialTitleUndefined: Self = StObject.set(x, "initialTitle", js.undefined)
    
    @scala.inline
    def setSafariPollInterval(value: Double): Self = StObject.set(x, "safariPollInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSafariPollIntervalUndefined: Self = StObject.set(x, "safariPollInterval", js.undefined)
    
    @scala.inline
    def setStoreInterval(value: Double): Self = StObject.set(x, "storeInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreIntervalUndefined: Self = StObject.set(x, "storeInterval", js.undefined)
  }
}
