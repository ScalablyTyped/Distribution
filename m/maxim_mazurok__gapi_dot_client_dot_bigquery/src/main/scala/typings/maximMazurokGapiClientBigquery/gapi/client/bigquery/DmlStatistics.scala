package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DmlStatistics extends StObject {
  
  /** Number of deleted Rows. populated by DML DELETE, MERGE and TRUNCATE statements. */
  var deletedRowCount: js.UndefOr[String] = js.undefined
  
  /** Number of inserted Rows. Populated by DML INSERT and MERGE statements. */
  var insertedRowCount: js.UndefOr[String] = js.undefined
  
  /** Number of updated Rows. Populated by DML UPDATE and MERGE statements. */
  var updatedRowCount: js.UndefOr[String] = js.undefined
}
object DmlStatistics {
  
  inline def apply(): DmlStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DmlStatistics]
  }
  
  extension [Self <: DmlStatistics](x: Self) {
    
    inline def setDeletedRowCount(value: String): Self = StObject.set(x, "deletedRowCount", value.asInstanceOf[js.Any])
    
    inline def setDeletedRowCountUndefined: Self = StObject.set(x, "deletedRowCount", js.undefined)
    
    inline def setInsertedRowCount(value: String): Self = StObject.set(x, "insertedRowCount", value.asInstanceOf[js.Any])
    
    inline def setInsertedRowCountUndefined: Self = StObject.set(x, "insertedRowCount", js.undefined)
    
    inline def setUpdatedRowCount(value: String): Self = StObject.set(x, "updatedRowCount", value.asInstanceOf[js.Any])
    
    inline def setUpdatedRowCountUndefined: Self = StObject.set(x, "updatedRowCount", js.undefined)
  }
}
