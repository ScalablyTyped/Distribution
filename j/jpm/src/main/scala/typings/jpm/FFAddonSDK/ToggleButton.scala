package typings.jpm.FFAddonSDK

import typings.jpm.anon.Checked
import typings.jpm.jpmStrings.change
import typings.jpm.jpmStrings.click
import typings.jpm.jpmStrings.tab
import typings.jpm.jpmStrings.window
import typings.jpm.panelMod.PanelPosition
import typings.jpm.toolbarMod.ToolbarItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def state(target: BrowserWindow, state: Checked): ToggleButtonState = js.native
  def state(target: Tab): ToggleButtonState = js.native
  def state(target: Tab, state: Checked): ToggleButtonState = js.native
  def state(target: ToggleButton): ToggleButtonState = js.native
  def state(target: ToggleButton, state: Checked): ToggleButtonState = js.native
  @JSName("state")
  def state_tab(target: tab): ToggleButtonState = js.native
  @JSName("state")
  def state_tab(target: tab, state: Checked): ToggleButtonState = js.native
  @JSName("state")
  def state_window(target: window): ToggleButtonState = js.native
  @JSName("state")
  def state_window(target: window, state: Checked): ToggleButtonState = js.native
}
