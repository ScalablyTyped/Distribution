package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for Firestore.Write.
  */
trait SchemaWriteResponse extends StObject {
  
  /**
    * The time at which the commit occurred.
    */
  var commitTime: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the stream. Only set on the first message, when a new stream
    * was created.
    */
  var streamId: js.UndefOr[String] = js.undefined
  
  /**
    * A token that represents the position of this response in the stream. This
    * can be used by a client to resume the stream at this point.  This field
    * is always set.
    */
  var streamToken: js.UndefOr[String] = js.undefined
  
  /**
    * The result of applying the writes.  This i-th write result corresponds to
    * the i-th write in the request.
    */
  var writeResults: js.UndefOr[js.Array[SchemaWriteResult]] = js.undefined
}
object SchemaWriteResponse {
  
  inline def apply(): SchemaWriteResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWriteResponse]
  }
  
  extension [Self <: SchemaWriteResponse](x: Self) {
    
    inline def setCommitTime(value: String): Self = StObject.set(x, "commitTime", value.asInstanceOf[js.Any])
    
    inline def setCommitTimeUndefined: Self = StObject.set(x, "commitTime", js.undefined)
    
    inline def setStreamId(value: String): Self = StObject.set(x, "streamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "streamId", js.undefined)
    
    inline def setStreamToken(value: String): Self = StObject.set(x, "streamToken", value.asInstanceOf[js.Any])
    
    inline def setStreamTokenUndefined: Self = StObject.set(x, "streamToken", js.undefined)
    
    inline def setWriteResults(value: js.Array[SchemaWriteResult]): Self = StObject.set(x, "writeResults", value.asInstanceOf[js.Any])
    
    inline def setWriteResultsUndefined: Self = StObject.set(x, "writeResults", js.undefined)
    
    inline def setWriteResultsVarargs(value: SchemaWriteResult*): Self = StObject.set(x, "writeResults", js.Array(value :_*))
  }
}
