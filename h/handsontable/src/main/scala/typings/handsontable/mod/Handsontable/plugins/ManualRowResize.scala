package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod._Handsontable.Core
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManualRowResize extends Base {
  var autoresizeTimeout: js.Function0[Unit] | Unit = js.native
  var currentRow: Double | Unit = js.native
  var currentTH: HTMLElement | Unit = js.native
  var currentWidth: Double | Unit = js.native
  var dblclick: Double = js.native
  var eventManager: EventManager = js.native
  var guide: HTMLElement = js.native
  var handle: HTMLElement = js.native
  var manualRowHeights: js.Array[_] = js.native
  var newSize: Double | Unit = js.native
  var pressed: Core | Unit = js.native
  var selectedRows: js.Array[_] = js.native
  var startOffset: Double | Unit = js.native
  var startWidth: Double | Unit = js.native
  var startY: Double | Unit = js.native
  def checkIfRowHeader(element: HTMLElement): Boolean = js.native
  def clearManualSize(column: Double): Unit = js.native
  def getTHFromTargetElement(element: HTMLElement): HTMLElement = js.native
  def hideHandleAndGuide(): Unit = js.native
  def loadManualRowHeights(): Unit = js.native
  def refreshGuidePosition(): Unit = js.native
  def refreshHandlePosition(): Unit = js.native
  def saveManualRowHeights(): Unit = js.native
  def setManualSize(column: Double, width: Double): Double = js.native
  def setupGuidePosition(): Unit = js.native
  def setupHandlePosition(TH: HTMLElement): Boolean | Unit = js.native
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
    eventManager: EventManager,
    getTHFromTargetElement: HTMLElement => HTMLElement,
    guide: HTMLElement,
    handle: HTMLElement,
    hideHandleAndGuide: () => Unit,
    hot: Core,
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
    startY: Double | Unit,
    t: RecordTranslator,
    updatePlugin: () => Unit
  ): ManualRowResize = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), autoresizeTimeout = autoresizeTimeout.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), checkIfRowHeader = js.Any.fromFunction1(checkIfRowHeader), clearHooks = js.Any.fromFunction0(clearHooks), clearManualSize = js.Any.fromFunction1(clearManualSize), currentRow = currentRow.asInstanceOf[js.Any], currentTH = currentTH.asInstanceOf[js.Any], currentWidth = currentWidth.asInstanceOf[js.Any], dblclick = dblclick.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], getTHFromTargetElement = js.Any.fromFunction1(getTHFromTargetElement), guide = guide.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], hideHandleAndGuide = js.Any.fromFunction0(hideHandleAndGuide), hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isPluginsReady = isPluginsReady.asInstanceOf[js.Any], loadManualRowHeights = js.Any.fromFunction0(loadManualRowHeights), manualRowHeights = manualRowHeights.asInstanceOf[js.Any], newSize = newSize.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any], refreshGuidePosition = js.Any.fromFunction0(refreshGuidePosition), refreshHandlePosition = js.Any.fromFunction0(refreshHandlePosition), removeHooks = js.Any.fromFunction1(removeHooks), saveManualRowHeights = js.Any.fromFunction0(saveManualRowHeights), selectedRows = selectedRows.asInstanceOf[js.Any], setManualSize = js.Any.fromFunction2(setManualSize), setupGuidePosition = js.Any.fromFunction0(setupGuidePosition), setupHandlePosition = js.Any.fromFunction1(setupHandlePosition), startOffset = startOffset.asInstanceOf[js.Any], startWidth = startWidth.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[ManualRowResize]
  }
  @scala.inline
  implicit class ManualRowResizeOps[Self <: ManualRowResize] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoresizeTimeoutFunction0(value: () => Unit): Self = this.set("autoresizeTimeout", js.Any.fromFunction0(value))
    @scala.inline
    def setAutoresizeTimeout(value: js.Function0[Unit] | Unit): Self = this.set("autoresizeTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def setCheckIfRowHeader(value: HTMLElement => Boolean): Self = this.set("checkIfRowHeader", js.Any.fromFunction1(value))
    @scala.inline
    def setClearManualSize(value: Double => Unit): Self = this.set("clearManualSize", js.Any.fromFunction1(value))
    @scala.inline
    def setCurrentRow(value: Double | Unit): Self = this.set("currentRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentTH(value: HTMLElement | Unit): Self = this.set("currentTH", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentWidth(value: Double | Unit): Self = this.set("currentWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setDblclick(value: Double): Self = this.set("dblclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventManager(value: EventManager): Self = this.set("eventManager", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetTHFromTargetElement(value: HTMLElement => HTMLElement): Self = this.set("getTHFromTargetElement", js.Any.fromFunction1(value))
    @scala.inline
    def setGuide(value: HTMLElement): Self = this.set("guide", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandle(value: HTMLElement): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def setHideHandleAndGuide(value: () => Unit): Self = this.set("hideHandleAndGuide", js.Any.fromFunction0(value))
    @scala.inline
    def setLoadManualRowHeights(value: () => Unit): Self = this.set("loadManualRowHeights", js.Any.fromFunction0(value))
    @scala.inline
    def setManualRowHeightsVarargs(value: js.Any*): Self = this.set("manualRowHeights", js.Array(value :_*))
    @scala.inline
    def setManualRowHeights(value: js.Array[_]): Self = this.set("manualRowHeights", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewSize(value: Double | Unit): Self = this.set("newSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setPressed(value: Core | Unit): Self = this.set("pressed", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefreshGuidePosition(value: () => Unit): Self = this.set("refreshGuidePosition", js.Any.fromFunction0(value))
    @scala.inline
    def setRefreshHandlePosition(value: () => Unit): Self = this.set("refreshHandlePosition", js.Any.fromFunction0(value))
    @scala.inline
    def setSaveManualRowHeights(value: () => Unit): Self = this.set("saveManualRowHeights", js.Any.fromFunction0(value))
    @scala.inline
    def setSelectedRowsVarargs(value: js.Any*): Self = this.set("selectedRows", js.Array(value :_*))
    @scala.inline
    def setSelectedRows(value: js.Array[_]): Self = this.set("selectedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetManualSize(value: (Double, Double) => Double): Self = this.set("setManualSize", js.Any.fromFunction2(value))
    @scala.inline
    def setSetupGuidePosition(value: () => Unit): Self = this.set("setupGuidePosition", js.Any.fromFunction0(value))
    @scala.inline
    def setSetupHandlePosition(value: HTMLElement => Boolean | Unit): Self = this.set("setupHandlePosition", js.Any.fromFunction1(value))
    @scala.inline
    def setStartOffset(value: Double | Unit): Self = this.set("startOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartWidth(value: Double | Unit): Self = this.set("startWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartY(value: Double | Unit): Self = this.set("startY", value.asInstanceOf[js.Any])
  }
  
}

