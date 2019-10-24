package typings.jxon.jxonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigOptions extends js.Object {
  var attrKey: js.UndefOr[String] = js.undefined
  var attrPrefix: js.UndefOr[String] = js.undefined
  var autoDate: js.UndefOr[Boolean] = js.undefined
  var ignorePrefixedNodes: js.UndefOr[Boolean] = js.undefined
  var lowerCaseTags: js.UndefOr[Boolean] = js.undefined
  var parseValues: js.UndefOr[Boolean] = js.undefined
  var trueIsEmpty: js.UndefOr[Boolean] = js.undefined
  var valueKey: js.UndefOr[String] = js.undefined
}

object ConfigOptions {
  @scala.inline
  def apply(
    attrKey: String = null,
    attrPrefix: String = null,
    autoDate: js.UndefOr[Boolean] = js.undefined,
    ignorePrefixedNodes: js.UndefOr[Boolean] = js.undefined,
    lowerCaseTags: js.UndefOr[Boolean] = js.undefined,
    parseValues: js.UndefOr[Boolean] = js.undefined,
    trueIsEmpty: js.UndefOr[Boolean] = js.undefined,
    valueKey: String = null
  ): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    if (attrKey != null) __obj.updateDynamic("attrKey")(attrKey)
    if (attrPrefix != null) __obj.updateDynamic("attrPrefix")(attrPrefix)
    if (!js.isUndefined(autoDate)) __obj.updateDynamic("autoDate")(autoDate)
    if (!js.isUndefined(ignorePrefixedNodes)) __obj.updateDynamic("ignorePrefixedNodes")(ignorePrefixedNodes)
    if (!js.isUndefined(lowerCaseTags)) __obj.updateDynamic("lowerCaseTags")(lowerCaseTags)
    if (!js.isUndefined(parseValues)) __obj.updateDynamic("parseValues")(parseValues)
    if (!js.isUndefined(trueIsEmpty)) __obj.updateDynamic("trueIsEmpty")(trueIsEmpty)
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey)
    __obj.asInstanceOf[ConfigOptions]
  }
}

