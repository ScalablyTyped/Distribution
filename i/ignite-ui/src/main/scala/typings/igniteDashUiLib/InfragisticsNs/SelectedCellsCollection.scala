package typings
package igniteDashUiLib.InfragisticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Infragistics.SelectedCellsCollection")
@js.native
class SelectedCellsCollection protected () extends js.Object {
  def this(settings: igniteDashUiLib.SelectionCollectionSettings) = this()
  def activate(identifier: js.Object, element: js.Object, suppress: js.Object): scala.Unit = js.native
  def activeCell(): scala.Unit = js.native
  def addSubscriber(subscriber: js.Object, owner: js.Object): scala.Unit = js.native
  def atLeastOneSelected(rowId: js.Object, forOwner: js.Object): scala.Unit = js.native
  def changeOwner(newOwner: js.Object): scala.Unit = js.native
  def cleanAll(forOwner: js.Object): scala.Unit = js.native
  def clearSelection(forOwner: js.Object): scala.Unit = js.native
  def deactivate(suppress: js.Object): scala.Unit = js.native
  def deselect(identifier: js.Object, info: js.Object, suppress: js.Object): scala.Unit = js.native
  def deselectAll(suppress: js.Object): scala.Unit = js.native
  def elementFromIdentifier(identifier: js.Object): scala.Unit = js.native
  def elementPosition(identifier: js.Object, element: js.Object): scala.Unit = js.native
  def isActive(identifier: js.Object, forOwner: js.Object): scala.Unit = js.native
  def isSelected(identifier: js.Object, forOwner: js.Object): scala.Unit = js.native
  def onlyOneSelected(): scala.Unit = js.native
  def rangeDeselect(range: js.Object, info: js.Object, suppress: js.Object): scala.Unit = js.native
  def rangeSelect(range: js.Object, add: js.Object, prevRange: js.Object, info: js.Object, suppress: js.Object): scala.Unit = js.native
  def removeSubscriber(subscriberId: js.Object, owner: js.Object): scala.Unit = js.native
  def select(identifier: js.Object, add: js.Object, info: js.Object, suppress: js.Object): scala.Unit = js.native
  def selectedCells(): scala.Unit = js.native
  def selectedRows(): scala.Unit = js.native
  def selectionLength(): scala.Unit = js.native
  def toggle(element: js.Object): scala.Unit = js.native
}

