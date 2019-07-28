package typings.jpm.FFAddonSDKNs

import typings.jpm.Anon_BadgeBadgeColorChecked
import typings.jpm.jpmStrings.change
import typings.jpm.jpmStrings.click
import typings.jpm.jpmStrings.tab
import typings.jpm.jpmStrings.window
import typings.jpm.sdkPanelMod.PanelPosition
import typings.jpm.sdkUiToolbarMod.ToolbarItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToggleButton
  extends ToggleButtonState
     with PanelPosition
     with ToolbarItem {
  def click(): Unit = js.native
  def destroy(): Unit = js.native
  @JSName("on")
  def on_change(event: change, handler: js.Function1[/* state */ ToggleButtonState, _]): Unit = js.native
  @JSName("on")
  def on_click(event: click, handler: js.Function1[/* state */ ToggleButtonState, _]): Unit = js.native
  @JSName("once")
  def once_change(event: change, handler: js.Function1[/* state */ ToggleButtonState, _]): Unit = js.native
  @JSName("once")
  def once_click(event: click, handler: js.Function1[/* state */ ToggleButtonState, _]): Unit = js.native
  def removeListener(event: String, handler: js.Function): Unit = js.native
  def state(target: BrowserWindow): ToggleButtonState = js.native
  def state(target: BrowserWindow, state: Anon_BadgeBadgeColorChecked): ToggleButtonState = js.native
  def state(target: Tab): ToggleButtonState = js.native
  def state(target: Tab, state: Anon_BadgeBadgeColorChecked): ToggleButtonState = js.native
  def state(target: ToggleButton): ToggleButtonState = js.native
  def state(target: ToggleButton, state: Anon_BadgeBadgeColorChecked): ToggleButtonState = js.native
  @JSName("state")
  def state_tab(target: tab): ToggleButtonState = js.native
  @JSName("state")
  def state_tab(target: tab, state: Anon_BadgeBadgeColorChecked): ToggleButtonState = js.native
  @JSName("state")
  def state_window(target: window): ToggleButtonState = js.native
  @JSName("state")
  def state_window(target: window, state: Anon_BadgeBadgeColorChecked): ToggleButtonState = js.native
}

