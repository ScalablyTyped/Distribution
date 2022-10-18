package typings.handsontable

import typings.handsontable.commonMod.SimpleCellCoords
import typings.handsontable.coreMod.default
import typings.handsontable.handsontableStrings.collapse
import typings.handsontable.handsontableStrings.expand
import typings.handsontable.pluginsBaseMod.BasePlugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsCollapsibleColumnsCollapsibleColumnsMod {
  
  @JSImport("handsontable/plugins/collapsibleColumns/collapsibleColumns", "CollapsibleColumns")
  @js.native
  open class CollapsibleColumns protected () extends BasePlugin {
    def this(hotInstance: default) = this()
    
    def collapseAll(): Unit = js.native
    
    def collapseSection(coords: SimpleCellCoords): Unit = js.native
    
    def expandAll(): Unit = js.native
    
    def expandSection(coords: SimpleCellCoords): Unit = js.native
    
    def isEnabled(): Boolean = js.native
    
    def toggleAllCollapsibleSections(action: collapse | expand): Unit = js.native
    
    def toggleCollapsibleSection(coords: js.Array[SimpleCellCoords]): Unit = js.native
    def toggleCollapsibleSection(coords: js.Array[SimpleCellCoords], action: collapse | expand): Unit = js.native
  }
  
  trait DetailedSettings extends StObject {
    
    var col: Double
    
    var collapsible: Boolean
    
    var row: Double
  }
  object DetailedSettings {
    
    inline def apply(col: Double, collapsible: Boolean, row: Double): DetailedSettings = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], collapsible = collapsible.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetailedSettings]
    }
    
    extension [Self <: DetailedSettings](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    }
  }
  
  type Settings = Boolean | js.Array[DetailedSettings]
}
