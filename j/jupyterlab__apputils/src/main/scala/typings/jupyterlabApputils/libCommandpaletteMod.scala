package typings.jupyterlabApputils

import typings.jupyterlabApputils.libCommandpaletteMod.ModalCommandPalette.IOptions
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.mod.CommandPalette
import typings.luminoWidgets.mod.Panel
import typings.luminoWidgets.typesCommandpaletteMod.CommandPalette.IItemOptions
import typings.std.Event
import typings.std.HTMLDivElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommandpaletteMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICommandPalette] (val x: Self) extends AnyVal {
      
      inline def setActivate(value: () => Unit): Self = StObject.set(x, "activate", js.Any.fromFunction0(value))
      
      inline def setAddItem(value: IPaletteItem => IDisposable): Self = StObject.set(x, "addItem", js.Any.fromFunction1(value))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@jupyterlab/apputils/lib/commandpalette", "ModalCommandPalette")
  @js.native
  open class ModalCommandPalette protected () extends Panel {
    def this(options: IOptions) = this()
    
    /* private */ var _commandPalette: Any = js.native
    
    /**
      * Handle the `'keydown'` event for the widget.
      */
    /* protected */ def _evtKeydown(event: KeyboardEvent): Unit = js.native
    
    def attach(): Unit = js.native
    
    /**
      * Create element with search icon group.
      */
    /* protected */ def createSearchIconGroup(): HTMLDivElement = js.native
    
    def detach(): Unit = js.native
    
    /**
      * Handle incoming events.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * Hide the modal command palette and reset its search.
      */
    def hideAndReset(): Unit = js.native
    
    def palette: CommandPalette = js.native
    def palette_=(value: CommandPalette): Unit = js.native
    
    /**
      * Find the element with search icon group.
      */
    /* protected */ def searchIconGroup: js.UndefOr[HTMLDivElement] = js.native
  }
  object ModalCommandPalette {
    
    trait IOptions extends StObject {
      
      var commandPalette: CommandPalette
    }
    object IOptions {
      
      inline def apply(commandPalette: CommandPalette): IOptions = {
        val __obj = js.Dynamic.literal(commandPalette = commandPalette.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setCommandPalette(value: CommandPalette): Self = StObject.set(x, "commandPalette", value.asInstanceOf[js.Any])
      }
    }
  }
  
  type IPaletteItem = IItemOptions
}
