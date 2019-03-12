package typings
package httpDashServerLib.httpDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoIndex: js.UndefOr[scala.Boolean | httpDashServerLib.httpDashServerLibStrings.`false`] = js.undefined
  var before: js.UndefOr[js.Array[connectLib.connectMod.createServerNs.HandleFunction]] = js.undefined
  var cache: js.UndefOr[scala.Double] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var cors: js.UndefOr[scala.Boolean] = js.undefined
  var corsHeaders: js.UndefOr[java.lang.String] = js.undefined
  var ext: js.UndefOr[scala.Boolean] = js.undefined
  var gzip: js.UndefOr[scala.Boolean] = js.undefined
  var headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var https: js.UndefOr[nodeLib.httpsMod.ServerOptions] = js.undefined
  // tslint:disable-next-line prefer-method-signature
  var logFn: js.UndefOr[
    js.Function3[
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* res */ nodeLib.httpMod.ServerResponse, 
      /* err */ stdLib.Error, 
      scala.Unit
    ]
  ] = js.undefined
  var proxy: js.UndefOr[java.lang.String] = js.undefined
  var robots: js.UndefOr[java.lang.String | httpDashServerLib.httpDashServerLibNumbers.`true`] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var showDir: js.UndefOr[scala.Boolean | httpDashServerLib.httpDashServerLibStrings.`false`] = js.undefined
  var showDotfiles: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoIndex: scala.Boolean | httpDashServerLib.httpDashServerLibStrings.`false` = null,
    before: js.Array[connectLib.connectMod.createServerNs.HandleFunction] = null,
    cache: scala.Int | scala.Double = null,
    contentType: java.lang.String = null,
    cors: js.UndefOr[scala.Boolean] = js.undefined,
    corsHeaders: java.lang.String = null,
    ext: js.UndefOr[scala.Boolean] = js.undefined,
    gzip: js.UndefOr[scala.Boolean] = js.undefined,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    https: nodeLib.httpsMod.ServerOptions = null,
    logFn: (/* req */ nodeLib.httpMod.IncomingMessage, /* res */ nodeLib.httpMod.ServerResponse, /* err */ stdLib.Error) => scala.Unit = null,
    proxy: java.lang.String = null,
    robots: java.lang.String | httpDashServerLib.httpDashServerLibNumbers.`true` = null,
    root: java.lang.String = null,
    showDir: scala.Boolean | httpDashServerLib.httpDashServerLibStrings.`false` = null,
    showDotfiles: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (autoIndex != null) __obj.updateDynamic("autoIndex")(autoIndex.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before)
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (!js.isUndefined(cors)) __obj.updateDynamic("cors")(cors)
    if (corsHeaders != null) __obj.updateDynamic("corsHeaders")(corsHeaders)
    if (!js.isUndefined(ext)) __obj.updateDynamic("ext")(ext)
    if (!js.isUndefined(gzip)) __obj.updateDynamic("gzip")(gzip)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (https != null) __obj.updateDynamic("https")(https)
    if (logFn != null) __obj.updateDynamic("logFn")(js.Any.fromFunction3(logFn))
    if (proxy != null) __obj.updateDynamic("proxy")(proxy)
    if (robots != null) __obj.updateDynamic("robots")(robots.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root)
    if (showDir != null) __obj.updateDynamic("showDir")(showDir.asInstanceOf[js.Any])
    if (!js.isUndefined(showDotfiles)) __obj.updateDynamic("showDotfiles")(showDotfiles)
    __obj.asInstanceOf[Options]
  }
}

