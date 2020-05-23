package typings.lasso.dependenciesMod

import typings.lasso.anon.Crossorigin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyConfig extends js.Object {
  var attributes: js.UndefOr[Crossorigin] = js.undefined
  var `css-slot`: js.UndefOr[String] = js.undefined
  var dependencies: js.UndefOr[js.Array[DependencyConfig | String]] = js.undefined
  var external: js.UndefOr[Boolean] = js.undefined
  var from: js.UndefOr[String] = js.undefined
  var `if`: js.UndefOr[String] = js.undefined
  var `if-flag`: js.UndefOr[String] = js.undefined
  var `if-not-flag`: js.UndefOr[String] = js.undefined
  var `inline`: js.UndefOr[String] = js.undefined
  var `js-slot`: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var require: js.UndefOr[String] = js.undefined
  var `require-run`: js.UndefOr[String] = js.undefined
  var slot: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object DependencyConfig {
  @scala.inline
  def apply(
    attributes: Crossorigin = null,
    `css-slot`: String = null,
    dependencies: js.Array[DependencyConfig | String] = null,
    external: js.UndefOr[Boolean] = js.undefined,
    from: String = null,
    `if`: String = null,
    `if-flag`: String = null,
    `if-not-flag`: String = null,
    `inline`: String = null,
    `js-slot`: String = null,
    path: String = null,
    require: String = null,
    `require-run`: String = null,
    slot: String = null,
    to: String = null,
    `type`: String = null,
    url: String = null
  ): DependencyConfig = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (`css-slot` != null) __obj.updateDynamic("css-slot")(`css-slot`.asInstanceOf[js.Any])
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies.asInstanceOf[js.Any])
    if (!js.isUndefined(external)) __obj.updateDynamic("external")(external.get.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (`if` != null) __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    if (`if-flag` != null) __obj.updateDynamic("if-flag")(`if-flag`.asInstanceOf[js.Any])
    if (`if-not-flag` != null) __obj.updateDynamic("if-not-flag")(`if-not-flag`.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (`js-slot` != null) __obj.updateDynamic("js-slot")(`js-slot`.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (require != null) __obj.updateDynamic("require")(require.asInstanceOf[js.Any])
    if (`require-run` != null) __obj.updateDynamic("require-run")(`require-run`.asInstanceOf[js.Any])
    if (slot != null) __obj.updateDynamic("slot")(slot.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyConfig]
  }
}

