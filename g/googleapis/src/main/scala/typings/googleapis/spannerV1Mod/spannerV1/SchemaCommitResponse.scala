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
  
  inline def apply(): SchemaCommitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitResponse]
  }
  
  extension [Self <: SchemaCommitResponse](x: Self) {
    
    inline def setCommitTimestamp(value: String): Self = StObject.set(x, "commitTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCommitTimestampUndefined: Self = StObject.set(x, "commitTimestamp", js.undefined)
  }
}
