package typings.koaStatic.mod

import typings.koaSend.koaSendBooleans.`false`
import typings.koaSend.mod.SendOptions
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
    maxAge: js.UndefOr[Double] = js.undefined,
    maxage: js.UndefOr[Double] = js.undefined,
    root: String = null,
    setHeaders: (/* import warning: importer.ImportType#apply Failed type conversion: koa.koa.ParameterizedContext<koa.koa.DefaultState, koa.koa.DefaultContext>['res'] */ /* res */ js.Any, /* path */ String, /* stats */ Stats) => js.Any = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(brotli)) __obj.updateDynamic("brotli")(brotli.get.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.get.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(format)) __obj.updateDynamic("format")(format.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(immutable)) __obj.updateDynamic("immutable")(immutable.get.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAge)) __obj.updateDynamic("maxAge")(maxAge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxage)) __obj.updateDynamic("maxage")(maxage.get.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (setHeaders != null) __obj.updateDynamic("setHeaders")(js.Any.fromFunction3(setHeaders))
    __obj.asInstanceOf[Options]
  }
}

