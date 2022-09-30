package typings.griddleReact.mod.components

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableHeadingProps extends StObject {
  
  var TableHeadingCell: Any
  
  var columnIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  var columnTitles: js.UndefOr[js.Array[String]] = js.undefined
}
object TableHeadingProps {
  
  inline def apply(TableHeadingCell: Any): TableHeadingProps = {
    val __obj = js.Dynamic.literal(TableHeadingCell = TableHeadingCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeadingProps]
  }
  
  extension [Self <: TableHeadingProps](x: Self) {
    
    inline def setColumnIds(value: js.Array[Double]): Self = StObject.set(x, "columnIds", value.asInstanceOf[js.Any])
    
    inline def setColumnIdsUndefined: Self = StObject.set(x, "columnIds", js.undefined)
    
    inline def setColumnIdsVarargs(value: Double*): Self = StObject.set(x, "columnIds", js.Array(value*))
    
    inline def setColumnTitles(value: js.Array[String]): Self = StObject.set(x, "columnTitles", value.asInstanceOf[js.Any])
    
    inline def setColumnTitlesUndefined: Self = StObject.set(x, "columnTitles", js.undefined)
    
    inline def setColumnTitlesVarargs(value: String*): Self = StObject.set(x, "columnTitles", js.Array(value*))
    
    inline def setTableHeadingCell(value: Any): Self = StObject.set(x, "TableHeadingCell", value.asInstanceOf[js.Any])
  }
}
