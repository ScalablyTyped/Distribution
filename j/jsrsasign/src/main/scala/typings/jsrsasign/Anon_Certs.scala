package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Certs extends js.Object {
  var certs: js.Array[String]
  var content: StringParam
  var signerInfos: js.Array[Anon_HashAlg]
}

object Anon_Certs {
  @scala.inline
  def apply(certs: js.Array[String], content: StringParam, signerInfos: js.Array[Anon_HashAlg]): Anon_Certs = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Certs]
  }
}

