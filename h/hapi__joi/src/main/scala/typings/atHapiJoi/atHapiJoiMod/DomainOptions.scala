package typings.atHapiJoi.atHapiJoiMod

import typings.atHapiJoi.atHapiJoiNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainOptions extends js.Object {
  /**
    * If `true`, Unicode characters are permitted
    *
    * @default true
    */
  var allowUnicode: js.UndefOr[Boolean] = js.undefined
  /**
    * Number of segments required for the domain.
    *
    * @default 2
    */
  var minDomainSegments: js.UndefOr[Double] = js.undefined
  /**
    * Options for TLD (top level domain) validation. By default, the TLD must be a valid name listed on the [IANA registry](http://data.iana.org/TLD/tlds-alpha-by-domain.txt)
    *
    * @default { allow: true }
    */
  var tlds: js.UndefOr[TopLevelDomainOptions | `false`] = js.undefined
}

object DomainOptions {
  @scala.inline
  def apply(
    allowUnicode: js.UndefOr[Boolean] = js.undefined,
    minDomainSegments: Int | Double = null,
    tlds: TopLevelDomainOptions | `false` = null
  ): DomainOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnicode)) __obj.updateDynamic("allowUnicode")(allowUnicode)
    if (minDomainSegments != null) __obj.updateDynamic("minDomainSegments")(minDomainSegments.asInstanceOf[js.Any])
    if (tlds != null) __obj.updateDynamic("tlds")(tlds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainOptions]
  }
}

