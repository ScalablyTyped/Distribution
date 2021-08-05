package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data about each cell in a row.
  */
trait SchemaRowData extends StObject {
  
  /**
    * The values in the row, one per column.
    */
  var values: js.UndefOr[js.Array[SchemaCellData]] = js.undefined
}
object SchemaRowData {
  
  inline def apply(): SchemaRowData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRowData]
  }
  
  extension [Self <: SchemaRowData](x: Self) {
    
    inline def setValues(value: js.Array[SchemaCellData]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: SchemaCellData*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
