package typings
package jqueryDotUiDotLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EastNorth extends js.Object {
  var east: jqueryDotUiDotLayoutLib.JQueryUILayoutNs.PaneState
  var north: jqueryDotUiDotLayoutLib.JQueryUILayoutNs.PaneState
  var south: jqueryDotUiDotLayoutLib.JQueryUILayoutNs.PaneState
  var west: jqueryDotUiDotLayoutLib.JQueryUILayoutNs.PaneState
}

object Anon_EastNorth {
  @scala.inline
  def apply(
    east: jqueryDotUiDotLayoutLib.JQueryUILayoutNs.PaneState,
    north: jqueryDotUiDotLayoutLib.JQueryUILayoutNs.PaneState,
    south: jqueryDotUiDotLayoutLib.JQueryUILayoutNs.PaneState,
    west: jqueryDotUiDotLayoutLib.JQueryUILayoutNs.PaneState
  ): Anon_EastNorth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("east")(east)
    __obj.updateDynamic("north")(north)
    __obj.updateDynamic("south")(south)
    __obj.updateDynamic("west")(west)
    __obj.asInstanceOf[Anon_EastNorth]
  }
}

