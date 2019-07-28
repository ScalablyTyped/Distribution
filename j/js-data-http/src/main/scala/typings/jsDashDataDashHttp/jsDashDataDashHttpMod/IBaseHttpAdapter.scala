package typings.jsDashDataDashHttp.jsDashDataDashHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBaseHttpAdapter extends IBaseAdapter {
  var basePath: js.UndefOr[String] = js.undefined
  var forceTrailingSlash: js.UndefOr[Boolean] = js.undefined
  var http: js.UndefOr[js.Any] = js.undefined
  var httpConfig: js.UndefOr[IDict] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
  var useFetch: js.UndefOr[Boolean] = js.undefined
}

object IBaseHttpAdapter {
  @scala.inline
  def apply(
    basePath: String = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    forceTrailingSlash: js.UndefOr[Boolean] = js.undefined,
    http: js.Any = null,
    httpConfig: IDict = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    suffix: String = null,
    useFetch: js.UndefOr[Boolean] = js.undefined
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

