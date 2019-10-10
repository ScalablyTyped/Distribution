package typings.atHapiJoi.atHapiJoiMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UriOptions extends js.Object {
  /**
    * Allows unencoded square brackets inside the query string.
    * This is NOT RFC 3986 compliant but query strings like abc[]=123&abc[]=456 are very common these days.
    *
    * @default false
    */
  var allowQuerySquareBrackets: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow relative URIs.
    *
    * @default false
    */
  var allowRelative: js.UndefOr[Boolean] = js.undefined
  /**
    * Validate the domain component using the options specified in `string.domain()`.
    */
  var domain: js.UndefOr[Boolean] = js.undefined
  /**
    * Restrict only relative URIs.
    *
    * @default false
    */
  var relativeOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * Specifies one or more acceptable Schemes, should only include the scheme name.
    * Can be an Array or String (strings are automatically escaped for use in a Regular Expression).
    */
  var scheme: js.UndefOr[String | RegExp | (js.Array[String | RegExp])] = js.undefined
}

object UriOptions {
  @scala.inline
  def apply(
    allowQuerySquareBrackets: js.UndefOr[Boolean] = js.undefined,
    allowRelative: js.UndefOr[Boolean] = js.undefined,
    domain: js.UndefOr[Boolean] = js.undefined,
    relativeOnly: js.UndefOr[Boolean] = js.undefined,
    scheme: String | RegExp | (js.Array[String | RegExp]) = null
  ): UriOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowQuerySquareBrackets)) __obj.updateDynamic("allowQuerySquareBrackets")(allowQuerySquareBrackets)
    if (!js.isUndefined(allowRelative)) __obj.updateDynamic("allowRelative")(allowRelative)
    if (!js.isUndefined(domain)) __obj.updateDynamic("domain")(domain)
    if (!js.isUndefined(relativeOnly)) __obj.updateDynamic("relativeOnly")(relativeOnly)
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[UriOptions]
  }
}

