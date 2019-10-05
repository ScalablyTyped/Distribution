package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.handsontable.handsontableMod._Handsontable.Core
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualRowResize extends Base {
  var autoresizeTimeout: js.Function0[Unit] | Unit
  var currentRow: Double | Unit
  var currentTH: HTMLElement | Unit
  var currentWidth: Double | Unit
  var dblclick: Double
  var eventManager: typings.handsontable.handsontableMod.Handsontable.plugins.EventManager
  var guide: HTMLElement
  var handle: HTMLElement
  var manualRowHeights: js.Array[_]
  var newSize: Double | Unit
  var pressed: Core | Unit
  var selectedRows: js.Array[_]
  var startOffset: Double | Unit
  var startWidth: Double | Unit
  var startY: Double | Unit
  def checkIfRowHeader(element: HTMLElement): Boolean
  def clearManualSize(column: Double): Unit
  def getTHFromTargetElement(element: HTMLElement): HTMLElement
  def hideHandleAndGuide(): Unit
  def loadManualRowHeights(): Unit
  def refreshGuidePosition(): Unit
  def refreshHandlePosition(): Unit
  def saveManualRowHeights(): Unit
  def setManualSize(column: Double, width: Double): Double
  def setupGuidePosition(): Unit
  def setupHandlePosition(TH: HTMLElement): Boolean | Unit
}

object ManualRowResize {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    autoresizeTimeout: js.Function0[Unit] | Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    checkIfRowHeader: HTMLElement => Boolean,
    clearHooks: () => Unit,
    clearManualSize: Double => Unit,
    currentRow: Double | Unit,
    currentTH: HTMLElement | Unit,
    currentWidth: Double | Unit,
    dblclick: Double,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: typings.handsontable.handsontableMod.Handsontable.plugins.EventManager,
    getTHFromTargetElement: HTMLElement => HTMLElement,
    guide: HTMLElement,
    handle: HTMLElement,
    hideHandleAndGuide: () => Unit,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    loadManualRowHeights: () => Unit,
    manualRowHeights: js.Array[_],
    newSize: Double | Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    pressed: Core | Unit,
    refreshGuidePosition: () => Unit,
    refreshHandlePosition: () => Unit,
    removeHooks: String => Unit,
    saveManualRowHeights: () => Unit,
    selectedRows: js.Array[_],
    setManualSize: (Double, Double) => Double,
    setupGuidePosition: () => Unit,
    setupHandlePosition: HTMLElement => Boolean | Unit,
    startOffset: Double | Unit,
    startWidth: Double | Unit,
    startY: Double | Unit
  ): ManualRowResize = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), autoresizeTimeout = autoresizeTimeout.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), checkIfRowHeader = js.Any.fromFunction1(checkIfRowHeader), clearHooks = js.Any.fromFunction0(clearHooks), clearManualSize = js.Any.fromFunction1(clearManualSize), currentRow = currentRow.asInstanceOf[js.Any], currentTH = currentTH.asInstanceOf[js.Any], currentWidth = currentWidth.asInstanceOf[js.Any], dblclick = dblclick, destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, eventManager = eventManager, getTHFromTargetElement = js.Any.fromFunction1(getTHFromTargetElement), guide = guide, handle = handle, hideHandleAndGuide = js.Any.fromFunction0(hideHandleAndGuide), init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, loadManualRowHeights = js.Any.fromFunction0(loadManualRowHeights), manualRowHeights = manualRowHeights, newSize = newSize.asInstanceOf[js.Any], pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, pressed = pressed.asInstanceOf[js.Any], refreshGuidePosition = js.Any.fromFunction0(refreshGuidePosition), refreshHandlePosition = js.Any.fromFunction0(refreshHandlePosition), removeHooks = js.Any.fromFunction1(removeHooks), saveManualRowHeights = js.Any.fromFunction0(saveManualRowHeights), selectedRows = selectedRows, setManualSize = js.Any.fromFunction2(setManualSize), setupGuidePosition = js.Any.fromFunction0(setupGuidePosition), setupHandlePosition = js.Any.fromFunction1(setupHandlePosition), startOffset = startOffset.asInstanceOf[js.Any], startWidth = startWidth.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ManualRowResize]
  }
}

