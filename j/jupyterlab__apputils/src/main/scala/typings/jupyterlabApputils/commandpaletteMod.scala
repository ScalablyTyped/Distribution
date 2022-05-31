package typings.jupyterlabApputils

import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.commandpaletteMod.CommandPalette.IItemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandpaletteMod {
  
  trait ICommandPalette extends StObject {
    
    /**
      * Activate the command palette for user input.
      */
    def activate(): Unit
    
    /**
      * Add a command item to the command palette.
      *
      * @param options - The options for creating the command item.
      *
      * @returns A disposable that will remove the item from the palette.
      */
    def addItem(options: IPaletteItem): IDisposable
    
    /**
      * The placeholder text of the command palette's search input.
      */
    var placeholder: String
  }
  object ICommandPalette {
    
    @JSImport("@jupyterlab/apputils/lib/commandpalette", "ICommandPalette")
    @js.native
    val ^ : Token[ICommandPalette] = js.native
    
    extension [Self <: ICommandPalette](x: Self) {
      
      inline def setActivate(value: () => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction0(value))
      
      inline def setAddItem(value: IPaletteItem => IDisposable): Self = StObject.set(x, "addItem", js.Any.fromFunction1(value))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    }
  }
  
  type IPaletteItem = IItemOptions
}
