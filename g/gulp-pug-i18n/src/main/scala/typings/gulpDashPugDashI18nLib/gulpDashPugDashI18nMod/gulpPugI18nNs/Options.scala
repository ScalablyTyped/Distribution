package typings
package gulpDashPugDashI18nLib.gulpDashPugDashI18nMod.gulpPugI18nNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends pugLib.pugMod.Options {
  var data: js.UndefOr[js.Any] = js.undefined
  var i18n: gulpDashPugDashI18nLib.Anon_Default
}

object Options {
  @scala.inline
  def apply(
    i18n: gulpDashPugDashI18nLib.Anon_Default,
    basedir: java.lang.String = null,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    compileDebug: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Any = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    doctype: java.lang.String = null,
    filename: java.lang.String = null,
    filters: js.Any = null,
    globals: js.Array[java.lang.String] = null,
    inlineRuntimeFunctions: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    pretty: scala.Boolean | java.lang.String = null,
    self: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("i18n")(i18n)
    if (basedir != null) __obj.updateDynamic("basedir")(basedir)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(compileDebug)) __obj.updateDynamic("compileDebug")(compileDebug)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (doctype != null) __obj.updateDynamic("doctype")(doctype)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (!js.isUndefined(inlineRuntimeFunctions)) __obj.updateDynamic("inlineRuntimeFunctions")(inlineRuntimeFunctions)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pretty != null) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (!js.isUndefined(self)) __obj.updateDynamic("self")(self)
    __obj.asInstanceOf[Options]
  }
}

