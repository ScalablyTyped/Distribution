package typings.ink

import typings.ink.anon.DisabledFocusIds
import typings.ink.anon.ExitOnCtrlC
import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object focusMod {
  
  @JSImport("ink/build/components/Focus", JSImport.Default)
  @js.native
  class default () extends App
  /* static members */
  object default {
    
    @JSImport("ink/build/components/Focus", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ink/build/components/Focus", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("ink/build/components/Focus", "default.propTypes")
    @js.native
    def propTypes: ExitOnCtrlC = js.native
    inline def propTypes_=(x: ExitOnCtrlC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait App
    extends PureComponent[Props, State, js.Any] {
    
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
  
  @js.native
  trait Props extends StObject {
    
    var children: ReactNode = js.native
    
    var exitOnCtrlC: Boolean = js.native
    
    def onExit(): Unit = js.native
    def onExit(error: Error): Unit = js.native
    
    var stderr: WriteStream = js.native
    
    var stdin: ReadStream = js.native
    
    var stdout: WriteStream = js.native
    
    def writeToStderr(data: String): Unit = js.native
    
    def writeToStdout(data: String): Unit = js.native
  }
  
  trait State extends StObject {
    
    var activeFocusId: js.UndefOr[String] = js.undefined
    
    var disabledFocusIds: js.Array[String]
    
    var focusIds: js.Array[String]
    
    var isFocusEnabled: Boolean
  }
  object State {
    
    inline def apply(disabledFocusIds: js.Array[String], focusIds: js.Array[String], isFocusEnabled: Boolean): State = {
      val __obj = js.Dynamic.literal(disabledFocusIds = disabledFocusIds.asInstanceOf[js.Any], focusIds = focusIds.asInstanceOf[js.Any], isFocusEnabled = isFocusEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setActiveFocusId(value: String): Self = StObject.set(x, "activeFocusId", value.asInstanceOf[js.Any])
      
      inline def setActiveFocusIdUndefined: Self = StObject.set(x, "activeFocusId", js.undefined)
      
      inline def setDisabledFocusIds(value: js.Array[String]): Self = StObject.set(x, "disabledFocusIds", value.asInstanceOf[js.Any])
      
      inline def setDisabledFocusIdsVarargs(value: String*): Self = StObject.set(x, "disabledFocusIds", js.Array(value :_*))
      
      inline def setFocusIds(value: js.Array[String]): Self = StObject.set(x, "focusIds", value.asInstanceOf[js.Any])
      
      inline def setFocusIdsVarargs(value: String*): Self = StObject.set(x, "focusIds", js.Array(value :_*))
      
      inline def setIsFocusEnabled(value: Boolean): Self = StObject.set(x, "isFocusEnabled", value.asInstanceOf[js.Any])
    }
  }
}
