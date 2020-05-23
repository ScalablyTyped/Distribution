package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Critical extends js.Object {
  var critical: js.UndefOr[Boolean] = js.undefined
  var issuer: StringParam
  var kid: HexParam
  var sn: HexParam
}

object Critical {
  @scala.inline
  def apply(issuer: StringParam, kid: HexParam, sn: HexParam, critical: js.UndefOr[Boolean] = js.undefined): Critical = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], kid = kid.asInstanceOf[js.Any], sn = sn.asInstanceOf[js.Any])
    if (!js.isUndefined(critical)) __obj.updateDynamic("critical")(critical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Critical]
  }
}

