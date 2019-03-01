package typings
package lassoLib.libDependenciesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyConfig extends js.Object {
  var attributes: js.UndefOr[lassoLib.Anon_Crossorigin] = js.undefined
  var `css-slot`: js.UndefOr[java.lang.String] = js.undefined
  var dependencies: js.UndefOr[js.Array[DependencyConfig | java.lang.String]] = js.undefined
  var external: js.UndefOr[scala.Boolean] = js.undefined
  var from: js.UndefOr[java.lang.String] = js.undefined
  var `if`: js.UndefOr[java.lang.String] = js.undefined
  var `if-flag`: js.UndefOr[java.lang.String] = js.undefined
  var `if-not-flag`: js.UndefOr[java.lang.String] = js.undefined
  var `inline`: js.UndefOr[java.lang.String] = js.undefined
  var `js-slot`: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var require: js.UndefOr[java.lang.String] = js.undefined
  var `require-run`: js.UndefOr[java.lang.String] = js.undefined
  var slot: js.UndefOr[java.lang.String] = js.undefined
  var to: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object DependencyConfig {
  @scala.inline
  def apply(
    attributes: lassoLib.Anon_Crossorigin = null,
    `css-slot`: java.lang.String = null,
    dependencies: js.Array[DependencyConfig | java.lang.String] = null,
    external: js.UndefOr[scala.Boolean] = js.undefined,
    from: java.lang.String = null,
    `if`: java.lang.String = null,
    `if-flag`: java.lang.String = null,
    `if-not-flag`: java.lang.String = null,
    `inline`: java.lang.String = null,
    `js-slot`: java.lang.String = null,
    path: java.lang.String = null,
    require: java.lang.String = null,
    `require-run`: java.lang.String = null,
    slot: java.lang.String = null,
    to: java.lang.String = null,
    `type`: java.lang.String = null,
    url: java.lang.String = null
  ): DependencyConfig = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (`css-slot` != null) __obj.updateDynamic("css-slot")(`css-slot`)
    if (dependencies != null) __obj.updateDynamic("dependencies")(dependencies)
    if (!js.isUndefined(external)) __obj.updateDynamic("external")(external)
    if (from != null) __obj.updateDynamic("from")(from)
    if (`if` != null) __obj.updateDynamic("if")(`if`)
    if (`if-flag` != null) __obj.updateDynamic("if-flag")(`if-flag`)
    if (`if-not-flag` != null) __obj.updateDynamic("if-not-flag")(`if-not-flag`)
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`)
    if (`js-slot` != null) __obj.updateDynamic("js-slot")(`js-slot`)
    if (path != null) __obj.updateDynamic("path")(path)
    if (require != null) __obj.updateDynamic("require")(require)
    if (`require-run` != null) __obj.updateDynamic("require-run")(`require-run`)
    if (slot != null) __obj.updateDynamic("slot")(slot)
    if (to != null) __obj.updateDynamic("to")(to)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[DependencyConfig]
  }
}

