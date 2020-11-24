package typings.jupyterlabNotebook

import typings.jupyterlabApputils.mod.WidgetTracker
import typings.jupyterlabCells.mod.Cell
import typings.jupyterlabNotebook.panelMod.NotebookPanel
import typings.jupyterlabNotebook.tokensMod.INotebookTracker
import typings.jupyterlabStatedb.interfacesMod.IRestorable.IOptions
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/notebook/lib/tracker", JSImport.Namespace)
@js.native
object trackerMod extends js.Object {
  
  @js.native
  class NotebookTracker ()
    extends WidgetTracker[NotebookPanel]
       with INotebookTracker {
    
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
      * Add a new widget to the tracker.
      *
      * @param widget - The widget being added.
      *
      * #### Notes
      * The widget passed into the tracker is added synchronously; its existence in
      * the tracker can be checked with the `has()` method. The promise this method
      * returns resolves after the widget has been added and saved to an underlying
      * restoration connector, if one is available.
      *
      * The newly added widget becomes the current widget unless the focus tracker
      * already had a focused widget.
      */
    /* InferMemberOverrides */
    override def add(widget: NotebookPanel): js.Promise[Unit] = js.native
    
    /**
      * A signal emitted when the current widget changes.
      */
    /* InferMemberOverrides */
    @JSName("currentChanged")
    override def currentChanged_MWidgetTracker_ : ISignal[this.type, NotebookPanel | Null] = js.native
    
    /**
      * The current widget is the most recently focused or added widget.
      *
      * #### Notes
      * It is the most recently focused widget, or the most recently added
      * widget if no widget has taken focus.
      */
    /* InferMemberOverrides */
    @JSName("currentWidget")
    override def currentWidget_MWidgetTracker_ : NotebookPanel | Null = js.native
    
    /**
      * Test whether the tracker is disposed.
      */
    /* InferMemberOverrides */
    @JSName("isDisposed")
    override def isDisposed_MWidgetTracker_ : Boolean = js.native
    
    /**
      * Handle the current change event.
      *
      * #### Notes
      * The default implementation is a no-op.
      */
    /* InferMemberOverrides */
    /* protected */ override def onCurrentChanged(): Unit = js.native
    /* InferMemberOverrides */
    /* protected */ override def onCurrentChanged(value: NotebookPanel): Unit = js.native
    
    /**
      * Restore the objects in this restorable collection.
      *
      * @param options - The configuration options that describe restoration.
      *
      * @returns A promise that settles when restored with `any` results.
      *
      */
    /* InferMemberOverrides */
    /* InferMemberOverrides */
    override def restore(options: IOptions[NotebookPanel]): js.Promise[js.Any] = js.native
    
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
      * A promise resolved when the tracker has been restored.
      */
    /* InferMemberOverrides */
    @JSName("restored")
    override def restored_MWidgetTracker_ : js.Promise[Unit] = js.native
    
    /**
      * Save the restore data for a given widget.
      *
      * @param widget - The widget being saved.
      */
    /* InferMemberOverrides */
    override def save(widget: NotebookPanel): js.Promise[Unit] = js.native
    
    /**
      * A signal emitted when the selection state changes.
      */
    @JSName("selectionChanged")
    def selectionChanged_MNotebookTracker: ISignal[this.type, Unit] = js.native
    
    /**
      * The number of widgets held by the tracker.
      */
    /* InferMemberOverrides */
    @JSName("size")
    override def size_MWidgetTracker_ : Double = js.native
    
    /**
      * A signal emitted when a widget is added.
      *
      * #### Notes
      * This signal will only fire when a widget is added to the tracker. It will
      * not fire if a widget is injected into the tracker.
      */
    /* InferMemberOverrides */
    @JSName("widgetAdded")
    override def widgetAdded_MWidgetTracker_ : ISignal[this.type, NotebookPanel] = js.native
    
    /**
      * A signal emitted when a widget is updated.
      */
    /* InferMemberOverrides */
    @JSName("widgetUpdated")
    override def widgetUpdated_MWidgetTracker_ : ISignal[this.type, NotebookPanel] = js.native
  }
}
