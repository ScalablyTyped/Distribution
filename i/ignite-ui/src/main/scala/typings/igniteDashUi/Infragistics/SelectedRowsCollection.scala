package typings.igniteDashUi.Infragistics

import typings.igniteDashUi.SelectionCollectionSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.SelectedRowsCollection")
@js.native
class SelectedRowsCollection protected () extends js.Object {
  def this(settings: SelectionCollectionSettings) = this()
  def activate(identifier: js.Object, element: js.Object, suppress: js.Object): Unit = js.native
  def activeRow(): Unit = js.native
  def addSubscriber(subscriber: js.Object, owner: js.Object): Unit = js.native
  def changeOwner(newOwner: js.Object): Unit = js.native
  def cleanAll(forOwner: js.Object): Unit = js.native
  def clearSelection(forOwner: js.Object): Unit = js.native
  def deactivate(suppress: js.Object): Unit = js.native
  def deselect(identifier: js.Object, info: js.Object, suppress: js.Object): Unit = js.native
  def deselectAll(suppress: js.Object): Unit = js.native
  def elementFromIdentifier(identifier: js.Object): Unit = js.native
  def elementPosition(identifier: js.Object, element: js.Object): Unit = js.native
  def isActive(identifier: js.Object, forOwner: js.Object): Unit = js.native
  def isSelected(identifier: js.Object, forOwner: js.Object): Unit = js.native
  def onlyOneSelected(): Unit = js.native
  def rangeDeselect(range: js.Object, info: js.Object, suppress: js.Object): Unit = js.native
  def rangeSelect(range: js.Object, add: js.Object, prevRange: js.Object, info: js.Object, suppress: js.Object): Unit = js.native
  def removeSubscriber(subscriberId: js.Object, owner: js.Object): Unit = js.native
  def select(identifier: js.Object, add: js.Object, info: js.Object, suppress: js.Object): Unit = js.native
  def selectedCells(): Unit = js.native
  def selectedDataRows(): Unit = js.native
  def selectedRows(): Unit = js.native
  def selectionLength(): Unit = js.native
  def toggle(element: js.Object): Unit = js.native
}

