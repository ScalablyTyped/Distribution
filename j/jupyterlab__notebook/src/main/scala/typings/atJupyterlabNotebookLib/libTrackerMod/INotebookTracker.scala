package typings
package atJupyterlabNotebookLib.libTrackerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotebookTracker
  extends atJupyterlabApputilsLib.libInstancetrackerMod.IInstanceTracker[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any
    ] {
  /**
    * The currently focused cell.
    *
    * #### Notes
    * If there is no cell with the focus, then this value is `null`.
    */
  val activeCell: atJupyterlabCellsLib.atJupyterlabCellsMod.Cell
  /**
    * A signal emitted when the current active cell changes.
    *
    * #### Notes
    * If there is no cell with the focus, then `null` will be emitted.
    */
  val activeCellChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, atJupyterlabCellsLib.atJupyterlabCellsMod.Cell]
  /**
    * A signal emitted when the selection state changes.
    */
  val selectionChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, scala.Unit]
}

object INotebookTracker {
  @scala.inline
  def apply(
    activeCell: atJupyterlabCellsLib.atJupyterlabCellsMod.Cell,
    activeCellChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[INotebookTracker, atJupyterlabCellsLib.atJupyterlabCellsMod.Cell],
    currentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
      INotebookTracker, 
      (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any) | scala.Null
    ],
    dispose: () => scala.Unit,
    filter: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any, 
      scala.Boolean
    ] => js.Array[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any
    ],
    find: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any, 
      scala.Boolean
    ] => js.UndefOr[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any
    ],
    forEach: js.Function1[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any, 
      scala.Unit
    ] => scala.Unit,
    has: atPhosphorWidgetsLib.atPhosphorWidgetsMod.Widget => scala.Boolean,
    inject: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any => scala.Unit,
    isDisposed: scala.Boolean,
    selectionChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[INotebookTracker, scala.Unit],
    size: scala.Double,
    widgetAdded: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[
      INotebookTracker, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any
    ],
    currentWidget: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NotebookPanel */ js.Any = null
  ): INotebookTracker = {
    val __obj = js.Dynamic.literal(activeCell = activeCell, activeCellChanged = activeCellChanged, currentChanged = currentChanged, dispose = js.Any.fromFunction0(dispose), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), forEach = js.Any.fromFunction1(forEach), has = js.Any.fromFunction1(has), inject = js.Any.fromFunction1(inject), isDisposed = isDisposed, selectionChanged = selectionChanged, size = size, widgetAdded = widgetAdded)
    if (currentWidget != null) __obj.updateDynamic("currentWidget")(currentWidget)
    __obj.asInstanceOf[INotebookTracker]
  }
}

