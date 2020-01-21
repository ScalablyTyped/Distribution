package typings.hypertextApplicationLanguage.Hal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describe a HAL Link object
  *
  * https://tools.ietf.org/html/draft-kelly-json-hal-06#section-5
  */
trait Link extends js.Object {
  var deprecation: js.UndefOr[String] = js.undefined
  var href: String
  var hreflang: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var profile: js.UndefOr[String] = js.undefined
  var templated: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Link {
  @scala.inline
  def apply(
    href: String,
    deprecation: String = null,
    hreflang: String = null,
    name: String = null,
    profile: String = null,
    templated: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    `type`: String = null
  ): Link = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (deprecation != null) __obj.updateDynamic("deprecation")(deprecation.asInstanceOf[js.Any])
    if (hreflang != null) __obj.updateDynamic("hreflang")(hreflang.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    if (!js.isUndefined(templated)) __obj.updateDynamic("templated")(templated.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
}

