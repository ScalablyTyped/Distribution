package typings.ldapjs.mod

import typings.ldapjs.anon.FailAfter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientOptions extends StObject {
  
  var bindCredentials: js.UndefOr[String] = js.undefined
  
  var bindDN: js.UndefOr[String] = js.undefined
  
  var connectTimeout: js.UndefOr[Double] = js.undefined
  
  var idleTimeout: js.UndefOr[Double] = js.undefined
  
  var log: js.UndefOr[js.Any] = js.undefined
  
  var queueDisable: js.UndefOr[Boolean] = js.undefined
  
  var queueSize: js.UndefOr[Double] = js.undefined
  
  var queueTimeout: js.UndefOr[Double] = js.undefined
  
  var reconnect: js.UndefOr[Boolean | FailAfter] = js.undefined
  
  var socketPath: js.UndefOr[String] = js.undefined
  
  var strictDN: js.UndefOr[Boolean] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var tlsOptions: js.UndefOr[js.Object] = js.undefined
  
  var url: String
}
object ClientOptions {
  
  inline def apply(url: String): ClientOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
  
  extension [Self <: ClientOptions](x: Self) {
    
    inline def setBindCredentials(value: String): Self = StObject.set(x, "bindCredentials", value.asInstanceOf[js.Any])
    
    inline def setBindCredentialsUndefined: Self = StObject.set(x, "bindCredentials", js.undefined)
    
    inline def setBindDN(value: String): Self = StObject.set(x, "bindDN", value.asInstanceOf[js.Any])
    
    inline def setBindDNUndefined: Self = StObject.set(x, "bindDN", js.undefined)
    
    inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
    
    inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
    
    inline def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
    
    inline def setLog(value: js.Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setQueueDisable(value: Boolean): Self = StObject.set(x, "queueDisable", value.asInstanceOf[js.Any])
    
    inline def setQueueDisableUndefined: Self = StObject.set(x, "queueDisable", js.undefined)
    
    inline def setQueueSize(value: Double): Self = StObject.set(x, "queueSize", value.asInstanceOf[js.Any])
    
    inline def setQueueSizeUndefined: Self = StObject.set(x, "queueSize", js.undefined)
    
    inline def setQueueTimeout(value: Double): Self = StObject.set(x, "queueTimeout", value.asInstanceOf[js.Any])
    
    inline def setQueueTimeoutUndefined: Self = StObject.set(x, "queueTimeout", js.undefined)
    
    inline def setReconnect(value: Boolean | FailAfter): Self = StObject.set(x, "reconnect", value.asInstanceOf[js.Any])
    
    inline def setReconnectUndefined: Self = StObject.set(x, "reconnect", js.undefined)
    
    inline def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
    
    inline def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
    
    inline def setStrictDN(value: Boolean): Self = StObject.set(x, "strictDN", value.asInstanceOf[js.Any])
    
    inline def setStrictDNUndefined: Self = StObject.set(x, "strictDN", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTlsOptions(value: js.Object): Self = StObject.set(x, "tlsOptions", value.asInstanceOf[js.Any])
    
    inline def setTlsOptionsUndefined: Self = StObject.set(x, "tlsOptions", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
