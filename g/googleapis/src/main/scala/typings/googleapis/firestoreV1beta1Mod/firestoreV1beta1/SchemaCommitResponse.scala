package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for Firestore.Commit.
  */
trait SchemaCommitResponse extends StObject {
  
  /**
    * The time at which the commit occurred.
    */
  var commitTime: js.UndefOr[String] = js.undefined
  
  /**
    * The result of applying the writes.  This i-th write result corresponds to
    * the i-th write in the request.
    */
  var writeResults: js.UndefOr[js.Array[SchemaWriteResult]] = js.undefined
}
object SchemaCommitResponse {
  
  @scala.inline
  def apply(): SchemaCommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitResponse]
  }
  
  @scala.inline
  implicit class SchemaCommitResponseMutableBuilder[Self <: SchemaCommitResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitTime(value: String): Self = StObject.set(x, "commitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitTimeUndefined: Self = StObject.set(x, "commitTime", js.undefined)
    
    @scala.inline
    def setWriteResults(value: js.Array[SchemaWriteResult]): Self = StObject.set(x, "writeResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteResultsUndefined: Self = StObject.set(x, "writeResults", js.undefined)
    
    @scala.inline
    def setWriteResultsVarargs(value: SchemaWriteResult*): Self = StObject.set(x, "writeResults", js.Array(value :_*))
  }
}
