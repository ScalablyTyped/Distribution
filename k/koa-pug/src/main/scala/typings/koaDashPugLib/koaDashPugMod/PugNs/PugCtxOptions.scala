package typings
package koaDashPugLib.koaDashPugMod.PugNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PugCtxOptions extends PugOptions {
  var fromString: scala.Boolean
}

object PugCtxOptions {
  @scala.inline
  def apply(
    fromString: scala.Boolean,
    app: koaLib.koaMod.namespaced[_, js.Object] = null,
    basedir: java.lang.String = null,
    compileDebug: js.UndefOr[scala.Boolean] = js.undefined,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    helperPath: java.lang.String | (js.Array[java.lang.String | org.scalablytyped.runtime.StringDictionary[_]]) = null,
    locals: PugLocals = null,
    noCache: js.UndefOr[scala.Boolean] = js.undefined,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    viewPath: java.lang.String = null
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

