package typings.jsrsasign

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Asn1params extends js.Object {
  var asn1params: js.UndefOr[ASN1Object] = js.undefined
  var name: String
  var paramempty: js.UndefOr[Boolean] = js.undefined
}

object Anon_Asn1params {
  @scala.inline
  def apply(name: String, asn1params: ASN1Object = null, paramempty: js.UndefOr[Boolean] = js.undefined): Anon_Asn1params = {
    val __obj = js.Dynamic.literal(name = name)
    if (asn1params != null) __obj.updateDynamic("asn1params")(asn1params)
    if (!js.isUndefined(paramempty)) __obj.updateDynamic("paramempty")(paramempty)
    __obj.asInstanceOf[Anon_Asn1params]
  }
}

