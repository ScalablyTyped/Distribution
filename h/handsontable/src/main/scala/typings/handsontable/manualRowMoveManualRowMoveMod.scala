package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object manualRowMoveManualRowMoveMod {
  
  @JSImport("handsontable/plugins/manualRowMove/manualRowMove", "ManualRowMove")
  @js.native
  open class ManualRowMove protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def dragRow(row: Double, dropIndex: Double): Boolean = js.native
    
    def dragRows(rows: js.Array[Double], dropIndex: Double): Boolean = js.native
    
    def isEnabled(): Boolean = js.native
    
    def isMovePossible(movedRows: js.Array[Double], finalIndex: Double): Boolean = js.native
    
    def moveRow(row: Double, finalIndex: Double): Boolean = js.native
    
    def moveRows(rows: js.Array[Double], finalIndex: Double): Boolean = js.native
  }
  
  type Settings = Boolean | js.Array[Double]
}
