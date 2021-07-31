package typings.jqueryClientsidelogging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientSideLoggingObject extends StObject {
  
  // The variable to send the log message through as.
  var client_info: js.UndefOr[ClientSideLoggingClientInfoObject] = js.undefined
  
  var error_url: js.UndefOr[String] = js.undefined
  
  // Whether or not to send native js errors as well (using window.onerror).
  var hijack_console: js.UndefOr[Boolean] = js.undefined
  
  // The url to which errors logs are sent
  var info_url: js.UndefOr[String] = js.undefined
  
  // The url to which standard logs are sent
  var log_level: js.UndefOr[Double] = js.undefined
  
  // The url to which info logs are sent
  var log_url: js.UndefOr[String] = js.undefined
  
  // The level at which to log. This allows you to keep the calls to the logging in your code and just change this variable to log varying degrees. 1 = only error, 2 = error & log, 3 = error, log & info
  var native_error: js.UndefOr[Boolean] = js.undefined
  
  // Hijacks the default console functionality (ie: all your console.error/info/log are belong to us).
  var query_var: js.UndefOr[String] = js.undefined
}
object ClientSideLoggingObject {
  
  @scala.inline
  def apply(): ClientSideLoggingObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientSideLoggingObject]
  }
  
  @scala.inline
  implicit class ClientSideLoggingObjectMutableBuilder[Self <: ClientSideLoggingObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient_info(value: ClientSideLoggingClientInfoObject): Self = StObject.set(x, "client_info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClient_infoUndefined: Self = StObject.set(x, "client_info", js.undefined)
    
    @scala.inline
    def setError_url(value: String): Self = StObject.set(x, "error_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError_urlUndefined: Self = StObject.set(x, "error_url", js.undefined)
    
    @scala.inline
    def setHijack_console(value: Boolean): Self = StObject.set(x, "hijack_console", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHijack_consoleUndefined: Self = StObject.set(x, "hijack_console", js.undefined)
    
    @scala.inline
    def setInfo_url(value: String): Self = StObject.set(x, "info_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo_urlUndefined: Self = StObject.set(x, "info_url", js.undefined)
    
    @scala.inline
    def setLog_level(value: Double): Self = StObject.set(x, "log_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog_levelUndefined: Self = StObject.set(x, "log_level", js.undefined)
    
    @scala.inline
    def setLog_url(value: String): Self = StObject.set(x, "log_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog_urlUndefined: Self = StObject.set(x, "log_url", js.undefined)
    
    @scala.inline
    def setNative_error(value: Boolean): Self = StObject.set(x, "native_error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNative_errorUndefined: Self = StObject.set(x, "native_error", js.undefined)
    
    @scala.inline
    def setQuery_var(value: String): Self = StObject.set(x, "query_var", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery_varUndefined: Self = StObject.set(x, "query_var", js.undefined)
  }
}
