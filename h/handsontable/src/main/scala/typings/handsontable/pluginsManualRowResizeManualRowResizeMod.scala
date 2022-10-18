package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.pluginsBaseMod.BasePlugin
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsManualRowResizeManualRowResizeMod {
  
  @JSImport("handsontable/plugins/manualRowResize/manualRowResize", "ManualRowResize")
  @js.native
  open class ManualRowResize protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    var autoresizeTimeout: js.UndefOr[js.Function0[Unit]] = js.native
    
    var currentHeight: Double = js.native
    
    var currentRow: js.UndefOr[Double] = js.native
    
    var currentTH: HTMLElement = js.native
    
    var dblclick: Double = js.native
    
    var eventManager: typings.handsontable.eventManagerMod.default = js.native
    
    var guide: HTMLElement = js.native
    
    var handle: HTMLElement = js.native
    
    def isEnabled(): Boolean = js.native
    
    def loadManualRowHeights(): js.Array[Double | Null] = js.native
    
    var newSize: js.UndefOr[Double] = js.native
    
    var pressed: Boolean = js.native
    
    def saveManualRowHeights(): Unit = js.native
    
    var selectedRows: js.Array[Double] = js.native
    
    def setManualSize(row: Double, height: Double): Double = js.native
    
    var startHeight: Double = js.native
    
    var startOffset: Double = js.native
    
    var startY: js.UndefOr[Double] = js.native
  }
  
  type Settings = Boolean | js.Array[Double]
}
