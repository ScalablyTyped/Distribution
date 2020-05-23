package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jsrsasign.jsrsasign.KJUR.asn1.x509.X500NameParam & {  certissuer ? :string,   certsubject ? :string} */
trait X500NameParamcertissuerst extends js.Object {
  var C: String
  var CN: String
  var O: String
  var certissuer: js.UndefOr[String] = js.undefined
  var certsubject: js.UndefOr[String] = js.undefined
}

object X500NameParamcertissuerst {
  @scala.inline
  def apply(C: String, CN: String, O: String, certissuer: String = null, certsubject: String = null): X500NameParamcertissuerst = {
    val __obj = js.Dynamic.literal(C = C.asInstanceOf[js.Any], CN = CN.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any])
    if (certissuer != null) __obj.updateDynamic("certissuer")(certissuer.asInstanceOf[js.Any])
    if (certsubject != null) __obj.updateDynamic("certsubject")(certsubject.asInstanceOf[js.Any])
    __obj.asInstanceOf[X500NameParamcertissuerst]
  }
}

