package typings.ldapjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDnAttributes extends js.Object {
  var dnAttributes: js.UndefOr[Boolean] = js.undefined
  var matchType: js.UndefOr[String] = js.undefined
  var rule: js.UndefOr[String] = js.undefined
  var value: String
}

object AnonDnAttributes {
  @scala.inline
  def apply(
    value: String,
    dnAttributes: js.UndefOr[Boolean] = js.undefined,
    matchType: String = null,
    rule: String = null
  ): AnonDnAttributes = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(dnAttributes)) __obj.updateDynamic("dnAttributes")(dnAttributes.asInstanceOf[js.Any])
    if (matchType != null) __obj.updateDynamic("matchType")(matchType.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDnAttributes]
  }
}

