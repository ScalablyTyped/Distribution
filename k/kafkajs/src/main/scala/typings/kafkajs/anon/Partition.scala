package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Partition extends StObject {
  
  var partition: Double
}
object Partition {
  
  inline def apply(partition: Double): Partition = {
    val __obj = js.Dynamic.literal(partition = partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Partition]
  }
  
  extension [Self <: Partition](x: Self) {
    
    inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
  }
}
