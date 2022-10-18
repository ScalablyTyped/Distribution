package typings.jupyterlabStatusbar

import typings.jupyterlabStatusbar.libTokensMod.IStatusBar
import typings.jupyterlabStatusbar.libTokensMod.IStatusBar.IItem
import typings.luminoDisposable.mod.IDisposable
import typings.luminoMessaging.mod.Message
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStatusbarMod {
  
  @JSImport("@jupyterlab/statusbar/lib/statusbar", "StatusBar")
  @js.native
  open class StatusBar ()
    extends Widget
       with IStatusBar {
    
    /* private */ var _disposables: Any = js.native
    
    /* private */ var _findInsertIndex: Any = js.native
    
    /* private */ var _leftRankItems: Any = js.native
    
    /* private */ var _leftSide: Any = js.native
    
    /* private */ var _middlePanel: Any = js.native
    
    /* private */ var _refreshAll: Any = js.native
    
    /* private */ var _refreshItem: Any = js.native
    
    /* private */ var _rightRankItems: Any = js.native
    
    /* private */ var _rightSide: Any = js.native
    
    /* private */ var _statusItems: Any = js.native
    
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
    /* CompleteClass */
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
