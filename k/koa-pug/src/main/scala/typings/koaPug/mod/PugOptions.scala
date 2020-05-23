package typings.koaPug.mod

import org.scalablytyped.runtime.StringDictionary
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.^
import typings.pug.mod.Options
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
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (app != null) __obj.updateDynamic("app")(app.asInstanceOf[js.Any])
    if (basedir != null) __obj.updateDynamic("basedir")(basedir.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compileDebug)) __obj.updateDynamic("compileDebug")(compileDebug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (doctype != null) __obj.updateDynamic("doctype")(doctype.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (globals != null) __obj.updateDynamic("globals")(globals.asInstanceOf[js.Any])
    if (helperPath != null) __obj.updateDynamic("helperPath")(helperPath.asInstanceOf[js.Any])
    if (!js.isUndefined(inlineRuntimeFunctions)) __obj.updateDynamic("inlineRuntimeFunctions")(inlineRuntimeFunctions.get.asInstanceOf[js.Any])
    if (locals != null) __obj.updateDynamic("locals")(locals.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pretty != null) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (!js.isUndefined(self)) __obj.updateDynamic("self")(self.get.asInstanceOf[js.Any])
    if (viewPath != null) __obj.updateDynamic("viewPath")(viewPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PugOptions]
  }
}

