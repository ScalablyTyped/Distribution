package typings
package jpmLib.FFAddonSDKNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionButton extends ActionButtonState {
  def click(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  @JSName("on")
  def on_click(event: jpmLib.jpmLibStrings.click, handler: js.Function1[/* state */ ActionButtonState, _]): scala.Unit = js.native
  @JSName("once")
  def once_click(event: jpmLib.jpmLibStrings.click, handler: js.Function1[/* state */ ActionButtonState, _]): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_click(event: jpmLib.jpmLibStrings.click, handler: js.Function): scala.Unit = js.native
  // there's a compromise here by always returning ActionButtonState. It will return undefined if no options are passed
  def state(target: ActionButton): ActionButtonState = js.native
  // there's a compromise here by always returning ActionButtonState. It will return undefined if no options are passed
  def state(target: ActionButton, state: jpmLib.Anon_Icon): ActionButtonState = js.native
  // there's a compromise here by always returning ActionButtonState. It will return undefined if no options are passed
  def state(target: BrowserWindow): ActionButtonState = js.native
  // there's a compromise here by always returning ActionButtonState. It will return undefined if no options are passed
  def state(target: BrowserWindow, state: jpmLib.Anon_Icon): ActionButtonState = js.native
  // there's a compromise here by always returning ActionButtonState. It will return undefined if no options are passed
  def state(target: Tab): ActionButtonState = js.native
  // there's a compromise here by always returning ActionButtonState. It will return undefined if no options are passed
  def state(target: Tab, state: jpmLib.Anon_Icon): ActionButtonState = js.native
  // there's a compromise here by always returning ActionButtonState. It will return undefined if no options are passed
  @JSName("state")
  def state_tab(target: jpmLib.jpmLibStrings.tab): ActionButtonState = js.native
  // there's a compromise here by always returning ActionButtonState. It will return undefined if no options are passed
  @JSName("state")
  def state_tab(target: jpmLib.jpmLibStrings.tab, state: jpmLib.Anon_Icon): ActionButtonState = js.native
  // there's a compromise here by always returning ActionButtonState. It will return undefined if no options are passed
  @JSName("state")
  def state_window(target: jpmLib.jpmLibStrings.window): ActionButtonState = js.native
  // there's a compromise here by always returning ActionButtonState. It will return undefined if no options are passed
  @JSName("state")
  def state_window(target: jpmLib.jpmLibStrings.window, state: jpmLib.Anon_Icon): ActionButtonState = js.native
}

