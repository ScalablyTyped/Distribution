package typings.koaDashStatic.koaDashStaticMod

import typings.koaDashSend.koaDashSendBooleans.`false`
import typings.koaDashSend.koaDashSendMod.SendOptions
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends SendOptions {
  /** If true, serves after return next(), allowing any downstream middleware to respond first. */
  var defer: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    brotli: js.UndefOr[Boolean] = js.undefined,
    defer: js.UndefOr[Boolean] = js.undefined,
    extensions: js.Array[String] | `false` = null,
    format: js.UndefOr[Boolean] = js.undefined,
    gzip: js.UndefOr[Boolean] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    immutable: js.UndefOr[Boolean] = js.undefined,
    index: String | `false` = null,
    maxAge: Int | Double = null,
    maxage: Int | Double = null,
    root: String = null,
    setHeaders: (/* import warning: importer.ImportType#apply Failed type conversion: koa.koa.ParameterizedContext<koa.koa.DefaultState, koa.koa.DefaultContext>['res'] */ /* res */ js.Any, /* path */ String, /* stats */ Stats) => js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(brotli)) __obj.updateDynamic("brotli")(brotli.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (maxage != null) __obj.updateDynamic("maxage")(maxage.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (setHeaders != null) __obj.updateDynamic("setHeaders")(js.Any.fromFunction3(setHeaders))
    __obj.asInstanceOf[Options]
  }
}

