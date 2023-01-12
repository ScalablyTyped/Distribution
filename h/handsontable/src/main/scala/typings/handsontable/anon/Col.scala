package typings.handsontable.anon

import typings.handsontable.coreMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Col extends StObject {
  
  var col: Double
  
  var dateFormat: js.UndefOr[String] = js.undefined
  
  var instance: default
  
  var row: Double
  
  var `type`: String
  
  var visualCol: Double
  
  var visualRow: Double
}
object Col {
  
  inline def apply(col: Double, instance: default, row: Double, `type`: String, visualCol: Double, visualRow: Double): Col = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], visualCol = visualCol.asInstanceOf[js.Any], visualRow = visualRow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Col]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Col] (val x: Self) extends AnyVal {
    
    inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
    
    inline def setInstance(value: default): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisualCol(value: Double): Self = StObject.set(x, "visualCol", value.asInstanceOf[js.Any])
    
    inline def setVisualRow(value: Double): Self = StObject.set(x, "visualRow", value.asInstanceOf[js.Any])
  }
}
