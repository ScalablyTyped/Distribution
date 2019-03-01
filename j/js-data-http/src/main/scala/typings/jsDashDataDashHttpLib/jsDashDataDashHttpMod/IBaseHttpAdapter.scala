package typings
package jsDashDataDashHttpLib.jsDashDataDashHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseHttpAdapter extends IBaseAdapter {
  var basePath: js.UndefOr[java.lang.String] = js.undefined
  var forceTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined
  var http: js.UndefOr[js.Any] = js.undefined
  var httpConfig: js.UndefOr[IDict] = js.undefined
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  var useFetch: js.UndefOr[scala.Boolean] = js.undefined
}

object IBaseHttpAdapter {
  @scala.inline
  def apply(
    basePath: java.lang.String = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    forceTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined,
    http: js.Any = null,
    httpConfig: IDict = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    suffix: java.lang.String = null,
    useFetch: js.UndefOr[scala.Boolean] = js.undefined
  ): IBaseHttpAdapter = {
    val __obj = js.Dynamic.literal()
    if (basePath != null) __obj.updateDynamic("basePath")(basePath)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(forceTrailingSlash)) __obj.updateDynamic("forceTrailingSlash")(forceTrailingSlash)
    if (http != null) __obj.updateDynamic("http")(http)
    if (httpConfig != null) __obj.updateDynamic("httpConfig")(httpConfig)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (!js.isUndefined(useFetch)) __obj.updateDynamic("useFetch")(useFetch)
    __obj.asInstanceOf[IBaseHttpAdapter]
  }
}

