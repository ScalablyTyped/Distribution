package typings.k6.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificate extends js.Object {
  /** PEM encoded certificate. */
  var cert: String = js.native
  /** Domains certificate is valid for. */
  var domains: js.Array[String] = js.native
  /** PEM encoded certificate key. */
  var key: String = js.native
}

object Certificate {
  @scala.inline
  def apply(cert: String, domains: js.Array[String], key: String): Certificate = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], domains = domains.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificate]
  }
  @scala.inline
  implicit class CertificateOps[Self <: Certificate] (val x: Self) extends AnyVal {
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
    def setCert(value: String): Self = this.set("cert", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainsVarargs(value: String*): Self = this.set("domains", js.Array(value :_*))
    @scala.inline
    def setDomains(value: js.Array[String]): Self = this.set("domains", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
  }
  
}

