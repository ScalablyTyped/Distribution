package typings.handsontable

import typings.handsontable.anon.End
import typings.handsontable.coreMod.default
import typings.handsontable.pluginsBaseMod.BasePlugin
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsMultipleSelectionHandlesMultipleSelectionHandlesMod {
  
  @JSImport("handsontable/plugins/multipleSelectionHandles/multipleSelectionHandles", "MultipleSelectionHandles")
  @js.native
  open class MultipleSelectionHandles protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    var dragged: js.Array[String] = js.native
    
    var eventManager: typings.handsontable.eventManagerMod.default = js.native
    
    def getCurrentRangeCoords(
      selectedRange: typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default,
      currentTouch: typings.handsontable.`3rdpartyWalkontableSrcCellRangeMod`.default,
      touchStartDirection: String,
      currentDirection: String,
      draggedHandle: String
    ): End = js.native
    
    def isDragged(): Boolean = js.native
    
    def isEnabled(): Boolean = js.native
    
    var lastSetCell: js.UndefOr[HTMLElement] = js.native
  }
  
  type Settings = Boolean
}
