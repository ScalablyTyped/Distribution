package typings.jupyterlabApputilsExtension

import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.layoutrestorerMod.ILayoutRestorer
import typings.jupyterlabApplication.mod.JupyterFrontEnd
import typings.jupyterlabApputils.commandpaletteMod.ICommandPalette
import typings.luminoWidgets.mod.CommandPalette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paletteMod {
  
  @JSImport("@jupyterlab/apputils-extension/lib/palette", "Palette")
  @js.native
  class Palette protected () extends ICommandPalette {
    /**
      * Create a palette instance.
      */
    def this(palette: CommandPalette) = this()
    
    var _palette: js.Any = js.native
    
    @JSName("placeholder")
    def placeholder_MPalette: String = js.native
  }
  object Palette {
    
    /**
      * Activate the command palette.
      */
    @JSImport("@jupyterlab/apputils-extension/lib/palette", "Palette.activate")
    @js.native
    def activate(app: JupyterFrontEnd[IShell]): ICommandPalette = js.native
    
    /**
      * Restore the command palette.
      */
    @JSImport("@jupyterlab/apputils-extension/lib/palette", "Palette.restore")
    @js.native
    def restore(app: JupyterFrontEnd[IShell], restorer: ILayoutRestorer): Unit = js.native
  }
}
