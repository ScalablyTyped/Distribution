package typings.jupyterlabApputilsExtension

import typings.jupyterlabApplication.frontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.layoutrestorerMod.ILayoutRestorer
import typings.jupyterlabApplication.mod.JupyterFrontEnd
import typings.jupyterlabApputils.commandpaletteMod.ICommandPalette
import typings.jupyterlabApputils.commandpaletteMod.IPaletteItem
import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.mod.CommandPalette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paletteMod {
  
  @JSImport("@jupyterlab/apputils-extension/lib/palette", "Palette")
  @js.native
  class Palette protected ()
    extends StObject
       with ICommandPalette {
    /**
      * Create a palette instance.
      */
    def this(palette: CommandPalette) = this()
    
    /* private */ var _palette: js.Any = js.native
    
    /**
      * Activate the command palette for user input.
      */
    /* CompleteClass */
    override def activate(): Unit = js.native
    
    /**
      * Add a command item to the command palette.
      *
      * @param options - The options for creating the command item.
      *
      * @returns A disposable that will remove the item from the palette.
      */
    /* CompleteClass */
    override def addItem(options: IPaletteItem): IDisposable = js.native
    
    /**
      * The placeholder text of the command palette's search input.
      */
    /* CompleteClass */
    var placeholder: String = js.native
    @JSName("placeholder")
    def placeholder_MPalette: String = js.native
  }
  object Palette {
    
    @JSImport("@jupyterlab/apputils-extension/lib/palette", "Palette")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Activate the command palette.
      */
    inline def activate(app: JupyterFrontEnd[IShell]): ICommandPalette = ^.asInstanceOf[js.Dynamic].applyDynamic("activate")(app.asInstanceOf[js.Any]).asInstanceOf[ICommandPalette]
    
    /**
      * Restore the command palette.
      */
    inline def restore(app: JupyterFrontEnd[IShell], restorer: ILayoutRestorer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("restore")(app.asInstanceOf[js.Any], restorer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
