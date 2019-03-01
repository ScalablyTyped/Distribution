package typings
package koaDashStaticDashCacheLib.koaDashStaticDashCacheMod.staticCacheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var alias: js.UndefOr[js.Object] = js.undefined
  var buffer: js.UndefOr[scala.Boolean] = js.undefined
  var cacheControl: js.UndefOr[java.lang.String] = js.undefined
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var dynamic: js.UndefOr[scala.Boolean] = js.undefined
  var files: js.UndefOr[Files] = js.undefined
  var filter: js.UndefOr[
    (js.Function1[/* path */ java.lang.String, scala.Boolean]) | js.Array[java.lang.String]
  ] = js.undefined
  var gzip: js.UndefOr[scala.Boolean] = js.undefined
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  var preload: js.UndefOr[scala.Boolean] = js.undefined
  var usePrecompiledGzip: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    alias: js.Object = null,
    buffer: js.UndefOr[scala.Boolean] = js.undefined,
    cacheControl: java.lang.String = null,
    dir: java.lang.String = null,
    dynamic: js.UndefOr[scala.Boolean] = js.undefined,
    files: Files = null,
    filter: (js.Function1[/* path */ java.lang.String, scala.Boolean]) | js.Array[java.lang.String] = null,
    gzip: js.UndefOr[scala.Boolean] = js.undefined,
    maxAge: scala.Int | scala.Double = null,
    prefix: java.lang.String = null,
    preload: js.UndefOr[scala.Boolean] = js.undefined,
    usePrecompiledGzip: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias)
    if (!js.isUndefined(buffer)) __obj.updateDynamic("buffer")(buffer)
    if (cacheControl != null) __obj.updateDynamic("cacheControl")(cacheControl)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic)
    if (files != null) __obj.updateDynamic("files")(files)
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (!js.isUndefined(preload)) __obj.updateDynamic("preload")(preload)
    if (!js.isUndefined(usePrecompiledGzip)) __obj.updateDynamic("usePrecompiledGzip")(usePrecompiledGzip)
    __obj.asInstanceOf[Options]
  }
}

