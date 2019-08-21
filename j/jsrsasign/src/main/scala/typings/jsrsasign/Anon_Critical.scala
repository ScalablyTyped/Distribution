package typings.jsrsasign

import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.HexParam
import typings.jsrsasign.jsrsasignNs.KJURNs.asn1Ns.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Critical extends js.Object {
  var critical: js.UndefOr[Boolean] = js.undefined
  var issuer: StringParam
  var kid: HexParam
  var sn: HexParam
}

object Anon_Critical {
  @scala.inline
  def apply(issuer: StringParam, kid: HexParam, sn: HexParam, critical: js.UndefOr[Boolean] = js.undefined): Anon_Critical = {
    val __obj = js.Dynamic.literal(issuer = issuer, kid = kid, sn = sn)
    if (!js.isUndefined(critical)) __obj.updateDynamic("critical")(critical)
    __obj.asInstanceOf[Anon_Critical]
  }
}

