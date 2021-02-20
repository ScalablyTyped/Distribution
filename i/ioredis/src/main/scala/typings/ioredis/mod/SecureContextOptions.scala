package typings.ioredis.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecureContextOptions extends StObject {
  
  var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  
  var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  
  var ciphers: js.UndefOr[String] = js.native
  
  var clientCertEngine: js.UndefOr[String] = js.native
  
  var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
  
  var dhparam: js.UndefOr[String | Buffer] = js.native
  
  var ecdhCurve: js.UndefOr[String] = js.native
  
  var honorCipherOrder: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[String | Buffer | (js.Array[Buffer | js.Object])] = js.native
  
  /**
    * Optionally set the maximum TLS version to allow. One
    * of `'TLSv1.3'`, `'TLSv1.2'`, `'TLSv1.1'`, or `'TLSv1'`. Cannot be specified along with the
    * `secureProtocol` option, use one or the other.
    * **Default:** `'TLSv1.3'`, unless changed using CLI options. Using
    * `--tls-max-v1.2` sets the default to `'TLSv1.2'`. Using `--tls-max-v1.3` sets the default to
    * `'TLSv1.3'`. If multiple of the options are provided, the highest maximum is used.
    */
  var maxVersion: js.UndefOr[SecureVersion] = js.native
  
  /**
    * Optionally set the minimum TLS version to allow. One
    * of `'TLSv1.3'`, `'TLSv1.2'`, `'TLSv1.1'`, or `'TLSv1'`. Cannot be specified along with the
    * `secureProtocol` option, use one or the other.  It is not recommended to use
    * less than TLSv1.2, but it may be required for interoperability.
    * **Default:** `'TLSv1.2'`, unless changed using CLI options. Using
    * `--tls-v1.0` sets the default to `'TLSv1'`. Using `--tls-v1.1` sets the default to
    * `'TLSv1.1'`. Using `--tls-min-v1.3` sets the default to
    * 'TLSv1.3'. If multiple of the options are provided, the lowest minimum is used.
    */
  var minVersion: js.UndefOr[SecureVersion] = js.native
  
  var passphrase: js.UndefOr[String] = js.native
  
  var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | js.Object])] = js.native
  
  var secureOptions: js.UndefOr[Double] = js.native
  
  // Value is a numeric bitmask of the `SSL_OP_*` options
  var secureProtocol: js.UndefOr[String] = js.native
  
  // SSL Method, e.g. SSLv23_method
  var sessionIdContext: js.UndefOr[String] = js.native
}
object SecureContextOptions {
  
  @scala.inline
  def apply(): SecureContextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecureContextOptions]
  }
  
  @scala.inline
  implicit class SecureContextOptionsMutableBuilder[Self <: SecureContextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
    
    @scala.inline
    def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value :_*))
    
    @scala.inline
    def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
    
    @scala.inline
    def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value :_*))
    
    @scala.inline
    def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
    
    @scala.inline
    def setClientCertEngine(value: String): Self = StObject.set(x, "clientCertEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCertEngineUndefined: Self = StObject.set(x, "clientCertEngine", js.undefined)
    
    @scala.inline
    def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
    
    @scala.inline
    def setCrlVarargs(value: (String | Buffer)*): Self = StObject.set(x, "crl", js.Array(value :_*))
    
    @scala.inline
    def setDhparam(value: String | Buffer): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDhparamUndefined: Self = StObject.set(x, "dhparam", js.undefined)
    
    @scala.inline
    def setEcdhCurve(value: String): Self = StObject.set(x, "ecdhCurve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcdhCurveUndefined: Self = StObject.set(x, "ecdhCurve", js.undefined)
    
    @scala.inline
    def setHonorCipherOrder(value: Boolean): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHonorCipherOrderUndefined: Self = StObject.set(x, "honorCipherOrder", js.undefined)
    
    @scala.inline
    def setKey(value: String | Buffer | (js.Array[Buffer | js.Object])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setKeyVarargs(value: (Buffer | js.Object)*): Self = StObject.set(x, "key", js.Array(value :_*))
    
    @scala.inline
    def setMaxVersion(value: SecureVersion): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
    
    @scala.inline
    def setMinVersion(value: SecureVersion): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
    
    @scala.inline
    def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    @scala.inline
    def setPfx(value: String | Buffer | (js.Array[String | Buffer | js.Object])): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
    
    @scala.inline
    def setPfxVarargs(value: (String | Buffer | js.Object)*): Self = StObject.set(x, "pfx", js.Array(value :_*))
    
    @scala.inline
    def setSecureOptions(value: Double): Self = StObject.set(x, "secureOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureOptionsUndefined: Self = StObject.set(x, "secureOptions", js.undefined)
    
    @scala.inline
    def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
    
    @scala.inline
    def setSessionIdContext(value: String): Self = StObject.set(x, "sessionIdContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionIdContextUndefined: Self = StObject.set(x, "sessionIdContext", js.undefined)
  }
}
