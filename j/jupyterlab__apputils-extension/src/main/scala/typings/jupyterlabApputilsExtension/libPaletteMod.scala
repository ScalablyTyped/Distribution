package typings.jupyterlabApputilsExtension

import typings.jupyterlabApplication.libFrontendMod.JupyterFrontEnd.IShell
import typings.jupyterlabApplication.libLayoutrestorerMod.ILayoutRestorer
import typings.jupyterlabApplication.mod.JupyterFrontEnd
import typings.jupyterlabApputils.libCommandpaletteMod.ICommandPalette
import typings.jupyterlabApputils.libCommandpaletteMod.IPaletteItem
import typings.jupyterlabApputilsExtension.jupyterlabApputilsExtensionStrings.desktop
import typings.jupyterlabApputilsExtension.jupyterlabApputilsExtensionStrings.mobile
import typings.jupyterlabSettingregistry.libTokensMod.ISettingRegistry
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.mod.CommandPalette
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaletteMod {
  
  @JSImport("@jupyterlab/apputils-extension/lib/palette", "Palette")
  @js.native
  open class Palette protected ()
    extends StObject
       with ICommandPalette {
    /**
      * Create a palette instance.
      */
    def this(palette: CommandPalette) = this()
    def this(palette: CommandPalette, translator: ITranslator) = this()
    
    /* private */ var _palette: Any = js.native
    
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
    
    /* protected */ var translator: ITranslator = js.native
  }
  object Palette {
    
    @JSImport("@jupyterlab/apputils-extension/lib/palette", "Palette")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Activate the command palette.
      */
    inline def activate(app: JupyterFrontEnd[IShell, desktop | mobile], translator: ITranslator): ICommandPalette = (^.asInstanceOf[js.Dynamic].applyDynamic("activate")(app.asInstanceOf[js.Any], translator.asInstanceOf[js.Any])).asInstanceOf[ICommandPalette]
    inline def activate(
      app: JupyterFrontEnd[IShell, desktop | mobile],
      translator: ITranslator,
      settingRegistry: ISettingRegistry
    ): ICommandPalette = (^.asInstanceOf[js.Dynamic].applyDynamic("activate")(app.asInstanceOf[js.Any], translator.asInstanceOf[js.Any], settingRegistry.asInstanceOf[js.Any])).asInstanceOf[ICommandPalette]
    
    /**
      * Restore the command palette.
      */
    inline def restore(app: JupyterFrontEnd[IShell, desktop | mobile], restorer: ILayoutRestorer, translator: ITranslator): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("restore")(app.asInstanceOf[js.Any], restorer.asInstanceOf[js.Any], translator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
