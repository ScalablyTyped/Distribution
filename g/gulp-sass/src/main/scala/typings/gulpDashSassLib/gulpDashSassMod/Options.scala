package typings
package gulpDashSassLib.gulpDashSassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends SassOptions {
  var errLogToConsole: js.UndefOr[scala.Boolean] = js.undefined
  var onError: js.UndefOr[js.Function1[/* err */ nodeLib.Error, _]] = js.undefined
  var onSuccess: js.UndefOr[js.Function1[/* css */ java.lang.String, _]] = js.undefined
  var sync: js.UndefOr[scala.Boolean] = js.undefined
}

