package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contents of each border row in a table.
  */
@js.native
trait SchemaTableBorderRow extends StObject {
  
  /**
    * Properties of each border cell. When a border&#39;s adjacent table cells
    * are merged, it is not included in the response.
    */
  var tableBorderCells: js.UndefOr[js.Array[SchemaTableBorderCell]] = js.native
}
object SchemaTableBorderRow {
  
  @scala.inline
  def apply(): SchemaTableBorderRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableBorderRow]
  }
  
  @scala.inline
  implicit class SchemaTableBorderRowMutableBuilder[Self <: SchemaTableBorderRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTableBorderCells(value: js.Array[SchemaTableBorderCell]): Self = StObject.set(x, "tableBorderCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableBorderCellsUndefined: Self = StObject.set(x, "tableBorderCells", js.undefined)
    
    @scala.inline
    def setTableBorderCellsVarargs(value: SchemaTableBorderCell*): Self = StObject.set(x, "tableBorderCells", js.Array(value :_*))
  }
}
