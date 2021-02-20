package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggerOptions extends StObject {
  
  var autoSendLogs: js.UndefOr[Boolean] = js.native
  
  /**
    * @deprecated since version 6.2. use filters instead.
    */
  var blacklist: js.UndefOr[js.Array[String]] = js.native
  
  var callback: js.UndefOr[LoggerCallback] = js.native
  
  var capture: js.UndefOr[Boolean] = js.native
  
  var filters: js.UndefOr[Filter] = js.native
  
  var level: js.UndefOr[js.Array[String] | String | Double] = js.native
  
  var maxFileSize: js.UndefOr[Double] = js.native
  
  var pkg: js.UndefOr[String] = js.native
  
  var pretty: js.UndefOr[Boolean] = js.native
  
  var stacktrace: js.UndefOr[Boolean] = js.native
  
  var stringify: js.UndefOr[Boolean] = js.native
  
  var tag: js.UndefOr[Tag] = js.native
  
  /**
    * @deprecated since version 6.2. use filters instead.
    */
  var whitelist: js.UndefOr[js.Array[String]] = js.native
}
object LoggerOptions {
  
  @scala.inline
  def apply(): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOptions]
  }
  
  @scala.inline
  implicit class LoggerOptionsMutableBuilder[Self <: LoggerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoSendLogs(value: Boolean): Self = StObject.set(x, "autoSendLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSendLogsUndefined: Self = StObject.set(x, "autoSendLogs", js.undefined)
    
    @scala.inline
    def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
    
    @scala.inline
    def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
    
    @scala.inline
    def setCallback(value: (/* message */ String | js.Array[String], /* level */ String, /* package */ String) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    @scala.inline
    def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    @scala.inline
    def setFilters(value: Filter): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    @scala.inline
    def setLevel(value: js.Array[String] | String | Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setLevelVarargs(value: String*): Self = StObject.set(x, "level", js.Array(value :_*))
    
    @scala.inline
    def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
    
    @scala.inline
    def setPkg(value: String): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
    
    @scala.inline
    def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    
    @scala.inline
    def setStacktrace(value: Boolean): Self = StObject.set(x, "stacktrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStacktraceUndefined: Self = StObject.set(x, "stacktrace", js.undefined)
    
    @scala.inline
    def setStringify(value: Boolean): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
    
    @scala.inline
    def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    @scala.inline
    def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    
    @scala.inline
    def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
  }
}
