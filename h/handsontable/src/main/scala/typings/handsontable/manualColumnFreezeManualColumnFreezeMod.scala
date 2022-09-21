package typings.handsontable

import typings.handsontable.coreMod.default
import typings.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object manualColumnFreezeManualColumnFreezeMod {
  
  @JSImport("handsontable/plugins/manualColumnFreeze/manualColumnFreeze", "ManualColumnFreeze")
  @js.native
  open class ManualColumnFreeze protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def freezeColumn(column: Double): Unit = js.native
    
    def isEnabled(): Boolean = js.native
    
    def unfreezeColumn(column: Double): Unit = js.native
  }
  
  type Settings = Boolean
}
