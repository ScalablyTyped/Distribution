package typings.ioredis.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecureContextOptions extends js.Object {
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
  implicit class SecureContextOptionsOps[Self <: SecureContextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCaVarargs(value: (String | Buffer)*): Self = this.set("ca", js.Array(value :_*))
    @scala.inline
    def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("ca", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCa: Self = this.set("ca", js.undefined)
    @scala.inline
    def setCertVarargs(value: (String | Buffer)*): Self = this.set("cert", js.Array(value :_*))
    @scala.inline
    def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    @scala.inline
    def setCiphers(value: String): Self = this.set("ciphers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCiphers: Self = this.set("ciphers", js.undefined)
    @scala.inline
    def setClientCertEngine(value: String): Self = this.set("clientCertEngine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientCertEngine: Self = this.set("clientCertEngine", js.undefined)
    @scala.inline
    def setCrlVarargs(value: (String | Buffer)*): Self = this.set("crl", js.Array(value :_*))
    @scala.inline
    def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = this.set("crl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrl: Self = this.set("crl", js.undefined)
    @scala.inline
    def setDhparam(value: String | Buffer): Self = this.set("dhparam", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDhparam: Self = this.set("dhparam", js.undefined)
    @scala.inline
    def setEcdhCurve(value: String): Self = this.set("ecdhCurve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcdhCurve: Self = this.set("ecdhCurve", js.undefined)
    @scala.inline
    def setHonorCipherOrder(value: Boolean): Self = this.set("honorCipherOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHonorCipherOrder: Self = this.set("honorCipherOrder", js.undefined)
    @scala.inline
    def setKeyVarargs(value: (Buffer | js.Object)*): Self = this.set("key", js.Array(value :_*))
    @scala.inline
    def setKey(value: String | Buffer | (js.Array[Buffer | js.Object])): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMaxVersion(value: SecureVersion): Self = this.set("maxVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxVersion: Self = this.set("maxVersion", js.undefined)
    @scala.inline
    def setMinVersion(value: SecureVersion): Self = this.set("minVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinVersion: Self = this.set("minVersion", js.undefined)
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
    @scala.inline
    def setPfxVarargs(value: (String | Buffer | js.Object)*): Self = this.set("pfx", js.Array(value :_*))
    @scala.inline
    def setPfx(value: String | Buffer | (js.Array[String | Buffer | js.Object])): Self = this.set("pfx", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePfx: Self = this.set("pfx", js.undefined)
    @scala.inline
    def setSecureOptions(value: Double): Self = this.set("secureOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureOptions: Self = this.set("secureOptions", js.undefined)
    @scala.inline
    def setSecureProtocol(value: String): Self = this.set("secureProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureProtocol: Self = this.set("secureProtocol", js.undefined)
    @scala.inline
    def setSessionIdContext(value: String): Self = this.set("sessionIdContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSessionIdContext: Self = this.set("sessionIdContext", js.undefined)
  }
  
}

