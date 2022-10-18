package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchOffset extends StObject {
  
  var fetchOffset: String
  
  var maxBytes: Double
  
  var partition: Double
}
object FetchOffset {
  
  inline def apply(fetchOffset: String, maxBytes: Double, partition: Double): FetchOffset = {
    val __obj = js.Dynamic.literal(fetchOffset = fetchOffset.asInstanceOf[js.Any], maxBytes = maxBytes.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchOffset]
  }
  
  extension [Self <: FetchOffset](x: Self) {
    
    inline def setFetchOffset(value: String): Self = StObject.set(x, "fetchOffset", value.asInstanceOf[js.Any])
    
    inline def setMaxBytes(value: Double): Self = StObject.set(x, "maxBytes", value.asInstanceOf[js.Any])
    
    inline def setPartition(value: Double): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
  }
}
