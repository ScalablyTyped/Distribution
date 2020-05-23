package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.UriParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined jsrsasign.jsrsasign.KJUR.asn1.ArrayParam<jsrsasign.jsrsasign.KJUR.asn1.x509.UriParam> & {  critical ? :boolean} */
trait ArrayParamUriParamcritica extends js.Object {
  var array: js.Array[UriParam]
  var critical: js.UndefOr[Boolean] = js.undefined
}

object ArrayParamUriParamcritica {
  @scala.inline
  def apply(array: js.Array[UriParam], critical: js.UndefOr[Boolean] = js.undefined): ArrayParamUriParamcritica = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    if (!js.isUndefined(critical)) __obj.updateDynamic("critical")(critical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayParamUriParamcritica]
  }
}

