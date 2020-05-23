package typings.igniteUi.global.Infragistics

import typings.igniteUi.SelectionCollectionSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.SelectedCellsCollection")
@js.native
class SelectedCellsCollection protected ()
  extends typings.igniteUi.Infragistics.SelectedCellsCollection {
  def this(settings: SelectionCollectionSettings) = this()
  /* CompleteClass */
  override def activate(identifier: js.Object, element: js.Object, suppress: js.Object): Unit = js.native
  /* CompleteClass */
  override def activeCell(): Unit = js.native
  /* CompleteClass */
  override def addSubscriber(subscriber: js.Object, owner: js.Object): Unit = js.native
  /* CompleteClass */
  override def atLeastOneSelected(rowId: js.Object, forOwner: js.Object): Unit = js.native
  /* CompleteClass */
  override def changeOwner(newOwner: js.Object): Unit = js.native
  /* CompleteClass */
  override def cleanAll(forOwner: js.Object): Unit = js.native
  /* CompleteClass */
  override def clearSelection(forOwner: js.Object): Unit = js.native
  /* CompleteClass */
  override def deactivate(suppress: js.Object): Unit = js.native
  /* CompleteClass */
  override def deselect(identifier: js.Object, info: js.Object, suppress: js.Object): Unit = js.native
  /* CompleteClass */
  override def deselectAll(suppress: js.Object): Unit = js.native
  /* CompleteClass */
  override def elementFromIdentifier(identifier: js.Object): Unit = js.native
  /* CompleteClass */
  override def elementPosition(identifier: js.Object, element: js.Object): Unit = js.native
  /* CompleteClass */
  override def isActive(identifier: js.Object, forOwner: js.Object): Unit = js.native
  /* CompleteClass */
  override def isSelected(identifier: js.Object, forOwner: js.Object): Unit = js.native
  /* CompleteClass */
  override def onlyOneSelected(): Unit = js.native
  /* CompleteClass */
  override def rangeDeselect(range: js.Object, info: js.Object, suppress: js.Object): Unit = js.native
  /* CompleteClass */
  override def rangeSelect(range: js.Object, add: js.Object, prevRange: js.Object, info: js.Object, suppress: js.Object): Unit = js.native
  /* CompleteClass */
  override def removeSubscriber(subscriberId: js.Object, owner: js.Object): Unit = js.native
  /* CompleteClass */
  override def select(identifier: js.Object, add: js.Object, info: js.Object, suppress: js.Object): Unit = js.native
  /* CompleteClass */
  override def selectedCells(): Unit = js.native
  /* CompleteClass */
  override def selectedRows(): Unit = js.native
  /* CompleteClass */
  override def selectionLength(): Unit = js.native
  /* CompleteClass */
  override def toggle(element: js.Object): Unit = js.native
}

