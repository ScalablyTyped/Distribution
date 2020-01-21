package typings.koaStaticCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var alias: js.UndefOr[js.Object] = js.undefined
  var buffer: js.UndefOr[Boolean] = js.undefined
  var cacheControl: js.UndefOr[String] = js.undefined
  var dir: js.UndefOr[String] = js.undefined
  var dynamic: js.UndefOr[Boolean] = js.undefined
  var files: js.UndefOr[Files] = js.undefined
  var filter: js.UndefOr[(js.Function1[/* path */ String, Boolean]) | js.Array[String]] = js.undefined
  var gzip: js.UndefOr[Boolean] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var preload: js.UndefOr[Boolean] = js.undefined
  var usePrecompiledGzip: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alias: js.Object = null,
    buffer: js.UndefOr[Boolean] = js.undefined,
    cacheControl: String = null,
    dir: String = null,
    dynamic: js.UndefOr[Boolean] = js.undefined,
    files: Files = null,
    filter: (js.Function1[/* path */ String, Boolean]) | js.Array[String] = null,
    gzip: js.UndefOr[Boolean] = js.undefined,
    maxAge: Int | Double = null,
    prefix: String = null,
    preload: js.UndefOr[Boolean] = js.undefined,
    usePrecompiledGzip: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer.asInstanceOf[js.Any])
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl.asInstanceOf[js.Any])
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload.asInstanceOf[js.Any])
    if (!js.isUndefined(usePrecompiledGzip)) __obj.updateDynamic("usePrecompiledGzip")(usePrecompiledGzip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

