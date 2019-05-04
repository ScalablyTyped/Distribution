package typings
package atJupyterlabNotebookLib.libTrackerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook/lib/tracker", "NotebookTracker")
@js.native
class NotebookTracker ()
  extends atJupyterlabApputilsLib.atJupyterlabApputilsMod.InstanceTracker[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any
    ]
     with INotebookTracker {
  var _activeCell: js.Any = js.native
  var _activeCellChanged: js.Any = js.native
  var _onActiveCellChanged: js.Any = js.native
  var _onSelectionChanged: js.Any = js.native
  var _selectionChanged: js.Any = js.native
  /**
    * The currently focused cell.
    *
    * #### Notes
    * If there is no cell with the focus, then this value is `null`.
    */
  /* CompleteClass */
  override val activeCell: atJupyterlabCellsLib.atJupyterlabCellsMod.Cell = js.native
  /**
    * A signal emitted when the current active cell changes.
    *
    * #### Notes
    * If there is no cell with the focus, then `null` will be emitted.
    */
  /* CompleteClass */
  override val activeCellChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabCellsLib.atJupyterlabCellsMod.Cell] = js.native
  /**
    * A signal emitted when the current widget changes.
    *
    * #### Notes
    * If the last widget being tracked is disposed, `null` will be emitted.
    */
  /* CompleteClass */
  override val currentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any) | scala.Null
  ] = js.native
  /**
    * The current widget is the most recently focused or added widget.
    *
    * #### Notes
    * It is the most recently focused widget, or the most recently added
    * widget if no widget has taken focus.
    */
  /* CompleteClass */
  override val currentWidget: (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any) | scala.Null = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: scala.Boolean = js.native
  /**
    * A signal emitted when the selection state changes.
    */
  /* CompleteClass */
  override val selectionChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit] = js.native
  /**
    * The number of widgets held by the tracker.
    */
  /* CompleteClass */
  override val size: scala.Double = js.native
  /**
    * A signal emitted when a widget is added.
    *
    * #### Notes
    * This signal will only fire when a widget is added to the tracker. It will
    * not fire if a widget is injected into the tracker.
    */
  /* CompleteClass */
  override val widgetAdded: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
    this.type, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any
  ] = js.native
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
  /* CompleteClass */
  /* InferMemberOverrides */
  override def dispose(): scala.Unit = js.native
  /**
    * Filter the widgets in the tracker based on a predicate.
    *
    * @param fn - The function by which to filter.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def filter(
    fn: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any, 
      scala.Boolean
    ]
  ): js.Array[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any
  ] = js.native
  /**
    * Find the first widget in the tracker that satisfies a filter function.
    *
    * @param - fn The filter function to call on each widget.
    *
    * #### Notes
    * If no widget is found, the value returned is `undefined`.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def find(
    fn: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any, 
      scala.Boolean
    ]
  ): js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any
  ] = js.native
  /**
    * Iterate through each widget in the tracker.
    *
    * @param fn - The function to call on each widget.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def forEach(
    fn: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
    * Check if this tracker has the specified widget.
    *
    * @param widget - The widget whose existence is being checked.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def has(widget: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget): scala.Boolean = js.native
  /**
    * Inject a foreign widget into the instance tracker.
    *
    * @param widget - The widget to inject into the tracker.
    *
    * #### Notes
    * Any widgets injected into an instance tracker will not have their state
    * saved by the tracker. The primary use case for widget injection is for a
    * plugin that offers a sub-class of an extant plugin to have its instances
    * share the same commands as the parent plugin (since most relevant commands
    * will use the `currentWidget` of the parent plugin's instance tracker). In
    * this situation, the sub-class plugin may well have its own instance tracker
    * for layout and state restoration in addition to injecting its widgets into
    * the parent plugin's instance tracker.
    */
  /* CompleteClass */
  /* InferMemberOverrides */
  override def inject(
    widget: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any
  ): scala.Unit = js.native
}

