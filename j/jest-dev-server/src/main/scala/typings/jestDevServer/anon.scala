package typings.jestDevServer

import typings.std.Record
import typings.waitOn.mod.AxiosProxyConfig
import typings.waitOn.mod.ValidateStatus
import typings.waitOn.mod.WaitOnAuth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<wait-on.wait-on.WaitOnOptions> */
  trait PartialWaitOnOptions extends StObject {
    
    var auth: js.UndefOr[WaitOnAuth] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var followRedirect: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[Record[String, js.Any]] = js.undefined
    
    var httpTimeout: js.UndefOr[Double] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var log: js.UndefOr[Boolean] = js.undefined
    
    var proxy: js.UndefOr[AxiosProxyConfig] = js.undefined
    
    var resources: js.UndefOr[js.Array[String]] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var simultaneous: js.UndefOr[Double] = js.undefined
    
    var strictSSL: js.UndefOr[Boolean] = js.undefined
    
    var tcpTimeout: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var validateStatus: js.UndefOr[ValidateStatus] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
    
    var window: js.UndefOr[Double] = js.undefined
  }
  object PartialWaitOnOptions {
    
    inline def apply(): PartialWaitOnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialWaitOnOptions]
    }
    
    extension [Self <: PartialWaitOnOptions](x: Self) {
      
      inline def setAuth(value: WaitOnAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
      
      inline def setHeaders(value: Record[String, js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHttpTimeout(value: Double): Self = StObject.set(x, "httpTimeout", value.asInstanceOf[js.Any])
      
      inline def setHttpTimeoutUndefined: Self = StObject.set(x, "httpTimeout", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setProxy(value: AxiosProxyConfig): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setSimultaneous(value: Double): Self = StObject.set(x, "simultaneous", value.asInstanceOf[js.Any])
      
      inline def setSimultaneousUndefined: Self = StObject.set(x, "simultaneous", js.undefined)
      
      inline def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
      
      inline def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
      
      inline def setTcpTimeout(value: Double): Self = StObject.set(x, "tcpTimeout", value.asInstanceOf[js.Any])
      
      inline def setTcpTimeoutUndefined: Self = StObject.set(x, "tcpTimeout", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setValidateStatus(value: /* status */ Double => Boolean): Self = StObject.set(x, "validateStatus", js.Any.fromFunction1(value))
      
      inline def setValidateStatusUndefined: Self = StObject.set(x, "validateStatus", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      inline def setWindow(value: Double): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
}
