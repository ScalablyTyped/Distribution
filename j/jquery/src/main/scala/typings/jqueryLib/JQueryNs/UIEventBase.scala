package typings
package jqueryLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// region UIEvent
// #region UIEvent

trait UIEventBase[TDelegateTarget, TData, TCurrentTarget, TTarget] extends TriggeredEvent[TDelegateTarget, TData, TCurrentTarget, TTarget] {
  // Event
  @JSName("bubbles")
  var bubbles_UIEventBase: scala.Boolean
  @JSName("cancelable")
  var cancelable_UIEventBase: scala.Boolean
  // UIEvent
  @JSName("detail")
  var detail_UIEventBase: scala.Double
  @JSName("eventPhase")
  var eventPhase_UIEventBase: scala.Double
  var originalEvent: js.UndefOr[jqueryLib._UIEvent] = js.undefined
  @JSName("view")
  var view_UIEventBase: stdLib.Window
}

