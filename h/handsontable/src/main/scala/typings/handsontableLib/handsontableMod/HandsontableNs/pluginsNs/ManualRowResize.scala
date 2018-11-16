package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ManualRowResize extends Base {
  var autoresizeTimeout: js.Function0[scala.Unit] | scala.Unit
  var currentRow: scala.Double | scala.Unit
  var currentTH: stdLib.HTMLElement | scala.Unit
  var currentWidth: scala.Double | scala.Unit
  var dblclick: scala.Double
  var eventManager: EventManager
  var guide: stdLib.HTMLElement
  var handle: stdLib.HTMLElement
  var manualRowHeights: js.Array[_]
  var newSize: scala.Double | scala.Unit
  var pressed: handsontableLib.handsontableMod.underscoreHandsontableNs.Core | scala.Unit
  var selectedRows: js.Array[_]
  var startOffset: scala.Double | scala.Unit
  var startWidth: scala.Double | scala.Unit
  var startY: scala.Double | scala.Unit
  def checkIfRowHeader(element: stdLib.HTMLElement): scala.Boolean
  def clearManualSize(column: scala.Double): scala.Unit
  def getTHFromTargetElement(element: stdLib.HTMLElement): stdLib.HTMLElement
  def hideHandleAndGuide(): scala.Unit
  def loadManualRowHeights(): scala.Unit
  def refreshGuidePosition(): scala.Unit
  def refreshHandlePosition(): scala.Unit
  def saveManualRowHeights(): scala.Unit
  def setManualSize(column: scala.Double, width: scala.Double): scala.Double
  def setupGuidePosition(): scala.Unit
  def setupHandlePosition(TH: stdLib.HTMLElement): scala.Boolean | scala.Unit
}

