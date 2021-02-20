package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod.Handsontable.wot.CellCoords
import typings.handsontable.mod.Handsontable.wot.CellRange
import typings.handsontable.mod._Handsontable.Core
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultipleSelectionHandles extends Base {
  
  var dragged: js.Array[_] = js.native
  
  var eventManager: EventManager = js.native
  
  def getCurrentRangeCoords(
    selectedRange: CellRange,
    currentTouch: CellCoords,
    touchStartDirection: String,
    currentDirection: String,
    draggedHandle: String
  ): js.Object = js.native
  
  def isDragged(): Boolean = js.native
  
  var lastSetCell: HTMLElement | Unit = js.native
}
object MultipleSelectionHandles {
  
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    dragged: js.Array[_],
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: EventManager,
    getCurrentRangeCoords: (CellRange, CellCoords, String, String, String) => js.Object,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isDragged: () => Boolean,
    isPluginsReady: Boolean,
    lastSetCell: HTMLElement | Unit,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    updatePlugin: () => Unit
  ): MultipleSelectionHandles = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), dragged = dragged.asInstanceOf[js.Any], enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], getCurrentRangeCoords = js.Any.fromFunction5(getCurrentRangeCoords), hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isDragged = js.Any.fromFunction0(isDragged), isPluginsReady = isPluginsReady.asInstanceOf[js.Any], lastSetCell = lastSetCell.asInstanceOf[js.Any], pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[MultipleSelectionHandles]
  }
  
  @scala.inline
  implicit class MultipleSelectionHandlesMutableBuilder[Self <: MultipleSelectionHandles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDragged(value: js.Array[_]): Self = StObject.set(x, "dragged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggedVarargs(value: js.Any*): Self = StObject.set(x, "dragged", js.Array(value :_*))
    
    @scala.inline
    def setEventManager(value: EventManager): Self = StObject.set(x, "eventManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCurrentRangeCoords(value: (CellRange, CellCoords, String, String, String) => js.Object): Self = StObject.set(x, "getCurrentRangeCoords", js.Any.fromFunction5(value))
    
    @scala.inline
    def setIsDragged(value: () => Boolean): Self = StObject.set(x, "isDragged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLastSetCell(value: HTMLElement | Unit): Self = StObject.set(x, "lastSetCell", value.asInstanceOf[js.Any])
  }
}
