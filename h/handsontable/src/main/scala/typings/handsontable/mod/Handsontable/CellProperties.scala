package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rendered cell object with computed properties.
  */
@js.native
trait CellProperties extends CellMeta {
  
  var col: Double = js.native
  
  var instance: typings.handsontable.mod.Handsontable = js.native
  
  var prop: String | Double = js.native
  
  var row: Double = js.native
  
  var visualCol: Double = js.native
  
  var visualRow: Double = js.native
}
object CellProperties {
  
  @scala.inline
  def apply(
    col: Double,
    instance: typings.handsontable.mod.Handsontable,
    prop: String | Double,
    row: Double,
    visualCol: Double,
    visualRow: Double
  ): CellProperties = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], prop = prop.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], visualCol = visualCol.asInstanceOf[js.Any], visualRow = visualRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellProperties]
  }
  
  @scala.inline
  implicit class CellPropertiesMutableBuilder[Self <: CellProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstance(value: typings.handsontable.mod.Handsontable): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProp(value: String | Double): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualCol(value: Double): Self = StObject.set(x, "visualCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualRow(value: Double): Self = StObject.set(x, "visualRow", value.asInstanceOf[js.Any])
  }
}
