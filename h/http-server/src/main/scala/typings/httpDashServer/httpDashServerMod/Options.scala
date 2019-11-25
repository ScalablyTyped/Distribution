package typings.httpDashServer.httpDashServerMod

import org.scalablytyped.runtime.StringDictionary
import typings.connect.connectMod.HandleFunction
import typings.httpDashServer.httpDashServerNumbers.`true`
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.httpsMod.ServerOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoIndex: js.UndefOr[Boolean] = js.undefined
  var before: js.UndefOr[js.Array[HandleFunction]] = js.undefined
  var cache: js.UndefOr[Double] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var cors: js.UndefOr[Boolean] = js.undefined
  var corsHeaders: js.UndefOr[String] = js.undefined
  var ext: js.UndefOr[Boolean] = js.undefined
  var gzip: js.UndefOr[Boolean] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var https: js.UndefOr[ServerOptions] = js.undefined
  // tslint:disable-next-line prefer-method-signature
  var logFn: js.UndefOr[
    js.Function3[/* req */ IncomingMessage, /* res */ ServerResponse, /* err */ Error, Unit]
  ] = js.undefined
  var proxy: js.UndefOr[String] = js.undefined
  var robots: js.UndefOr[String | `true`] = js.undefined
  var root: js.UndefOr[String] = js.undefined
  var showDir: js.UndefOr[Boolean] = js.undefined
  var showDotfiles: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoIndex: js.UndefOr[Boolean] = js.undefined,
    before: js.Array[HandleFunction] = null,
    cache: Int | Double = null,
    contentType: String = null,
    cors: js.UndefOr[Boolean] = js.undefined,
    corsHeaders: String = null,
    ext: js.UndefOr[Boolean] = js.undefined,
    gzip: js.UndefOr[Boolean] = js.undefined,
    headers: StringDictionary[String] = null,
    https: ServerOptions = null,
    logFn: (/* req */ IncomingMessage, /* res */ ServerResponse, /* err */ Error) => Unit = null,
    proxy: String = null,
    robots: String | `true` = null,
    root: String = null,
    showDir: js.UndefOr[Boolean] = js.undefined,
    showDotfiles: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoIndex)) __obj.updateDynamic("autoIndex")(autoIndex.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (!js.isUndefined(cors)) __obj.updateDynamic("cors")(cors.asInstanceOf[js.Any])
    if (corsHeaders != null) __obj.updateDynamic("corsHeaders")(corsHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(ext)) __obj.updateDynamic("ext")(ext.asInstanceOf[js.Any])
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (https != null) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    if (logFn != null) __obj.updateDynamic("logFn")(js.Any.fromFunction3(logFn))
    if (proxy != null) __obj.updateDynamic("proxy")(proxy.asInstanceOf[js.Any])
    if (robots != null) __obj.updateDynamic("robots")(robots.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(showDir)) __obj.updateDynamic("showDir")(showDir.asInstanceOf[js.Any])
    if (!js.isUndefined(showDotfiles)) __obj.updateDynamic("showDotfiles")(showDotfiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

