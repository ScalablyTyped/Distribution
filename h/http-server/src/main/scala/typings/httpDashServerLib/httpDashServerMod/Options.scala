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
      /* err */ nodeLib.Error, 
      scala.Unit
    ]
  ] = js.undefined
  var proxy: js.UndefOr[java.lang.String] = js.undefined
  var robots: js.UndefOr[java.lang.String | httpDashServerLib.httpDashServerLibNumbers.`true`] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var showDir: js.UndefOr[scala.Boolean | httpDashServerLib.httpDashServerLibStrings.`false`] = js.undefined
  var showDotfiles: js.UndefOr[scala.Boolean] = js.undefined
}

