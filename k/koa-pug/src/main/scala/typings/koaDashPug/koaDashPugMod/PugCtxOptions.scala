package typings.koaDashPug.koaDashPugMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PugCtxOptions extends PugOptions {
  var fromString: Boolean
}

object PugCtxOptions {
  @scala.inline
  def apply(
    fromString: Boolean,
    app: typings.koa.koaMod.^[_, js.Object] = null,
    basedir: String = null,
    compileDebug: js.UndefOr[Boolean] = js.undefined,
    debug: js.UndefOr[Boolean] = js.undefined,
    helperPath: String | (js.Array[String | StringDictionary[_]]) = null,
    locals: PugLocals = null,
    noCache: js.UndefOr[Boolean] = js.undefined,
    pretty: js.UndefOr[Boolean] = js.undefined,
    viewPath: String = null
  ): PugCtxOptions = {
    val __obj = js.Dynamic.literal(fromString = fromString)
    if (app != null) __obj.updateDynamic("app")(app)
    if (basedir != null) __obj.updateDynamic("basedir")(basedir)
    if (!js.isUndefined(compileDebug)) __obj.updateDynamic("compileDebug")(compileDebug)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (helperPath != null) __obj.updateDynamic("helperPath")(helperPath.asInstanceOf[js.Any])
    if (locals != null) __obj.updateDynamic("locals")(locals)
    if (!js.isUndefined(noCache)) __obj.updateDynamic("noCache")(noCache)
    if (!js.isUndefined(pretty)) __obj.updateDynamic("pretty")(pretty)
    if (viewPath != null) __obj.updateDynamic("viewPath")(viewPath)
    __obj.asInstanceOf[PugCtxOptions]
  }
}

