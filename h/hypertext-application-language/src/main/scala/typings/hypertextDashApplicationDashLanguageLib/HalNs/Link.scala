package typings
package hypertextDashApplicationDashLanguageLib.HalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describe a HAL Link object
  *
  * https://tools.ietf.org/html/draft-kelly-json-hal-06#section-5
  */
trait Link extends js.Object {
  var deprecation: js.UndefOr[java.lang.String] = js.undefined
  var href: java.lang.String
  var hreflang: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var profile: js.UndefOr[java.lang.String] = js.undefined
  var templated: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Link {
  @scala.inline
  def apply(
    href: java.lang.String,
    deprecation: java.lang.String = null,
    hreflang: java.lang.String = null,
    name: java.lang.String = null,
    profile: java.lang.String = null,
    templated: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    `type`: java.lang.String = null
  ): Link = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("href")(href)
    if (deprecation != null) __obj.updateDynamic("deprecation")(deprecation)
    if (hreflang != null) __obj.updateDynamic("hreflang")(hreflang)
    if (name != null) __obj.updateDynamic("name")(name)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (!js.isUndefined(templated)) __obj.updateDynamic("templated")(templated)
    if (title != null) __obj.updateDynamic("title")(title)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Link]
  }
}

