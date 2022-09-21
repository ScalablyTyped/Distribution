package typings.googleapis.loggingV2Mod.loggingV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLogSplit extends StObject {
  
  /**
    * The index of this LogEntry in the sequence of split log entries. Log entries are given |index| values 0, 1, ..., n-1 for a sequence of n log entries.
    */
  var index: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The total number of log entries that the original LogEntry was split into.
    */
  var totalSplits: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * A globally unique identifier for all log entries in a sequence of split log entries. All log entries with the same |LogSplit.uid| are assumed to be part of the same sequence of split log entries.
    */
  var uid: js.UndefOr[String | Null] = js.undefined
}
object SchemaLogSplit {
  
  inline def apply(): SchemaLogSplit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLogSplit]
  }
  
  extension [Self <: SchemaLogSplit](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setTotalSplits(value: Double): Self = StObject.set(x, "totalSplits", value.asInstanceOf[js.Any])
    
    inline def setTotalSplitsNull: Self = StObject.set(x, "totalSplits", null)
    
    inline def setTotalSplitsUndefined: Self = StObject.set(x, "totalSplits", js.undefined)
    
    inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidNull: Self = StObject.set(x, "uid", null)
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
