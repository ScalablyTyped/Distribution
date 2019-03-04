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
    addHook: js.Function2[java.lang.String, js.Function0[scala.Unit], scala.Unit],
    autoresizeTimeout: js.Function0[scala.Unit] | scala.Unit,
    callOnPluginsReady: js.Function1[js.Function0[scala.Unit], scala.Unit],
    checkIfColumnHeader: js.Function1[stdLib.HTMLElement, scala.Boolean],
    clearHooks: js.Function0[scala.Unit],
    clearManualSize: js.Function1[scala.Double, scala.Unit],
    currentCol: scala.Double | scala.Unit,
    currentTH: stdLib.HTMLElement | scala.Unit,
    currentWidth: scala.Double | scala.Unit,
    dblclick: scala.Double,
    destroy: js.Function0[scala.Unit],
    disablePlugin: js.Function0[scala.Unit],
    enablePlugin: js.Function0[scala.Unit],
    enabled: scala.Boolean,
    eventManager: EventManager,
    getTHFromTargetElement: js.Function1[stdLib.HTMLElement, stdLib.HTMLElement],
    guide: stdLib.HTMLElement,
    handle: stdLib.HTMLElement,
    hideHandleAndGuide: js.Function0[scala.Unit],
    init: js.Function0[scala.Unit],
    initialized: scala.Boolean,
    isPluginsReady: scala.Boolean,
    loadManualColumnWidths: js.Function0[scala.Unit],
    manualColumnWidths: js.Array[_],
    newSize: scala.Double | scala.Unit,
    pluginName: java.lang.String,
    pluginsInitializedCallback: js.Array[_],
    pressed: handsontableLib.handsontableMod.underscoreHandsontableNs.Core | scala.Unit,
    refreshGuidePosition: js.Function0[scala.Unit],
    refreshHandlePosition: js.Function0[scala.Unit],
    removeHook: js.Function1[java.lang.String, scala.Unit],
    saveManualColumnWidths: js.Function0[scala.Unit],
    selectedCols: js.Array[_],
    setManualSize: js.Function2[scala.Double, scala.Double, scala.Double],
    setupGuidePosition: js.Function0[scala.Unit],
    setupHandlePosition: js.Function1[stdLib.HTMLElement, scala.Boolean | scala.Unit],
    startOffset: scala.Double | scala.Unit,
    startWidth: scala.Double | scala.Unit,
    startY: scala.Double | scala.Unit
  ): ManualColumnResize = {
    val __obj = js.Dynamic.literal(addHook = addHook, autoresizeTimeout = autoresizeTimeout.asInstanceOf[js.Any], callOnPluginsReady = callOnPluginsReady, checkIfColumnHeader = checkIfColumnHeader, clearHooks = clearHooks, clearManualSize = clearManualSize, currentCol = currentCol.asInstanceOf[js.Any], currentTH = currentTH.asInstanceOf[js.Any], currentWidth = currentWidth.asInstanceOf[js.Any], dblclick = dblclick, destroy = destroy, disablePlugin = disablePlugin, enablePlugin = enablePlugin, enabled = enabled, eventManager = eventManager, getTHFromTargetElement = getTHFromTargetElement, guide = guide, handle = handle, hideHandleAndGuide = hideHandleAndGuide, init = init, initialized = initialized, isPluginsReady = isPluginsReady, loadManualColumnWidths = loadManualColumnWidths, manualColumnWidths = manualColumnWidths, newSize = newSize.asInstanceOf[js.Any], pluginName = pluginName, pluginsInitializedCallback = pluginsInitializedCallback, pressed = pressed.asInstanceOf[js.Any], refreshGuidePosition = refreshGuidePosition, refreshHandlePosition = refreshHandlePosition, removeHook = removeHook, saveManualColumnWidths = saveManualColumnWidths, selectedCols = selectedCols, setManualSize = setManualSize, setupGuidePosition = setupGuidePosition, setupHandlePosition = setupHandlePosition, startOffset = startOffset.asInstanceOf[js.Any], startWidth = startWidth.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ManualColumnResize]
  }
}

