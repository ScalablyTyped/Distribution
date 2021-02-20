package typings.jupyterlabApputils

import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.commandpaletteMod.CommandPalette.IItemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandpaletteMod {
  
  @js.native
  trait ICommandPalette extends StObject {
    
    /**
      * Activate the command palette for user input.
      */
    def activate(): Unit = js.native
    
    /**
      * Add a command item to the command palette.
      *
      * @param options - The options for creating the command item.
      *
      * @returns A disposable that will remove the item from the palette.
      */
    def addItem(options: IPaletteItem): IDisposable = js.native
    
    /**
      * The placeholder text of the command palette's search input.
      */
    var placeholder: String = js.native
  }
  object ICommandPalette {
    
    @JSImport("@jupyterlab/apputils/lib/commandpalette", "ICommandPalette")
    @js.native
    val ^ : Token[ICommandPalette] = js.native
    
    @scala.inline
    implicit class ICommandPaletteMutableBuilder[Self <: ICommandPalette] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivate(value: () => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAddItem(value: IPaletteItem => IDisposable): Self = StObject.set(x, "addItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    }
  }
  
  type IPaletteItem = IItemOptions
}
