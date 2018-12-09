package typings
package httpDashGracefulDashShutdownLib.httpDashGracefulDashShutdownMod.GracefulShutdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options extends js.Object {
  var development: js.UndefOr[scala.Boolean] = js.undefined
  var `finally`: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onShutdown: js.UndefOr[js.Function0[js.Promise[scala.Unit]]] = js.undefined
  var signals: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

