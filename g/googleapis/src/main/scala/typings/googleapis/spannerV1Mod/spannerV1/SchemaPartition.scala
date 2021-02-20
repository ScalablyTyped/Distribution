package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information returned for each partition returned in a PartitionResponse.
  */
@js.native
trait SchemaPartition extends StObject {
  
  /**
    * This token can be passed to Read, StreamingRead, ExecuteSql, or
    * ExecuteStreamingSql requests to restrict the results to those identified
    * by this partition token.
    */
  var partitionToken: js.UndefOr[String] = js.native
}
object SchemaPartition {
  
  @scala.inline
  def apply(): SchemaPartition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartition]
  }
  
  @scala.inline
  implicit class SchemaPartitionMutableBuilder[Self <: SchemaPartition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPartitionToken(value: String): Self = StObject.set(x, "partitionToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionTokenUndefined: Self = StObject.set(x, "partitionToken", js.undefined)
  }
}
