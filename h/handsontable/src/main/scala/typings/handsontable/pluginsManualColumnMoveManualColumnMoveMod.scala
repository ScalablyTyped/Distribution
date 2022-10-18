package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsManualColumnMoveManualColumnMoveMod {
  
  @JSImport("handsontable/plugins/manualColumnMove/manualColumnMove", "ManualColumnMove")
  @js.native
  open class ManualColumnMove protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def dragColumn(column: Double, dropIndex: Double): Boolean = js.native
    
    def dragColumns(columns: js.Array[Double], dropIndex: Double): Boolean = js.native
    
    def isEnabled(): Boolean = js.native
    
    def isMovePossible(movedColumns: js.Array[Double], finalIndex: Double): Boolean = js.native
    
    def moveColumn(column: Double, finalIndex: Double): Boolean = js.native
    
    def moveColumns(columns: js.Array[Double], finalIndex: Double): Boolean = js.native
  }
  
  type Settings = Boolean | js.Array[Double]
}
