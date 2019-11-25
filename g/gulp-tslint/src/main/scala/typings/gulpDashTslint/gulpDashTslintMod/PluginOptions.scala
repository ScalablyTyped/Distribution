package typings.gulpDashTslint.gulpDashTslintMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginOptions extends js.Object {
  var configuration: js.UndefOr[js.Any] = js.undefined
  var fix: js.UndefOr[Boolean] = js.undefined
  var formatter: js.UndefOr[String | js.Function] = js.undefined
  var formattersDirectory: js.UndefOr[String] = js.undefined
  var program: js.UndefOr[js.Any] = js.undefined
  var rulesDirectory: js.UndefOr[String] = js.undefined
  var tslint: js.UndefOr[js.Any] = js.undefined
}

object PluginOptions {
  @scala.inline
  def apply(
    configuration: js.Any = null,
    fix: js.UndefOr[Boolean] = js.undefined,
    formatter: String | js.Function = null,
    formattersDirectory: String = null,
    program: js.Any = null,
    rulesDirectory: String = null,
    tslint: js.Any = null
  ): PluginOptions = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (!js.isUndefined(fix)) __obj.updateDynamic("fix")(fix.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (formattersDirectory != null) __obj.updateDynamic("formattersDirectory")(formattersDirectory.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    if (rulesDirectory != null) __obj.updateDynamic("rulesDirectory")(rulesDirectory.asInstanceOf[js.Any])
    if (tslint != null) __obj.updateDynamic("tslint")(tslint.asInstanceOf[js.Any])
    __obj.asInstanceOf[PluginOptions]
  }
}

