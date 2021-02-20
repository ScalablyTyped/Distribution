package typings.griddleReact.mod.components

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableHeadingProps extends StObject {
  
  var TableHeadingCell: js.Any = js.native
  
  var columnIds: js.UndefOr[js.Array[Double]] = js.native
  
  var columnTitles: js.UndefOr[js.Array[String]] = js.native
}
object TableHeadingProps {
  
  @scala.inline
  def apply(TableHeadingCell: js.Any): TableHeadingProps = {
    val __obj = js.Dynamic.literal(TableHeadingCell = TableHeadingCell.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableHeadingProps]
  }
  
  @scala.inline
  implicit class TableHeadingPropsMutableBuilder[Self <: TableHeadingProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnIds(value: js.Array[Double]): Self = StObject.set(x, "columnIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIdsUndefined: Self = StObject.set(x, "columnIds", js.undefined)
    
    @scala.inline
    def setColumnIdsVarargs(value: Double*): Self = StObject.set(x, "columnIds", js.Array(value :_*))
    
    @scala.inline
    def setColumnTitles(value: js.Array[String]): Self = StObject.set(x, "columnTitles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnTitlesUndefined: Self = StObject.set(x, "columnTitles", js.undefined)
    
    @scala.inline
    def setColumnTitlesVarargs(value: String*): Self = StObject.set(x, "columnTitles", js.Array(value :_*))
    
    @scala.inline
    def setTableHeadingCell(value: js.Any): Self = StObject.set(x, "TableHeadingCell", value.asInstanceOf[js.Any])
  }
}
