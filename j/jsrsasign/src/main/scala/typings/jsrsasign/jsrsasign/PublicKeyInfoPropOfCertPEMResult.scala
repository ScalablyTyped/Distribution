package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKeyInfoPropOfCertPEMResult extends js.Object {
  /** hexadecimal string of OID of asymmetric key algorithm */
  var algoid: String = js.native
  /** hexadecimal string of OID of ECC curve name or null */
  var algparam: String | Null = js.native
  /** hexadecimal string of key in the certificate */
  var keyhex: String = js.native
}

object PublicKeyInfoPropOfCertPEMResult {
  @scala.inline
  def apply(algoid: String, keyhex: String): PublicKeyInfoPropOfCertPEMResult = {
    val __obj = js.Dynamic.literal(algoid = algoid.asInstanceOf[js.Any], keyhex = keyhex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyInfoPropOfCertPEMResult]
  }
  @scala.inline
  implicit class PublicKeyInfoPropOfCertPEMResultOps[Self <: PublicKeyInfoPropOfCertPEMResult] (val x: Self) extends AnyVal {
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
    def setAlgoid(value: String): Self = this.set("algoid", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyhex(value: String): Self = this.set("keyhex", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlgparam(value: String): Self = this.set("algparam", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlgparamNull: Self = this.set("algparam", null)
  }
  
}

