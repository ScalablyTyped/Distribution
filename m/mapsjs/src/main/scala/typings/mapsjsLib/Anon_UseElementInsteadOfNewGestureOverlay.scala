package typings
package mapsjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_UseElementInsteadOfNewGestureOverlay extends js.Object {
  var downAction: js.UndefOr[js.Function1[/* downPoint */ mapsjsLib.mapsjsMod.point, _]] = js.undefined
  var dragEnabled: scala.Boolean
  var moveAction: js.UndefOr[js.Function1[/* movePoint */ mapsjsLib.mapsjsMod.point, scala.Unit]] = js.undefined
  var upAction: js.UndefOr[js.Function1[/* upPoint */ mapsjsLib.mapsjsMod.point, scala.Unit]] = js.undefined
  var useElementInsteadOfNewGestureOverlay: scala.Boolean
  var wheelAction: js.UndefOr[js.Function1[/* delta */ scala.Double, scala.Unit]] = js.undefined
}

