package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchOffsetsPartition
  extends StObject
     with PartitionOffset {
  
  var metadata: String | Null
}
object FetchOffsetsPartition {
  
  inline def apply(offset: String, partition: Double): FetchOffsetsPartition = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], metadata = null)
    __obj.asInstanceOf[FetchOffsetsPartition]
  }
  
  extension [Self <: FetchOffsetsPartition](x: Self) {
    
    inline def setMetadata(value: String): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
  }
}
