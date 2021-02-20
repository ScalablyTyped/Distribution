package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data about each cell in a row.
  */
@js.native
trait SchemaRowData extends StObject {
  
  /**
    * The values in the row, one per column.
    */
  var values: js.UndefOr[js.Array[SchemaCellData]] = js.native
}
object SchemaRowData {
  
  @scala.inline
  def apply(): SchemaRowData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRowData]
  }
  
  @scala.inline
  implicit class SchemaRowDataMutableBuilder[Self <: SchemaRowData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValues(value: js.Array[SchemaCellData]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: SchemaCellData*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
