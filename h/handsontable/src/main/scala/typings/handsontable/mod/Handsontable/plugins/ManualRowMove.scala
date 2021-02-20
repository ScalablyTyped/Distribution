package typings.handsontable.mod.Handsontable.plugins

import typings.handsontable.mod.Handsontable.plugins.moveUI.BacklightUI
import typings.handsontable.mod.Handsontable.plugins.moveUI.GuidelineUI
import typings.handsontable.mod._Handsontable.Core
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManualRowMove extends Base {
  
  var backlight: BacklightUI = js.native
  
  def dragRow(row: Double, dropIndex: Double): Boolean = js.native
  
  def dragRows(rows: js.Array[Double], dropIndex: Double): Boolean = js.native
  
  var eventManager: EventManager = js.native
  
  var guideline: GuidelineUI = js.native
  
  def isMovePossible(rows: js.Array[Double], finalIndex: Double): Boolean = js.native
  
  def moveRow(row: Double, finalIndex: Double): Boolean = js.native
  
  def moveRows(rows: js.Array[Double], finalIndex: Double): Boolean = js.native
}
object ManualRowMove {
  
  @scala.inline
  def apply(
    addHook: (String, js.Function1[/* repeated */ js.Any, _]) => Unit,
    backlight: BacklightUI,
    callOnPluginsReady: js.Function0[Unit] => Unit,
    clearHooks: () => Unit,
    destroy: () => Unit,
    disablePlugin: () => Unit,
    dragRow: (Double, Double) => Boolean,
    dragRows: (js.Array[Double], Double) => Boolean,
    enablePlugin: () => Unit,
    enabled: Boolean,
    eventManager: EventManager,
    guideline: GuidelineUI,
    hot: Core,
    init: () => Unit,
    initialized: Boolean,
    isMovePossible: (js.Array[Double], Double) => Boolean,
    isPluginsReady: Boolean,
    moveRow: (Double, Double) => Boolean,
    moveRows: (js.Array[Double], Double) => Boolean,
    pluginName: String,
    pluginsInitializedCallback: js.Array[_],
    removeHooks: String => Unit,
    updatePlugin: () => Unit
  ): ManualRowMove = {
    val __obj = js.Dynamic.literal(addHook = js.Any.fromFunction2(addHook), backlight = backlight.asInstanceOf[js.Any], callOnPluginsReady = js.Any.fromFunction1(callOnPluginsReady), clearHooks = js.Any.fromFunction0(clearHooks), destroy = js.Any.fromFunction0(destroy), disablePlugin = js.Any.fromFunction0(disablePlugin), dragRow = js.Any.fromFunction2(dragRow), dragRows = js.Any.fromFunction2(dragRows), enablePlugin = js.Any.fromFunction0(enablePlugin), enabled = enabled.asInstanceOf[js.Any], eventManager = eventManager.asInstanceOf[js.Any], guideline = guideline.asInstanceOf[js.Any], hot = hot.asInstanceOf[js.Any], init = js.Any.fromFunction0(init), initialized = initialized.asInstanceOf[js.Any], isMovePossible = js.Any.fromFunction2(isMovePossible), isPluginsReady = isPluginsReady.asInstanceOf[js.Any], moveRow = js.Any.fromFunction2(moveRow), moveRows = js.Any.fromFunction2(moveRows), pluginName = pluginName.asInstanceOf[js.Any], pluginsInitializedCallback = pluginsInitializedCallback.asInstanceOf[js.Any], removeHooks = js.Any.fromFunction1(removeHooks), updatePlugin = js.Any.fromFunction0(updatePlugin))
    __obj.asInstanceOf[ManualRowMove]
  }
  
  @scala.inline
  implicit class ManualRowMoveMutableBuilder[Self <: ManualRowMove] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBacklight(value: BacklightUI): Self = StObject.set(x, "backlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragRow(value: (Double, Double) => Boolean): Self = StObject.set(x, "dragRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDragRows(value: (js.Array[Double], Double) => Boolean): Self = StObject.set(x, "dragRows", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEventManager(value: EventManager): Self = StObject.set(x, "eventManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuideline(value: GuidelineUI): Self = StObject.set(x, "guideline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMovePossible(value: (js.Array[Double], Double) => Boolean): Self = StObject.set(x, "isMovePossible", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMoveRow(value: (Double, Double) => Boolean): Self = StObject.set(x, "moveRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMoveRows(value: (js.Array[Double], Double) => Boolean): Self = StObject.set(x, "moveRows", js.Any.fromFunction2(value))
  }
}
