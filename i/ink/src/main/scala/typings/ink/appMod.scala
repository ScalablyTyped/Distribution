package typings.ink

import typings.ink.anon.ActiveFocusId
import typings.ink.anon.AutoFocus
import typings.ink.anon.Error
import typings.node.processMod.global.NodeJS.ReadStream
import typings.node.processMod.global.NodeJS.WriteStream
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appMod {
  
  @JSImport("ink/build/components/App", JSImport.Default)
  @js.native
  open class default () extends App
  /* static members */
  object default {
    
    @JSImport("ink/build/components/App", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ink/build/components/App", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    inline def getDerivedStateFromError(error: js.Error): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromError")(error.asInstanceOf[js.Any]).asInstanceOf[Error]
  }
  
  @js.native
  trait App extends PureComponent[Props, State, Any] {
    
    def activateFocusable(id: String): Unit = js.native
    
    def addFocusable(id: String, hasAutoFocus: AutoFocus): Unit = js.native
    
    @JSName("componentDidCatch")
    def componentDidCatch_MApp(error: js.Error): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MApp(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MApp(): Unit = js.native
    
    def deactivateFocusable(id: String): Unit = js.native
    
    def disableFocus(): Unit = js.native
    
    def enableFocus(): Unit = js.native
    
    def findNextFocusable(state: State): js.UndefOr[String] = js.native
    
    def findPreviousFocusable(state: State): js.UndefOr[String] = js.native
    
    def focus(id: String): Unit = js.native
    
    def focusNext(): Unit = js.native
    
    def focusPrevious(): Unit = js.native
    
    def handleExit(): Unit = js.native
    def handleExit(error: js.Error): Unit = js.native
    
    def handleInput(input: String): Unit = js.native
    
    def handleSetRawMode(isEnabled: Boolean): Unit = js.native
    
    def isRawModeSupported(): Boolean = js.native
    
    var rawModeEnabledCount: Double = js.native
    
    def removeFocusable(id: String): Unit = js.native
    
    @JSName("state")
    var state_App: ActiveFocusId = js.native
  }
  
  trait Focusable extends StObject {
    
    val id: String
    
    val isActive: Boolean
  }
  object Focusable {
    
    inline def apply(id: String, isActive: Boolean): Focusable = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Focusable]
    }
    
    extension [Self <: Focusable](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Props extends StObject {
    
    val children: ReactNode = js.native
    
    val exitOnCtrlC: Boolean = js.native
    
    def onExit(): Unit = js.native
    def onExit(error: js.Error): Unit = js.native
    
    val stderr: WriteStream = js.native
    
    val stdin: ReadStream = js.native
    
    val stdout: WriteStream = js.native
    
    def writeToStderr(data: String): Unit = js.native
    
    def writeToStdout(data: String): Unit = js.native
  }
  
  trait State extends StObject {
    
    val activeFocusId: js.UndefOr[String] = js.undefined
    
    val error: js.UndefOr[js.Error] = js.undefined
    
    val focusables: js.Array[Focusable]
    
    val isFocusEnabled: Boolean
  }
  object State {
    
    inline def apply(focusables: js.Array[Focusable], isFocusEnabled: Boolean): State = {
      val __obj = js.Dynamic.literal(focusables = focusables.asInstanceOf[js.Any], isFocusEnabled = isFocusEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setActiveFocusId(value: String): Self = StObject.set(x, "activeFocusId", value.asInstanceOf[js.Any])
      
      inline def setActiveFocusIdUndefined: Self = StObject.set(x, "activeFocusId", js.undefined)
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFocusables(value: js.Array[Focusable]): Self = StObject.set(x, "focusables", value.asInstanceOf[js.Any])
      
      inline def setFocusablesVarargs(value: Focusable*): Self = StObject.set(x, "focusables", js.Array(value*))
      
      inline def setIsFocusEnabled(value: Boolean): Self = StObject.set(x, "isFocusEnabled", value.asInstanceOf[js.Any])
    }
  }
}
