package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information returned for each partition returned in a PartitionResponse.
  */
trait SchemaPartition extends StObject {
  
  /**
    * This token can be passed to Read, StreamingRead, ExecuteSql, or
    * ExecuteStreamingSql requests to restrict the results to those identified
    * by this partition token.
    */
  var partitionToken: js.UndefOr[String] = js.undefined
}
object SchemaPartition {
  
  inline def apply(): SchemaPartition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPartition]
  }
  
  extension [Self <: SchemaPartition](x: Self) {
    
    inline def setPartitionToken(value: String): Self = StObject.set(x, "partitionToken", value.asInstanceOf[js.Any])
    
    inline def setPartitionTokenUndefined: Self = StObject.set(x, "partitionToken", js.undefined)
  }
}
