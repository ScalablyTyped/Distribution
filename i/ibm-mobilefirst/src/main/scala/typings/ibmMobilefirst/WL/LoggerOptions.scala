package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggerOptions extends StObject {
  
  var autoSendLogs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated since version 6.2. use filters instead.
    */
  var blacklist: js.UndefOr[js.Array[String]] = js.undefined
  
  var callback: js.UndefOr[LoggerCallback] = js.undefined
  
  var capture: js.UndefOr[Boolean] = js.undefined
  
  var filters: js.UndefOr[Filter] = js.undefined
  
  var level: js.UndefOr[js.Array[String] | String | Double] = js.undefined
  
  var maxFileSize: js.UndefOr[Double] = js.undefined
  
  var pkg: js.UndefOr[String] = js.undefined
  
  var pretty: js.UndefOr[Boolean] = js.undefined
  
  var stacktrace: js.UndefOr[Boolean] = js.undefined
  
  var stringify: js.UndefOr[Boolean] = js.undefined
  
  var tag: js.UndefOr[Tag] = js.undefined
  
  /**
    * @deprecated since version 6.2. use filters instead.
    */
  var whitelist: js.UndefOr[js.Array[String]] = js.undefined
}
object LoggerOptions {
  
  inline def apply(): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOptions]
  }
  
  extension [Self <: LoggerOptions](x: Self) {
    
    inline def setAutoSendLogs(value: Boolean): Self = StObject.set(x, "autoSendLogs", value.asInstanceOf[js.Any])
    
    inline def setAutoSendLogsUndefined: Self = StObject.set(x, "autoSendLogs", js.undefined)
    
    inline def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
    
    inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
    
    inline def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
    
    inline def setCallback(value: (/* message */ String | js.Array[String], /* level */ String, /* package */ String) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction3(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setFilters(value: Filter): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setLevel(value: js.Array[String] | String | Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setLevelVarargs(value: String*): Self = StObject.set(x, "level", js.Array(value :_*))
    
    inline def setMaxFileSize(value: Double): Self = StObject.set(x, "maxFileSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFileSizeUndefined: Self = StObject.set(x, "maxFileSize", js.undefined)
    
    inline def setPkg(value: String): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
    
    inline def setPkgUndefined: Self = StObject.set(x, "pkg", js.undefined)
    
    inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
    
    inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    
    inline def setStacktrace(value: Boolean): Self = StObject.set(x, "stacktrace", value.asInstanceOf[js.Any])
    
    inline def setStacktraceUndefined: Self = StObject.set(x, "stacktrace", js.undefined)
    
    inline def setStringify(value: Boolean): Self = StObject.set(x, "stringify", value.asInstanceOf[js.Any])
    
    inline def setStringifyUndefined: Self = StObject.set(x, "stringify", js.undefined)
    
    inline def setTag(value: Tag): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    
    inline def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
    
    inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    
    inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value :_*))
  }
}
