package typings.gulpDashPug.gulpDashPugMod

import typings.pug.pugMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends Options {
  var client: js.UndefOr[Boolean] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var locals: js.UndefOr[js.Any] = js.undefined
  var pug: js.UndefOr[js.Any] = js.undefined
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Params {
  @scala.inline
  def apply(
    basedir: String = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    client: js.UndefOr[Boolean] = js.undefined,
    compileDebug: js.UndefOr[Boolean] = js.undefined,
    data: js.Any = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    doctype: String = null,
    filename: String = null,
    filters: js.Any = null,
    globals: js.Array[String] = null,
    inlineRuntimeFunctions: js.UndefOr[Boolean] = js.undefined,
    locals: js.Any = null,
    name: String = null,
    pretty: Boolean | String = null,
    pug: js.Any = null,
    self: js.UndefOr[Boolean] = js.undefined,
    verbose: js.UndefOr[Boolean] = js.undefined
  ): Params = {
    val __obj = js.Dynamic.literal()
    if (basedir != null) __obj.updateDynamic("basedir")(basedir)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(client)) __obj.updateDynamic("client")(client)
    if (!js.isUndefined(compileDebug)) __obj.updateDynamic("compileDebug")(compileDebug)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (doctype != null) __obj.updateDynamic("doctype")(doctype)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (!js.isUndefined(inlineRuntimeFunctions)) __obj.updateDynamic("inlineRuntimeFunctions")(inlineRuntimeFunctions)
    if (locals != null) __obj.updateDynamic("locals")(locals)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pretty != null) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (pug != null) __obj.updateDynamic("pug")(pug)
    if (!js.isUndefined(self)) __obj.updateDynamic("self")(self)
    if (!js.isUndefined(verbose)) __obj.updateDynamic("verbose")(verbose)
    __obj.asInstanceOf[Params]
  }
}

