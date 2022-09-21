package typings.jestDevServer

import typings.node.bufferMod.global.Buffer
import typings.node.tlsMod.KeyObject
import typings.node.tlsMod.PxfObject
import typings.node.tlsMod.SecureVersion
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
    
    var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var ciphers: js.UndefOr[String] = js.undefined
    
    var clientCertEngine: js.UndefOr[String] = js.undefined
    
    var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var dhparam: js.UndefOr[String | Buffer] = js.undefined
    
    var ecdhCurve: js.UndefOr[String] = js.undefined
    
    var followRedirect: js.UndefOr[Boolean] = js.undefined
    
    var headers: js.UndefOr[Record[String, Any]] = js.undefined
    
    var honorCipherOrder: js.UndefOr[Boolean] = js.undefined
    
    var httpTimeout: js.UndefOr[Double] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var key: js.UndefOr[String | Buffer | (js.Array[String | Buffer | KeyObject])] = js.undefined
    
    var log: js.UndefOr[Boolean] = js.undefined
    
    var maxVersion: js.UndefOr[SecureVersion] = js.undefined
    
    var minVersion: js.UndefOr[SecureVersion] = js.undefined
    
    var passphrase: js.UndefOr[String] = js.undefined
    
    var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | PxfObject])] = js.undefined
    
    var privateKeyEngine: js.UndefOr[String] = js.undefined
    
    var privateKeyIdentifier: js.UndefOr[String] = js.undefined
    
    var proxy: js.UndefOr[AxiosProxyConfig] = js.undefined
    
    var resources: js.UndefOr[js.Array[String]] = js.undefined
    
    var reverse: js.UndefOr[Boolean] = js.undefined
    
    var secureOptions: js.UndefOr[Double] = js.undefined
    
    var secureProtocol: js.UndefOr[String] = js.undefined
    
    var sessionIdContext: js.UndefOr[String] = js.undefined
    
    var sessionTimeout: js.UndefOr[Double] = js.undefined
    
    var sigalgs: js.UndefOr[String] = js.undefined
    
    var simultaneous: js.UndefOr[Double] = js.undefined
    
    var strictSSL: js.UndefOr[Boolean] = js.undefined
    
    var tcpTimeout: js.UndefOr[Double] = js.undefined
    
    var ticketKeys: js.UndefOr[Buffer] = js.undefined
    
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
      
      inline def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      inline def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      inline def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value*))
      
      inline def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      inline def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      inline def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value*))
      
      inline def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      inline def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      inline def setClientCertEngine(value: String): Self = StObject.set(x, "clientCertEngine", value.asInstanceOf[js.Any])
      
      inline def setClientCertEngineUndefined: Self = StObject.set(x, "clientCertEngine", js.undefined)
      
      inline def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      inline def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
      
      inline def setCrlVarargs(value: (String | Buffer)*): Self = StObject.set(x, "crl", js.Array(value*))
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDhparam(value: String | Buffer): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
      
      inline def setDhparamUndefined: Self = StObject.set(x, "dhparam", js.undefined)
      
      inline def setEcdhCurve(value: String): Self = StObject.set(x, "ecdhCurve", value.asInstanceOf[js.Any])
      
      inline def setEcdhCurveUndefined: Self = StObject.set(x, "ecdhCurve", js.undefined)
      
      inline def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
      
      inline def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
      
      inline def setHeaders(value: Record[String, Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHonorCipherOrder(value: Boolean): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
      
      inline def setHonorCipherOrderUndefined: Self = StObject.set(x, "honorCipherOrder", js.undefined)
      
      inline def setHttpTimeout(value: Double): Self = StObject.set(x, "httpTimeout", value.asInstanceOf[js.Any])
      
      inline def setHttpTimeoutUndefined: Self = StObject.set(x, "httpTimeout", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setKey(value: String | Buffer | (js.Array[String | Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setKeyVarargs(value: (String | Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value*))
      
      inline def setLog(value: Boolean): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setMaxVersion(value: SecureVersion): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
      
      inline def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
      
      inline def setMinVersion(value: SecureVersion): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
      
      inline def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
      
      inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      inline def setPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      inline def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      inline def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = StObject.set(x, "pfx", js.Array(value*))
      
      inline def setPrivateKeyEngine(value: String): Self = StObject.set(x, "privateKeyEngine", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyEngineUndefined: Self = StObject.set(x, "privateKeyEngine", js.undefined)
      
      inline def setPrivateKeyIdentifier(value: String): Self = StObject.set(x, "privateKeyIdentifier", value.asInstanceOf[js.Any])
      
      inline def setPrivateKeyIdentifierUndefined: Self = StObject.set(x, "privateKeyIdentifier", js.undefined)
      
      inline def setProxy(value: AxiosProxyConfig): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      inline def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
      
      inline def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value*))
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
      
      inline def setSecureOptions(value: Double): Self = StObject.set(x, "secureOptions", value.asInstanceOf[js.Any])
      
      inline def setSecureOptionsUndefined: Self = StObject.set(x, "secureOptions", js.undefined)
      
      inline def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      inline def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
      inline def setSessionIdContext(value: String): Self = StObject.set(x, "sessionIdContext", value.asInstanceOf[js.Any])
      
      inline def setSessionIdContextUndefined: Self = StObject.set(x, "sessionIdContext", js.undefined)
      
      inline def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
      
      inline def setSigalgs(value: String): Self = StObject.set(x, "sigalgs", value.asInstanceOf[js.Any])
      
      inline def setSigalgsUndefined: Self = StObject.set(x, "sigalgs", js.undefined)
      
      inline def setSimultaneous(value: Double): Self = StObject.set(x, "simultaneous", value.asInstanceOf[js.Any])
      
      inline def setSimultaneousUndefined: Self = StObject.set(x, "simultaneous", js.undefined)
      
      inline def setStrictSSL(value: Boolean): Self = StObject.set(x, "strictSSL", value.asInstanceOf[js.Any])
      
      inline def setStrictSSLUndefined: Self = StObject.set(x, "strictSSL", js.undefined)
      
      inline def setTcpTimeout(value: Double): Self = StObject.set(x, "tcpTimeout", value.asInstanceOf[js.Any])
      
      inline def setTcpTimeoutUndefined: Self = StObject.set(x, "tcpTimeout", js.undefined)
      
      inline def setTicketKeys(value: Buffer): Self = StObject.set(x, "ticketKeys", value.asInstanceOf[js.Any])
      
      inline def setTicketKeysUndefined: Self = StObject.set(x, "ticketKeys", js.undefined)
      
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
