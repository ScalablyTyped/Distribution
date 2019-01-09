package typings
package jpmLib.FFAddonSDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToggleButton extends ToggleButtonState {
  def click(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  @JSName("on")
  def on_change(event: jpmLib.jpmLibStrings.change, handler: js.Function1[/* state */ ToggleButtonState, _]): scala.Unit = js.native
  @JSName("on")
  def on_click(event: jpmLib.jpmLibStrings.click, handler: js.Function1[/* state */ ToggleButtonState, _]): scala.Unit = js.native
  @JSName("once")
  def once_change(event: jpmLib.jpmLibStrings.change, handler: js.Function1[/* state */ ToggleButtonState, _]): scala.Unit = js.native
  @JSName("once")
  def once_click(event: jpmLib.jpmLibStrings.click, handler: js.Function1[/* state */ ToggleButtonState, _]): scala.Unit = js.native
  def removeListener(event: java.lang.String, handler: js.Function): scala.Unit = js.native
  def state(target: BrowserWindow): ToggleButtonState = js.native
  def state(target: BrowserWindow, state: jpmLib.Anon_BadgeBadgeColorChecked): ToggleButtonState = js.native
  def state(target: Tab): ToggleButtonState = js.native
  def state(target: Tab, state: jpmLib.Anon_BadgeBadgeColorChecked): ToggleButtonState = js.native
  def state(target: ToggleButton): ToggleButtonState = js.native
  def state(target: ToggleButton, state: jpmLib.Anon_BadgeBadgeColorChecked): ToggleButtonState = js.native
  @JSName("state")
  def state_tab(target: jpmLib.jpmLibStrings.tab): ToggleButtonState = js.native
  @JSName("state")
  def state_tab(target: jpmLib.jpmLibStrings.tab, state: jpmLib.Anon_BadgeBadgeColorChecked): ToggleButtonState = js.native
  @JSName("state")
  def state_window(target: jpmLib.jpmLibStrings.window): ToggleButtonState = js.native
  @JSName("state")
  def state_window(target: jpmLib.jpmLibStrings.window, state: jpmLib.Anon_BadgeBadgeColorChecked): ToggleButtonState = js.native
}

