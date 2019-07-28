package typings.gulpDashPugDashI18n.gulpDashPugDashI18nMod

import typings.gulpDashPugDashI18n.Anon_Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends typings.pug.pugMod.Options {
  var data: js.UndefOr[js.Any] = js.undefined
  var i18n: Anon_Default
}

object Options {
  @scala.inline
  def apply(
    i18n: Anon_Default,
    basedir: String = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    compileDebug: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    doctype: String = null,
    filename: String = null,
    filters: js.Any = null,
    globals: js.Array[String] = null,
    inlineRuntimeFunctions: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    pretty: Boolean | String = null,
    self: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(i18n = i18n)
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

