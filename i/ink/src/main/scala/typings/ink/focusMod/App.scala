package typings.ink.focusMod

import typings.ink.anon.DisabledFocusIds
import typings.react.mod.Component
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App
  extends Component[Props, State, js.Any] {
  
  @JSName("componentDidCatch")
  def componentDidCatch_MApp(error: Error): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MApp(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MApp(): Unit = js.native
  
  def disableFocus(): Unit = js.native
  
  def disableFocusComponent(id: String): Unit = js.native
  
  def enableFocus(): Unit = js.native
  
  def enableFocusComponent(id: String): Unit = js.native
  
  def handleExit(): Unit = js.native
  def handleExit(error: Error): Unit = js.native
  
  def handleInput(input: String): Unit = js.native
  
  def handleSetRawMode(isEnabled: Boolean): Unit = js.native
  
  def isRawModeSupported(): Boolean = js.native
  
  var rawModeEnabledCount: Double = js.native
  
  def registerFocusComponent(id: String): Unit = js.native
  
  @JSName("state")
  var state_App: DisabledFocusIds = js.native
  
  def unregisterFocusComponent(id: String): Unit = js.native
}
