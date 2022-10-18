package typings.jupyterlabLogconsoleExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApputils.mod.ReactWidget
import typings.jupyterlabLogconsole.libTokensMod.ILoggerRegistry
import typings.jupyterlabLogconsole.mod.LogConsolePanel
import typings.jupyterlabLogconsoleExtension.jupyterlabLogconsoleExtensionStrings.desktop
import typings.jupyterlabLogconsoleExtension.jupyterlabLogconsoleExtensionStrings.mobile
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.react.mod.ChangeEvent
import typings.react.mod.KeyboardEvent
import typings.std.Element
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * The Log Console extension.
    */
  @JSImport("@jupyterlab/logconsole-extension", JSImport.Default)
  @js.native
  val default: JupyterFrontEndPlugin[ILoggerRegistry, IShell, desktop | mobile] = js.native
  
  @JSImport("@jupyterlab/logconsole-extension", "LogLevelSwitcher")
  @js.native
  open class LogLevelSwitcher protected () extends ReactWidget {
    /**
      * Construct a new cell type switcher.
      */
    def this(widget: LogConsolePanel) = this()
    def this(widget: LogConsolePanel, translator: ITranslator) = this()
    
    /* private */ var _id: Any = js.native
    
    /* private */ var _logConsole: Any = js.native
    
    /* private */ var _trans: Any = js.native
    
    /* private */ var _updateSource: Any = js.native
    
    /**
      * Handle `change` events for the HTMLSelect component.
      */
    def handleChange(event: ChangeEvent[HTMLSelectElement]): Unit = js.native
    
    /**
      * Handle `keydown` events for the HTMLSelect component.
      */
    def handleKeyDown(event: KeyboardEvent[Element]): Unit = js.native
    
    /* protected */ var translator: ITranslator = js.native
  }
  
  type _To = JupyterFrontEndPlugin[ILoggerRegistry, IShell, desktop | mobile]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: JupyterFrontEndPlugin[ILoggerRegistry, IShell, desktop | mobile] = default
}
