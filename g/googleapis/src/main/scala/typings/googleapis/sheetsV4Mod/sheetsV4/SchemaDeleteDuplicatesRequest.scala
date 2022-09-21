package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeleteDuplicatesRequest extends StObject {
  
  /**
    * The columns in the range to analyze for duplicate values. If no columns are selected then all columns are analyzed for duplicates.
    */
  var comparisonColumns: js.UndefOr[js.Array[SchemaDimensionRange]] = js.undefined
  
  /**
    * The range to remove duplicates rows from.
    */
  var range: js.UndefOr[SchemaGridRange] = js.undefined
}
object SchemaDeleteDuplicatesRequest {
  
  inline def apply(): SchemaDeleteDuplicatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteDuplicatesRequest]
  }
  
  extension [Self <: SchemaDeleteDuplicatesRequest](x: Self) {
    
    inline def setComparisonColumns(value: js.Array[SchemaDimensionRange]): Self = StObject.set(x, "comparisonColumns", value.asInstanceOf[js.Any])
    
    inline def setComparisonColumnsUndefined: Self = StObject.set(x, "comparisonColumns", js.undefined)
    
    inline def setComparisonColumnsVarargs(value: SchemaDimensionRange*): Self = StObject.set(x, "comparisonColumns", js.Array(value*))
    
    inline def setRange(value: SchemaGridRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
