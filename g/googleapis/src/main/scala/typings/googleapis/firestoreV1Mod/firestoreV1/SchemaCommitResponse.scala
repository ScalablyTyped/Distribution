package typings.googleapis.firestoreV1Mod.firestoreV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCommitResponse extends StObject {
  
  /**
    * The time at which the commit occurred. Any read with an equal or greater `read_time` is guaranteed to see the effects of the commit.
    */
  var commitTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The result of applying the writes. This i-th write result corresponds to the i-th write in the request.
    */
  var writeResults: js.UndefOr[js.Array[SchemaWriteResult]] = js.undefined
}
object SchemaCommitResponse {
  
  inline def apply(): SchemaCommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitResponse]
  }
  
  extension [Self <: SchemaCommitResponse](x: Self) {
    
    inline def setCommitTime(value: String): Self = StObject.set(x, "commitTime", value.asInstanceOf[js.Any])
    
    inline def setCommitTimeNull: Self = StObject.set(x, "commitTime", null)
    
    inline def setCommitTimeUndefined: Self = StObject.set(x, "commitTime", js.undefined)
    
    inline def setWriteResults(value: js.Array[SchemaWriteResult]): Self = StObject.set(x, "writeResults", value.asInstanceOf[js.Any])
    
    inline def setWriteResultsUndefined: Self = StObject.set(x, "writeResults", js.undefined)
    
    inline def setWriteResultsVarargs(value: SchemaWriteResult*): Self = StObject.set(x, "writeResults", js.Array(value*))
  }
}
