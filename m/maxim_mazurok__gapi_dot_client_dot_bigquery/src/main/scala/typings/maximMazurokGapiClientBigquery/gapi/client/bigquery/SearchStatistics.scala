package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchStatistics extends StObject {
  
  /**
    * When index_usage_mode is UNUSED or PARTIALLY_USED, this field explains why index was not used in all or part of the search query. If index_usage_mode is FULLLY_USED, this field is
    * not populated.
    */
  var indexUnusedReason: js.UndefOr[js.Array[IndexUnusedReason]] = js.undefined
  
  /** Specifies index usage mode for the query. */
  var indexUsageMode: js.UndefOr[String] = js.undefined
}
object SearchStatistics {
  
  inline def apply(): SearchStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchStatistics] (val x: Self) extends AnyVal {
    
    inline def setIndexUnusedReason(value: js.Array[IndexUnusedReason]): Self = StObject.set(x, "indexUnusedReason", value.asInstanceOf[js.Any])
    
    inline def setIndexUnusedReasonUndefined: Self = StObject.set(x, "indexUnusedReason", js.undefined)
    
    inline def setIndexUnusedReasonVarargs(value: IndexUnusedReason*): Self = StObject.set(x, "indexUnusedReason", js.Array(value*))
    
    inline def setIndexUsageMode(value: String): Self = StObject.set(x, "indexUsageMode", value.asInstanceOf[js.Any])
    
    inline def setIndexUsageModeUndefined: Self = StObject.set(x, "indexUsageMode", js.undefined)
  }
}
