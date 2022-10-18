package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsTrimRowsTrimRowsMod {
  
  @JSImport("handsontable/plugins/trimRows/trimRows", "TrimRows")
  @js.native
  open class TrimRows protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def getTrimmedRows(): js.Array[Double] = js.native
    
    def isEnabled(): Boolean = js.native
    
    def isTrimmed(physicalRow: Double): Boolean = js.native
    
    def isValidConfig(trimmedRows: js.Array[Double]): Boolean = js.native
    
    def trimRow(row: Double*): Unit = js.native
    
    def trimRows(rows: js.Array[Double]): Unit = js.native
    
    def untrimAll(): Unit = js.native
    
    def untrimRow(row: Double*): Unit = js.native
    
    def untrimRows(rows: js.Array[Double]): Unit = js.native
  }
  
  type Settings = Boolean | js.Array[Double]
}
