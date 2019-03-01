package typings
package gulpDashTslintLib.gulpDashTslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginOptions extends js.Object {
  var configuration: js.UndefOr[js.Any] = js.undefined
  var fix: js.UndefOr[scala.Boolean] = js.undefined
  var formatter: js.UndefOr[java.lang.String | js.Function] = js.undefined
  var formattersDirectory: js.UndefOr[java.lang.String] = js.undefined
  var program: js.UndefOr[js.Any] = js.undefined
  var rulesDirectory: js.UndefOr[java.lang.String] = js.undefined
  var tslint: js.UndefOr[js.Any] = js.undefined
}

object PluginOptions {
  @scala.inline
  def apply(
    configuration: js.Any = null,
    fix: js.UndefOr[scala.Boolean] = js.undefined,
    formatter: java.lang.String | js.Function = null,
    formattersDirectory: java.lang.String = null,
    program: js.Any = null,
    rulesDirectory: java.lang.String = null,
    tslint: js.Any = null
  ): PluginOptions = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration)
    if (!js.isUndefined(fix)) __obj.updateDynamic("fix")(fix)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (formattersDirectory != null) __obj.updateDynamic("formattersDirectory")(formattersDirectory)
    if (program != null) __obj.updateDynamic("program")(program)
    if (rulesDirectory != null) __obj.updateDynamic("rulesDirectory")(rulesDirectory)
    if (tslint != null) __obj.updateDynamic("tslint")(tslint)
    __obj.asInstanceOf[PluginOptions]
  }
}

