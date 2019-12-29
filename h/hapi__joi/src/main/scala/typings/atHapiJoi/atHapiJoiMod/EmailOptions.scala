package typings.atHapiJoi.atHapiJoiMod

import typings.atHapiJoi.atHapiJoiBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailOptions extends js.Object {
  /**
    * If `true`, Unicode characters are permitted
    *
    * @default true
    */
  var allowUnicode: js.UndefOr[Boolean] = js.undefined
  /**
    * if `true`, ignore invalid email length errors.
    *
    * @default false
    */
  var ignoreLength: js.UndefOr[Boolean] = js.undefined
  /**
    * Number of segments required for the domain. Be careful since some domains, such as `io`, directly allow email.
    *
    * @default 2
    */
  var minDomainSegments: js.UndefOr[Double] = js.undefined
  /**
    * if true, allows multiple email addresses in a single string, separated by , or the separator characters.
    *
    * @default false
    */
  var multiple: js.UndefOr[Boolean] = js.undefined
  /**
    * when multiple is true, overrides the default , separator. String can be a single character or multiple separator characters.
    *
    * @default ','
    */
  var separator: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Options for TLD (top level domain) validation. By default, the TLD must be a valid name listed on the [IANA registry](http://data.iana.org/TLD/tlds-alpha-by-domain.txt)
    *
    * @default { allow: true }
    */
  var tlds: js.UndefOr[TopLevelDomainOptions | `false`] = js.undefined
}

object EmailOptions {
  @scala.inline
  def apply(
    allowUnicode: js.UndefOr[Boolean] = js.undefined,
    ignoreLength: js.UndefOr[Boolean] = js.undefined,
    minDomainSegments: Int | Double = null,
    multiple: js.UndefOr[Boolean] = js.undefined,
    separator: String | js.Array[String] = null,
    tlds: TopLevelDomainOptions | `false` = null
  ): EmailOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnicode)) __obj.updateDynamic("allowUnicode")(allowUnicode.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreLength)) __obj.updateDynamic("ignoreLength")(ignoreLength.asInstanceOf[js.Any])
    if (minDomainSegments != null) __obj.updateDynamic("minDomainSegments")(minDomainSegments.asInstanceOf[js.Any])
    if (!js.isUndefined(multiple)) __obj.updateDynamic("multiple")(multiple.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (tlds != null) __obj.updateDynamic("tlds")(tlds.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailOptions]
  }
}

