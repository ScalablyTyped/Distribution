package typings.koaDashPug.koaDashPugMod

import org.scalablytyped.runtime.StringDictionary
import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderOptions extends PugOptions {
  /**
    * Render template string instead template file
    */
  var fromString: js.UndefOr[Boolean] = js.undefined
}

object RenderOptions {
  @scala.inline
  def apply(
    app: ^[DefaultState, DefaultContext] = null,
    basedir: String = null,
    cache: js.UndefOr[Boolean] = js.undefined,
    compileDebug: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    doctype: String = null,
    filename: String = null,
    filters: js.Any = null,
    fromString: js.UndefOr[Boolean] = js.undefined,
    globals: js.Array[String] = null,
    helperPath: js.Array[_] = null,
    inlineRuntimeFunctions: js.UndefOr[Boolean] = js.undefined,
    locals: StringDictionary[js.Any] = null,
    name: String = null,
    pretty: Boolean | String = null,
    self: js.UndefOr[Boolean] = js.undefined,
    viewPath: String = null
  ): RenderOptions = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app)
    if (basedir != null) __obj.updateDynamic("basedir")(basedir)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(compileDebug)) __obj.updateDynamic("compileDebug")(compileDebug)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (doctype != null) __obj.updateDynamic("doctype")(doctype)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    if (!js.isUndefined(fromString)) __obj.updateDynamic("fromString")(fromString)
    if (globals != null) __obj.updateDynamic("globals")(globals)
    if (helperPath != null) __obj.updateDynamic("helperPath")(helperPath)
    if (!js.isUndefined(inlineRuntimeFunctions)) __obj.updateDynamic("inlineRuntimeFunctions")(inlineRuntimeFunctions)
    if (locals != null) __obj.updateDynamic("locals")(locals)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pretty != null) __obj.updateDynamic("pretty")(pretty.asInstanceOf[js.Any])
    if (!js.isUndefined(self)) __obj.updateDynamic("self")(self)
    if (viewPath != null) __obj.updateDynamic("viewPath")(viewPath)
    __obj.asInstanceOf[RenderOptions]
  }
}

