package typings.jsrsasign

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.StringParam
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
    val __obj = js.Dynamic.literal(certs = certs, content = content, signerInfos = signerInfos)
  
    __obj.asInstanceOf[Anon_Certs]
  }
}

