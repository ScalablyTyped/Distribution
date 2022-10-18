package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.pluginsBaseMod.BasePlugin
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsManualColumnResizeManualColumnResizeMod {
  
  @JSImport("handsontable/plugins/manualColumnResize/manualColumnResize", "ManualColumnResize")
  @js.native
  open class ManualColumnResize protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    var autoresizeTimeout: js.UndefOr[js.Function0[Unit]] = js.native
    
    def clearManualSize(column: Double): Unit = js.native
    
    var currentCol: js.UndefOr[Double] = js.native
    
    var currentTH: js.UndefOr[HTMLElement] = js.native
    
    var currentWidth: Double = js.native
    
    var dblclick: Double = js.native
    
    var eventManager: typings.handsontable.eventManagerMod.default = js.native
    
    var guide: HTMLElement = js.native
    
    var handle: HTMLElement = js.native
    
    def isEnabled(): Boolean = js.native
    
    def loadManualColumnWidths(): js.Array[Double | Null] = js.native
    
    var newSize: js.UndefOr[Double] = js.native
    
    var pressed: Boolean = js.native
    
    def saveManualColumnWidths(): Unit = js.native
    
    var selectedCols: js.Array[Double] = js.native
    
    def setManualSize(column: Double, width: Double): Double = js.native
    
    var startOffset: Double = js.native
    
    var startWidth: Double = js.native
    
    var startX: js.UndefOr[Double] = js.native
  }
  
  type Settings = Boolean | js.Array[Double]
}
