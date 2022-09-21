package typings.indySdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WalletRecordSearch extends StObject {
  
  var records: js.Array[WalletRecord] | Null
  
  var totalCount: String | Null
}
object WalletRecordSearch {
  
  inline def apply(): WalletRecordSearch = {
    val __obj = js.Dynamic.literal(records = null, totalCount = null)
    __obj.asInstanceOf[WalletRecordSearch]
  }
  
  extension [Self <: WalletRecordSearch](x: Self) {
    
    inline def setRecords(value: js.Array[WalletRecord]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    inline def setRecordsNull: Self = StObject.set(x, "records", null)
    
    inline def setRecordsVarargs(value: WalletRecord*): Self = StObject.set(x, "records", js.Array(value*))
    
    inline def setTotalCount(value: String): Self = StObject.set(x, "totalCount", value.asInstanceOf[js.Any])
    
    inline def setTotalCountNull: Self = StObject.set(x, "totalCount", null)
  }
}
