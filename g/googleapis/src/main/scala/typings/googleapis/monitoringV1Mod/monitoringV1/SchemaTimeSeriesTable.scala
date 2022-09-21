package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTimeSeriesTable extends StObject {
  
  /**
    * Required. The data displayed in this table.
    */
  var dataSets: js.UndefOr[js.Array[SchemaTableDataSet]] = js.undefined
}
object SchemaTimeSeriesTable {
  
  inline def apply(): SchemaTimeSeriesTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeSeriesTable]
  }
  
  extension [Self <: SchemaTimeSeriesTable](x: Self) {
    
    inline def setDataSets(value: js.Array[SchemaTableDataSet]): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
    
    inline def setDataSetsUndefined: Self = StObject.set(x, "dataSets", js.undefined)
    
    inline def setDataSetsVarargs(value: SchemaTableDataSet*): Self = StObject.set(x, "dataSets", js.Array(value*))
  }
}
