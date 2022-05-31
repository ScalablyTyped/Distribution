package typings.jupyterlabLogconsoleExtension

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApplication.frontendMod.JupyterFrontEndPlugin
import typings.jupyterlabApputils.mod.ReactWidget
import typings.jupyterlabLogconsole.mod.LogConsolePanel
import typings.jupyterlabLogconsole.tokensMod.ILoggerRegistry
import typings.react.mod.ChangeEvent
import typings.react.mod.KeyboardEvent
import typings.std.Element
import typings.std.HTMLSelectElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@jupyterlab/logconsole-extension", JSImport.Default)
  @js.native
  val default: js.Array[JupyterFrontEndPlugin[ILoggerRegistry | Unit]] = js.native
  
  @JSImport("@jupyterlab/logconsole-extension", "LogLevelSwitcher")
  @js.native
  class LogLevelSwitcher protected () extends ReactWidget {
    /**
      * Construct a new cell type switcher.
      */
    def this(widget: LogConsolePanel) = this()
    
    /* private */ var _id: js.Any = js.native
    
    /* private */ var _logConsole: js.Any = js.native
    
    /* private */ var _updateSource: js.Any = js.native
    
    /**
      * Handle `change` events for the HTMLSelect component.
      */
    def handleChange(event: ChangeEvent[HTMLSelectElement]): Unit = js.native
    
    /**
      * Handle `keydown` events for the HTMLSelect component.
      */
    def handleKeyDown(event: KeyboardEvent[Element]): Unit = js.native
  }
  
  type _To = js.Array[JupyterFrontEndPlugin[ILoggerRegistry | Unit]]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: js.Array[JupyterFrontEndPlugin[ILoggerRegistry | Unit]] = default
}
