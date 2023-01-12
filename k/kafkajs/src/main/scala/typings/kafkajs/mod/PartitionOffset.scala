package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartitionOffset extends StObject {
  
  var offset: String
  
  var partition: Double
}
object PartitionOffset {
  
  inline def apply(offset: String, partition: Double): PartitionOffset = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionOffset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartitionOffset] (val x: Self) extends AnyVal {
    
    inline def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
  }
}
