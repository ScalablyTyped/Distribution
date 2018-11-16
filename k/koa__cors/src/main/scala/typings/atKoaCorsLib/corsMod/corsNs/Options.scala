package typings
package atKoaCorsLib.corsMod.corsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var allowHeaders: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var allowMethods: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var credentials: js.UndefOr[scala.Boolean] = js.undefined
  var exposeHeaders: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var keepHeadersOnError: js.UndefOr[scala.Boolean] = js.undefined
  var maxAge: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var origin: js.UndefOr[
    (js.Function1[/* ctx */ koaLib.koaMod.ApplicationNs.Context, java.lang.String]) | java.lang.String
  ] = js.undefined
}

