package typings
package koaDashPugLib.koaDashPugMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PugOptions extends js.Object {
  var app: js.UndefOr[koaLib.koaMod.^[_, js.Object]] = js.undefined
  var basedir: js.UndefOr[java.lang.String] = js.undefined
  var compileDebug: js.UndefOr[scala.Boolean] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var helperPath: js.UndefOr[
    java.lang.String | (js.Array[java.lang.String | org.scalablytyped.runtime.StringDictionary[_]])
  ] = js.undefined
  var locals: js.UndefOr[PugLocals] = js.undefined
  var noCache: js.UndefOr[scala.Boolean] = js.undefined
  var pretty: js.UndefOr[scala.Boolean] = js.undefined
  var viewPath: js.UndefOr[java.lang.String] = js.undefined
}

object PugOptions {
  @scala.inline
  def apply(
    app: koaLib.koaMod.^[_, js.Object] = null,
    basedir: java.lang.String = null,
    compileDebug: js.UndefOr[scala.Boolean] = js.undefined,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    helperPath: java.lang.String | (js.Array[java.lang.String | org.scalablytyped.runtime.StringDictionary[_]]) = null,
    locals: PugLocals = null,
    noCache: js.UndefOr[scala.Boolean] = js.undefined,
    pretty: js.UndefOr[scala.Boolean] = js.undefined,
    viewPath: java.lang.String = null
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

