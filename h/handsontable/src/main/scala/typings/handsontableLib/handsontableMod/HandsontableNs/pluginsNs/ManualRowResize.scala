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

object ManualRowResize {
  @scala.inline
  def apply(
    addHook: (java.lang.String, js.Function1[/* repeated */ js.Any, _]) => scala.Unit,
    autoresizeTimeout: js.Function0[scala.Unit] | scala.Unit,
    callOnPluginsReady: js.Function0[scala.Unit] => scala.Unit,
    checkIfRowHeader: stdLib.HTMLElement => scala.Boolean,
    clearHooks: () => scala.Unit,
    clearManualSize: scala.Double => scala.Unit,
    currentRow: scala.Double | scala.Unit,
    currentTH: stdLib.HTMLElement | scala.Unit,
    currentWidth: scala.Double | scala.Unit,
    dblclick: scala.Double,
    destroy: () => scala.Unit,
    disablePlugin: () => scala.Unit,
    enablePlugin: () => scala.Unit,
    enabled: scala.Boolean,
    eventManager: EventManager,
    getTHFromTargetElement: stdLib.HTMLElement => stdLib.HTMLElement,
    guide: stdLib.HTMLElement,
    handle: stdLib.HTMLElement,
    hideHandleAndGuide: () => scala.Unit,
    init: () => scala.Unit,
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    loadManualRowHeights: () => scala.Unit,
    manualRowHeights: js.Array[_],
    newSize: scala.Double | scala.Unit,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    pressed: handsontableLib.handsontableMod.underscoreHandsontableNs.Core | scala.Unit,
    refreshGuidePosition: () => scala.Unit,
    refreshHandlePosition: () => scala.Unit,
    removeHooks: java.lang.String => scala.Unit,
    saveManualRowHeights: () => scala.Unit,
    selectedRows: js.Array[_],
    setManualSize: (scala.Double, scala.Double) => scala.Double,
    setupGuidePosition: () => scala.Unit,
    setupHandlePosition: stdLib.HTMLElement => scala.Boolean | scala.Unit,
    startOffset: scala.Double | scala.Unit,
    startWidth: scala.Double | scala.Unit,
    startY: scala.Double | scala.Unit
  ): ManualRowResize = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), autoresizeTimeout = autoresizeTimeout.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), checkIfRowHeader = js.Any.fromFunction1(checkIfRowHeader), clearHooks = js.Any.fromFunction0(clearHooks), clearManualSize = js.Any.fromFunction1(clearManualSize), currentRow = currentRow.asInstanceOf[js.Any], currentTH = currentTH.asInstanceOf[js.Any], currentWidth = currentWidth.asInstanceOf[js.Any], dblclick = dblclick, destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, eventManager = eventManager, getTHFromTargetElement = js.Any.fromFunction1(getTHFromTargetElement), guide = guide, handle = handle, hideHandleAndGuide = js.Any.fromFunction0(hideHandleAndGuide), init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, loadManualRowHeights = js.Any.fromFunction0(loadManualRowHeights), manualRowHeights = manualRowHeights, newSize = newSize.asInstanceOf[js.Any], pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, pressed = pressed.asInstanceOf[js.Any], refreshGuidePosition = js.Any.fromFunction0(refreshGuidePosition), refreshHandlePosition = js.Any.fromFunction0(refreshHandlePosition), removeHooks = js.Any.fromFunction1(removeHooks), saveManualRowHeights = js.Any.fromFunction0(saveManualRowHeights), selectedRows = selectedRows, setManualSize = js.Any.fromFunction2(setManualSize), setupGuidePosition = js.Any.fromFunction0(setupGuidePosition), setupHandlePosition = js.Any.fromFunction1(setupHandlePosition), startOffset = startOffset.asInstanceOf[js.Any], startWidth = startWidth.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ManualRowResize]
  }
}

