package typings.ldapjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DnAttributes extends js.Object {
  var dnAttributes: js.UndefOr[Boolean] = js.undefined
  var matchType: js.UndefOr[String] = js.undefined
  var rule: js.UndefOr[String] = js.undefined
  var value: String
}

object DnAttributes {
  @scala.inline
  def apply(
    value: String,
    dnAttributes: js.UndefOr[Boolean] = js.undefined,
    matchType: String = null,
    rule: String = null
  ): DnAttributes = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(dnAttributes)) __obj.updateDynamic("dnAttributes")(dnAttributes.get.asInstanceOf[js.Any])
    if (matchType != null) __obj.updateDynamic("matchType")(matchType.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[DnAttributes]
  }
}

