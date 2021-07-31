package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The response for Commit.
  */
trait SchemaCommitResponse extends StObject {
  
  /**
    * The Cloud Spanner timestamp at which the transaction committed.
    */
  var commitTimestamp: js.UndefOr[String] = js.undefined
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
    def setCommitTimestamp(value: String): Self = StObject.set(x, "commitTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitTimestampUndefined: Self = StObject.set(x, "commitTimestamp", js.undefined)
  }
}
