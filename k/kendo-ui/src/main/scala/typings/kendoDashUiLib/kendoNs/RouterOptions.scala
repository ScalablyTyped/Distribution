package typings
package kendoDashUiLib.kendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ RouterChangeEvent, scala.Unit]] = js.undefined
  var hashBang: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreCase: js.UndefOr[scala.Boolean] = js.undefined
  var init: js.UndefOr[js.Function1[/* e */ RouterEvent, scala.Unit]] = js.undefined
  var pushState: js.UndefOr[scala.Boolean] = js.undefined
  var root: js.UndefOr[java.lang.String] = js.undefined
  var routeMissing: js.UndefOr[js.Function1[/* e */ RouterRouteMissingEvent, scala.Unit]] = js.undefined
  var same: js.UndefOr[js.Function1[/* e */ RouterEvent, scala.Unit]] = js.undefined
}

