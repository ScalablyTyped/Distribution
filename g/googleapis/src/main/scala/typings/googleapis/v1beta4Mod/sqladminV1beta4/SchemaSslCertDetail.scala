package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SslCertDetail.
  */
@js.native
trait SchemaSslCertDetail extends js.Object {
  /**
    * The public information about the cert.
    */
  var certInfo: js.UndefOr[SchemaSslCert] = js.native
  /**
    * The private key for the client cert, in pem format. Keep private in order
    * to protect your security.
    */
  var certPrivateKey: js.UndefOr[String] = js.native
}

object SchemaSslCertDetail {
  @scala.inline
  def apply(): SchemaSslCertDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslCertDetail]
  }
  @scala.inline
  implicit class SchemaSslCertDetailOps[Self <: SchemaSslCertDetail] (val x: Self) extends AnyVal {
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
    def setCertInfo(value: SchemaSslCert): Self = this.set("certInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertInfo: Self = this.set("certInfo", js.undefined)
    @scala.inline
    def setCertPrivateKey(value: String): Self = this.set("certPrivateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertPrivateKey: Self = this.set("certPrivateKey", js.undefined)
  }
  
}

