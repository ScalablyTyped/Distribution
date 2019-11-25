package typings.koaDashProxy.koaDashProxyMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var followRedirect: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var jar: js.UndefOr[Boolean] = js.undefined
  var map: js.UndefOr[IndexedObject | MapFunction] = js.undefined
  var `match`: js.UndefOr[RegExp] = js.undefined
   // case-insensitive
  var overrideResponseHeaders: js.UndefOr[js.Any] = js.undefined
  var requestOptions: js.UndefOr[RequestOptionFunc | IndexedObject] = js.undefined
  var suppressRequestHeaders: js.UndefOr[js.Array[String]] = js.undefined
   // case-insensitive
  var suppressResponseHeaders: js.UndefOr[js.Array[String]] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var yieldNext: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    followRedirect: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    jar: js.UndefOr[Boolean] = js.undefined,
    map: IndexedObject | MapFunction = null,
    `match`: RegExp = null,
    overrideResponseHeaders: js.Any = null,
    requestOptions: RequestOptionFunc | IndexedObject = null,
    suppressRequestHeaders: js.Array[String] = null,
    suppressResponseHeaders: js.Array[String] = null,
    url: String = null,
    yieldNext: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(followRedirect)) __obj.updateDynamic("followRedirect")(followRedirect.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (!js.isUndefined(jar)) __obj.updateDynamic("jar")(jar.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (overrideResponseHeaders != null) __obj.updateDynamic("overrideResponseHeaders")(overrideResponseHeaders.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    if (suppressRequestHeaders != null) __obj.updateDynamic("suppressRequestHeaders")(suppressRequestHeaders.asInstanceOf[js.Any])
    if (suppressResponseHeaders != null) __obj.updateDynamic("suppressResponseHeaders")(suppressResponseHeaders.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(yieldNext)) __obj.updateDynamic("yieldNext")(yieldNext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

