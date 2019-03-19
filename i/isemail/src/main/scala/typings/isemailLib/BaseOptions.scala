package typings
package isemailLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  var allowUnicode: js.UndefOr[scala.Boolean] = js.undefined
  var minDomainAtoms: js.UndefOr[scala.Double] = js.undefined
  var tldBlacklist: js.UndefOr[TLDList] = js.undefined
  var tldWhitelist: js.UndefOr[TLDList] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(
    allowUnicode: js.UndefOr[scala.Boolean] = js.undefined,
    minDomainAtoms: scala.Int | scala.Double = null,
    tldBlacklist: TLDList = null,
    tldWhitelist: TLDList = null
  ): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnicode)) __obj.updateDynamic("allowUnicode")(allowUnicode)
    if (minDomainAtoms != null) __obj.updateDynamic("minDomainAtoms")(minDomainAtoms.asInstanceOf[js.Any])
    if (tldBlacklist != null) __obj.updateDynamic("tldBlacklist")(tldBlacklist.asInstanceOf[js.Any])
    if (tldWhitelist != null) __obj.updateDynamic("tldWhitelist")(tldWhitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

