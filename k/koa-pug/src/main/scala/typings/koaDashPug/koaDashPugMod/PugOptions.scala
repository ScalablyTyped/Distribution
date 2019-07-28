package typings.koaDashPug.koaDashPugMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PugOptions extends js.Object {
  var app: js.UndefOr[typings.koa.koaMod.^[_, js.Object]] = js.undefined
  var basedir: js.UndefOr[String] = js.undefined
  var compileDebug: js.UndefOr[Boolean] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var helperPath: js.UndefOr[String | (js.Array[String | StringDictionary[_]])] = js.undefined
  var locals: js.UndefOr[PugLocals] = js.undefined
  var noCache: js.UndefOr[Boolean] = js.undefined
  var pretty: js.UndefOr[Boolean] = js.undefined
  var viewPath: js.UndefOr[String] = js.undefined
}

object PugOptions {
  @scala.inline
  def apply(
    app: typings.koa.koaMod.^[_, js.Object] = null,
    basedir: String = null,
    compileDebug: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    helperPath: String | (js.Array[String | StringDictionary[_]]) = null,
    locals: PugLocals = null,
    noCache: js.UndefOr[Boolean] = js.undefined,
    pretty: js.UndefOr[Boolean] = js.undefined,
    viewPath: String = null
  ): PugOptions = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app)
    if (basedir != null) __obj.updateDynamic("basedir")(basedir)
    if (!js.isUndefined(compileDebug)) __obj.updateDynamic("compileDebug")(compileDebug)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (helperPath != null) __obj.updateDynamic("helperPath")(helperPath.asInstanceOf[js.Any])
    if (locals != null) __obj.updateDynamic("locals")(locals)
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (viewPath != null) __obj.updateDynamic("viewPath")(viewPath)
    __obj.asInstanceOf[PugOptions]
  }
}

