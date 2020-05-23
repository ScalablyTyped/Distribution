package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Certs extends js.Object {
  var certs: js.Array[String]
  var content: StringParam
  var signerInfos: js.Array[HashAlg]
}

object Certs {
  @scala.inline
  def apply(certs: js.Array[String], content: StringParam, signerInfos: js.Array[HashAlg]): Certs = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certs]
  }
}

