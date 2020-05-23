package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Failinfo extends js.Object {
  var failinfo: js.UndefOr[NameParam | IntegerParam] = js.undefined
  var statstr: js.UndefOr[ArrayParam[String]] = js.undefined
  var status: NameParam
}

object Failinfo {
  @scala.inline
  def apply(status: NameParam, failinfo: NameParam | IntegerParam = null, statstr: ArrayParam[String] = null): Failinfo = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (failinfo != null) __obj.updateDynamic("failinfo")(failinfo.asInstanceOf[js.Any])
    if (statstr != null) __obj.updateDynamic("statstr")(statstr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failinfo]
  }
}

