package typings.imapflow.mod

import typings.imapflow.anon.AccessToken
import typings.imapflow.imapflowBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImapFlowOptions extends StObject {
  
  var auth: AccessToken
  
  var clientInfo: js.UndefOr[IdInfoObject] = js.undefined
  
  var disableAutoIdle: js.UndefOr[Boolean] = js.undefined
  
  var disableCompression: js.UndefOr[Boolean] = js.undefined
  
  var emitLogs: js.UndefOr[Boolean] = js.undefined
  
  var host: String
  
  var logger: js.UndefOr[Logger | `false`] = js.undefined
  
  var port: Double
  
  var secure: js.UndefOr[Boolean] = js.undefined
  
  var servername: js.UndefOr[String] = js.undefined
  
  var tls: js.UndefOr[js.Object] = js.undefined
  
  var verifyOnly: js.UndefOr[Boolean] = js.undefined
}
object ImapFlowOptions {
  
  inline def apply(auth: AccessToken, host: String, port: Double): ImapFlowOptions = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImapFlowOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImapFlowOptions] (val x: Self) extends AnyVal {
    
    inline def setAuth(value: AccessToken): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setClientInfo(value: IdInfoObject): Self = StObject.set(x, "clientInfo", value.asInstanceOf[js.Any])
    
    inline def setClientInfoUndefined: Self = StObject.set(x, "clientInfo", js.undefined)
    
    inline def setDisableAutoIdle(value: Boolean): Self = StObject.set(x, "disableAutoIdle", value.asInstanceOf[js.Any])
    
    inline def setDisableAutoIdleUndefined: Self = StObject.set(x, "disableAutoIdle", js.undefined)
    
    inline def setDisableCompression(value: Boolean): Self = StObject.set(x, "disableCompression", value.asInstanceOf[js.Any])
    
    inline def setDisableCompressionUndefined: Self = StObject.set(x, "disableCompression", js.undefined)
    
    inline def setEmitLogs(value: Boolean): Self = StObject.set(x, "emitLogs", value.asInstanceOf[js.Any])
    
    inline def setEmitLogsUndefined: Self = StObject.set(x, "emitLogs", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: Logger | `false`): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
    
    inline def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
    
    inline def setTls(value: js.Object): Self = StObject.set(x, "tls", value.asInstanceOf[js.Any])
    
    inline def setTlsUndefined: Self = StObject.set(x, "tls", js.undefined)
    
    inline def setVerifyOnly(value: Boolean): Self = StObject.set(x, "verifyOnly", value.asInstanceOf[js.Any])
    
    inline def setVerifyOnlyUndefined: Self = StObject.set(x, "verifyOnly", js.undefined)
  }
}
