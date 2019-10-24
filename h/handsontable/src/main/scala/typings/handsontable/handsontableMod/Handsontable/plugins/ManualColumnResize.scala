package typings.handsontable.handsontableMod.Handsontable.plugins

import typings.handsontable.handsontableMod._Handsontable.Core
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManualColumnResize extends Base {
  var autoresizeTimeout: js.Function0[Unit] | Unit
  var currentCol: Double | Unit
  var currentTH: HTMLElement | Unit
  var currentWidth: Double | Unit
  var dblclick: Double
  var eventManager: typings.handsontable.handsontableMod.Handsontable.plugins.EventManager
  var guide: HTMLElement
  var handle: HTMLElement
  var manualColumnWidths: js.Array[_]
  var newSize: Double | Unit
  var pressed: Core | Unit
  var selectedCols: js.Array[_]
  var startOffset: Double | Unit
  var startWidth: Double | Unit
  var startY: Double | Unit
  def checkIfColumnHeader(element: HTMLElement): Boolean
  def clearManualSize(column: Double): Unit
  def getTHFromTargetElement(element: HTMLElement): HTMLElement
  def hideHandleAndGuide(): Unit
  def loadManualColumnWidths(): Unit
  def refreshGuidePosition(): Unit
  def refreshHandlePosition(): Unit
  def saveManualColumnWidths(): Unit
  def setManualSize(column: Double, width: Double): Double
  def setupGuidePosition(): Unit
  def setupHandlePosition(TH: HTMLElement): Boolean | Unit
}

object ManualColumnResize {
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    autoresizeTimeout: js.Function0[Unit] | Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    checkIfColumnHeader: HTMLElement => Boolean,
    clearHooks: () => Unit,
    clearManualSize: Double => Unit,
    currentCol: Double | Unit,
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
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isPluginsReady: Boolean,
    loadManualColumnWidths: () => Unit,
    manualColumnWidths: js.Array[_],
    newSize: Double | Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    pressed: Core | Unit,
    refreshGuidePosition: () => Unit,
    refreshHandlePosition: () => Unit,
    removeHooks: String => Unit,
    saveManualColumnWidths: () => Unit,
    selectedCols: js.Array[_],
    setManualSize: (Double, Double) => Double,
    setupGuidePosition: () => Unit,
    setupHandlePosition: HTMLElement => Boolean | Unit,
    startOffset: Double | Unit,
    startWidth: Double | Unit,
    startY: Double | Unit,
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): ManualColumnResize = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), autoresizeTimeout = autoresizeTimeout.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), checkIfColumnHeader = js.Any.fromFunction1(checkIfColumnHeader), clearHooks = js.Any.fromFunction0(clearHooks), clearManualSize = js.Any.fromFunction1(clearManualSize), currentCol = currentCol.asInstanceOf[js.Any], currentTH = currentTH.asInstanceOf[js.Any], currentWidth = currentWidth.asInstanceOf[js.Any], dblclick = dblclick, destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled, eventManager = eventManager, getTHFromTargetElement = js.Any.fromFunction1(getTHFromTargetElement), guide = guide, handle = handle, hideHandleAndGuide = js.Any.fromFunction0(hideHandleAndGuide), hot = hot, init = js.Any.fromFunction0(init), initialized = initialized, isPluginsReady = isPluginsReady, loadManualColumnWidths = js.Any.fromFunction0(loadManualColumnWidths), manualColumnWidths = manualColumnWidths, newSize = newSize.asInstanceOf[js.Any], pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, pressed = pressed.asInstanceOf[js.Any], refreshGuidePosition = js.Any.fromFunction0(refreshGuidePosition), refreshHandlePosition = js.Any.fromFunction0(refreshHandlePosition), removeHooks = js.Any.fromFunction1(removeHooks), saveManualColumnWidths = js.Any.fromFunction0(saveManualColumnWidths), selectedCols = selectedCols, setManualSize = js.Any.fromFunction2(setManualSize), setupGuidePosition = js.Any.fromFunction0(setupGuidePosition), setupHandlePosition = js.Any.fromFunction1(setupHandlePosition), startOffset = startOffset.asInstanceOf[js.Any], startWidth = startWidth.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], t = t, updatePlugin = js.Any.fromFunction0(updatePlugin))
  
    __obj.asInstanceOf[ManualColumnResize]
  }
}

