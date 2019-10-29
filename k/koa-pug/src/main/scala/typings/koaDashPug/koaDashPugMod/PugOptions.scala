package typings.koaDashPug.koaDashPugMod

import org.scalablytyped.runtime.StringDictionary
import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.^
import typings.pug.pugMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PugOptions
  extends Options
     with /* key */ StringDictionary[js.Any] {
  /**
    * Koa instance
    */
  var app: js.UndefOr[^[DefaultState, DefaultContext]] = js.undefined
  /**
    * Paths of helpers.
    */
  var helperPath: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Add a list of variables to make accessible in templates
    */
  var locals: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * The root directory of all Pug templates
    */
  var viewPath: js.UndefOr[String] = js.undefined
}

object PugOptions {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    app: ^[DefaultState, DefaultContext] = null,
    basedir: String = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    compileDebug: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    doctype: String = null,
    filename: String = null,
    filters: js.Any = null,
    globals: js.Array[String] = null,
    helperPath: js.Array[_] = null,
    inlineRuntimeFunctions: js.UndefOr[Boolean] = js.undefined,
    locals: StringDictionary[js.Any] = null,
    name: String = null,
    pretty: Boolean | String = null,
    self: js.UndefOr[Boolean] = js.undefined,
    viewPath: String = null
  ): PugOptions = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (app != null) __obj.updateDynamic("app")(app)
    if (basedir != null) __obj.updateDynamic("basedir")(basedir)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(compileDebug)) __obj.updateDynamic("compileDebug")(compileDebug)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (doctype != null) __obj.updateDynamic("doctype")(doctype)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (helperPath != null) __obj.updateDynamic("helperPath")(helperPath)
    if (!js.isUndefined(inlineRuntimeFunctions)) __obj.updateDynamic("inlineRuntimeFunctions")(inlineRuntimeFunctions)
    if (locals != null) __obj.updateDynamic("locals")(locals)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pretty != null) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (!js.isUndefined(self)) __obj.updateDynamic("self")(self)
    if (viewPath != null) __obj.updateDynamic("viewPath")(viewPath)
    __obj.asInstanceOf[PugOptions]
  }
}

