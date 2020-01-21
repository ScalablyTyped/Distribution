package typings.jsrsasign

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsn1params extends js.Object {
  var asn1params: js.UndefOr[ASN1Object] = js.undefined
  var name: String
  var paramempty: js.UndefOr[Boolean] = js.undefined
}

object AnonAsn1params {
  @scala.inline
  def apply(name: String, asn1params: ASN1Object = null, paramempty: js.UndefOr[Boolean] = js.undefined): AnonAsn1params = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (asn1params != null) __obj.updateDynamic("asn1params")(asn1params.asInstanceOf[js.Any])
    if (!js.isUndefined(paramempty)) __obj.updateDynamic("paramempty")(paramempty.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsn1params]
  }
}

