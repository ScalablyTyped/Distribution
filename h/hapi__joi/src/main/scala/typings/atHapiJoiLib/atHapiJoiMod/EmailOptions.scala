package typings
package atHapiJoiLib.atHapiJoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailOptions extends js.Object {
  /**
    * If `true`, Unicode characters are permitted
    *
    * @default true
    */
  var allowUnicode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Number of segments required for the domain. Be careful since some domains, such as `io`, directly allow email.
    *
    * @default 2
    */
  var minDomainSegments: js.UndefOr[scala.Double] = js.undefined
  /**
    * Options for TLD (top level domain) validation. By default, the TLD must be a valid name listed on the [IANA registry](http://data.iana.org/TLD/tlds-alpha-by-domain.txt)
    *
    * @default { allow: true }
    */
  var tlds: js.UndefOr[atHapiJoiLib.Anon_Allow | atHapiJoiLib.atHapiJoiLibNumbers.`false`] = js.undefined
}

object EmailOptions {
  @scala.inline
  def apply(
    allowUnicode: js.UndefOr[scala.Boolean] = js.undefined,
    minDomainSegments: scala.Int | scala.Double = null,
    tlds: atHapiJoiLib.Anon_Allow | atHapiJoiLib.atHapiJoiLibNumbers.`false` = null
  ): EmailOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnicode)) __obj.updateDynamic("allowUnicode")(allowUnicode)
    if (minDomainSegments != null) __obj.updateDynamic("minDomainSegments")(minDomainSegments.asInstanceOf[js.Any])
    if (tlds != null) __obj.updateDynamic("tlds")(tlds.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailOptions]
  }
}

