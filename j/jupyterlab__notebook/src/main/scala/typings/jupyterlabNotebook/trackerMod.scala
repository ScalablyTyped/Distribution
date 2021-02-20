package typings.jupyterlabNotebook

import typings.jupyterlabApputils.mod.WidgetTracker
import typings.jupyterlabApputils.widgettrackerMod.WidgetTracker.IOptions
import typings.jupyterlabCells.mod.Cell
import typings.jupyterlabNotebook.panelMod.NotebookPanel
import typings.jupyterlabNotebook.tokensMod.INotebookTracker
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trackerMod {
  
  @JSImport("@jupyterlab/notebook/lib/tracker", "NotebookTracker")
  @js.native
  class NotebookTracker protected ()
    extends WidgetTracker[NotebookPanel]
       with INotebookTracker {
    /**
      * Create a new widget tracker.
      *
      * @param options - The instantiation options for a widget tracker.
      */
    def this(options: IOptions) = this()
    
    var _activeCell: js.Any = js.native
    
    var _activeCellChanged: js.Any = js.native
    
    var _onActiveCellChanged: js.Any = js.native
    
    var _onSelectionChanged: js.Any = js.native
    
    var _selectionChanged: js.Any = js.native
    
    /**
      * A signal emitted when the current active cell changes.
      *
      * #### Notes
      * If there is no cell with the focus, then `null` will be emitted.
      */
    @JSName("activeCellChanged")
    def activeCellChanged_MNotebookTracker: ISignal[this.type, Cell | Null] = js.native
    
    /**
      * The currently focused cell.
      *
      * #### Notes
      * This is a read-only property. If there is no cell with the focus, then this
      * value is `null`.
      */
    @JSName("activeCell")
    def activeCell_MNotebookTracker: Cell | Null = js.native
    
    /**
      * A promise that is resolved when the widget tracker has been
      * restored from a serialized state.
      *
      * #### Notes
      * Most client code will not need to use this, since they can wait
      * for the whole application to restore. However, if an extension
      * wants to perform actions during the application restoration, but
      * after the restoration of another widget tracker, they can use
      * this promise.
      */
    /* InferMemberOverrides */
    override val restored: js.Promise[Unit] with js.Promise[js.Any] = js.native
    
    /**
      * A signal emitted when the selection state changes.
      */
    @JSName("selectionChanged")
    def selectionChanged_MNotebookTracker: ISignal[this.type, Unit] = js.native
  }
}
