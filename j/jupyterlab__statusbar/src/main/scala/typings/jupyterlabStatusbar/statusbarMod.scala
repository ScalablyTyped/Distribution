package typings.jupyterlabStatusbar

import typings.jupyterlabStatusbar.tokensMod.IStatusBar
import typings.jupyterlabStatusbar.tokensMod.IStatusBar.IItem
import typings.luminoDisposable.mod.IDisposable
import typings.luminoMessaging.mod.Message
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusbarMod {
  
  @JSImport("@jupyterlab/statusbar/lib/statusbar", "StatusBar")
  @js.native
  class StatusBar ()
    extends Widget
       with IStatusBar {
    
    /* private */ var _disposables: js.Any = js.native
    
    /* private */ var _findInsertIndex: js.Any = js.native
    
    /* private */ var _leftRankItems: js.Any = js.native
    
    /* private */ var _leftSide: js.Any = js.native
    
    /* private */ var _middlePanel: js.Any = js.native
    
    /* private */ var _refreshAll: js.Any = js.native
    
    /* private */ var _refreshItem: js.Any = js.native
    
    /* private */ var _rightRankItems: js.Any = js.native
    
    /* private */ var _rightSide: js.Any = js.native
    
    /* private */ var _statusItems: js.Any = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    /**
      * Process a message sent to the handler.
      *
      * @param msg - The message to be processed.
      */
    /* InferMemberOverrides */
    override def processMessage(msg: Message): Unit = js.native
    
    /**
      * Register a new status item.
      *
      * @param id - a unique id for the status item.
      *
      * @param options - The options for how to add the status item.
      *
      * @returns an `IDisposable` that can be disposed to remove the item.
      */
    /* CompleteClass */
    override def registerStatusItem(id: String, statusItem: IItem): IDisposable = js.native
  }
}
