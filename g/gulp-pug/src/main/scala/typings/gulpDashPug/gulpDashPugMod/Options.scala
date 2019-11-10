package typings.gulpDashPug.gulpDashPugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Any options from [Pug's API](https://pugjs.org/api/reference.html) in addition to `pug`'s own options.
  */
trait Options
  extends typings.pug.pugMod.Options {
  /**
    * Compile Pug to JavaScript code.
    */
  var client: js.UndefOr[Boolean] = js.undefined
  /**
    * Same as `opts.locals`.
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * Locals to compile the Pug with. You can also provide locals through the `data` field of the file object,
    * e.g. with [`gulp-data`](https://npmjs.com/gulp-data). They will be merged with `opts.locals`.
    */
  var locals: js.UndefOr[js.Any] = js.undefined
  /**
    * A custom instance of Pug for `gulp-pug` to use.
    */
  var pug: js.UndefOr[js.Any] = js.undefined
  /**
    * Display name of file from stream that is being compiled.
    */
  var verbose: js.UndefOr[Boolean] = js.undefined
}

object Options {
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
  ): Options = {
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
    __obj.asInstanceOf[Options]
  }
}

