package typings
package handsontableLib.handsontableMod.HandsontableNs.pluginsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualColumnResize extends Base {
  var autoresizeTimeout: js.Function0[scala.Unit] | scala.Unit
  var currentCol: scala.Double | scala.Unit
  var currentTH: stdLib.HTMLElement | scala.Unit
  var currentWidth: scala.Double | scala.Unit
  var dblclick: scala.Double
  var eventManager: EventManager
  var guide: stdLib.HTMLElement
  var handle: stdLib.HTMLElement
  var manualColumnWidths: js.Array[_]
  var newSize: scala.Double | scala.Unit
  var pressed: handsontableLib.handsontableMod.underscoreHandsontableNs.Core | scala.Unit
  var selectedCols: js.Array[_]
  var startOffset: scala.Double | scala.Unit
  var startWidth: scala.Double | scala.Unit
  var startY: scala.Double | scala.Unit
  def checkIfColumnHeader(element: stdLib.HTMLElement): scala.Boolean
  def clearManualSize(column: scala.Double): scala.Unit
  def getTHFromTargetElement(element: stdLib.HTMLElement): stdLib.HTMLElement
  def hideHandleAndGuide(): scala.Unit
  def loadManualColumnWidths(): scala.Unit
  def refreshGuidePosition(): scala.Unit
  def refreshHandlePosition(): scala.Unit
  def saveManualColumnWidths(): scala.Unit
  def setManualSize(column: scala.Double, width: scala.Double): scala.Double
  def setupGuidePosition(): scala.Unit
  def setupHandlePosition(TH: stdLib.HTMLElement): scala.Boolean | scala.Unit
}

object ManualColumnResize {
  @scala.inline
  def apply(
    addHook: (java.lang.String, js.Function1[/* repeated */ js.Any, _]) => scala.Unit,
    autoresizeTimeout: js.Function0[scala.Unit] | scala.Unit,
    callOnPluginsReady: js.Function0[scala.Unit] => scala.Unit,
    checkIfColumnHeader: stdLib.HTMLElement => scala.Boolean,
    clearHooks: () => scala.Unit,
    clearManualSize: scala.Double => scala.Unit,
    currentCol: scala.Double | scala.Unit,
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
    loadManualColumnWidths: () => scala.Unit,
    manualColumnWidths: js.Array[_],
    newSize: scala.Double | scala.Unit,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    pressed: handsontableLib.handsontableMod.underscoreHandsontableNs.Core | scala.Unit,
    refreshGuidePosition: () => scala.Unit,
    refreshHandlePosition: () => scala.Unit,
    removeHooks: java.lang.String => scala.Unit,
    saveManualColumnWidths: () => scala.Unit,
    selectedCols: js.Array[_],
    setManualSize: (scala.Double, scala.Double) => scala.Double,
    setupGuidePosition: () => scala.Unit,
    setupHandlePosition: stdLib.HTMLElement => scala.Boolean | scala.Unit,
    startOffset: scala.Double | scala.Unit,
    startWidth: scala.Double | scala.Unit,
    startY: scala.Double | scala.Unit
  ): ManualColumnResize = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), autoresizeTimeout = autoresizeTimeout.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), checkIfColumnHeader = js.Any.fromFunction1(checkIfColumnHeader), clearHooks = js.Any.fromFunction0(clearHooks), clearManualSize = js.Any.fromFunction1(clearManualSize), currentCol = currentCol.asInstanceOf[js.Any], currentTH = currentTH.asInstanceOf[js.Any], currentWidth = currentWidth.asInstanceOf[js.Any], dblclick = dblclick, destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, eventManager = eventManager, getTHFromTargetElement = js.Any.fromFunction1(getTHFromTargetElement), guide = guide, handle = handle, hideHandleAndGuide = js.Any.fromFunction0(hideHandleAndGuide), init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, loadManualColumnWidths = js.Any.fromFunction0(loadManualColumnWidths), manualColumnWidths = manualColumnWidths, newSize = newSize.asInstanceOf[js.Any], pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, pressed = pressed.asInstanceOf[js.Any], refreshGuidePosition = js.Any.fromFunction0(refreshGuidePosition), refreshHandlePosition = js.Any.fromFunction0(refreshHandlePosition), removeHooks = js.Any.fromFunction1(removeHooks), saveManualColumnWidths = js.Any.fromFunction0(saveManualColumnWidths), selectedCols = selectedCols, setManualSize = js.Any.fromFunction2(setManualSize), setupGuidePosition = js.Any.fromFunction0(setupGuidePosition), setupHandlePosition = js.Any.fromFunction1(setupHandlePosition), startOffset = startOffset.asInstanceOf[js.Any], startWidth = startWidth.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ManualColumnResize]
  }
}

