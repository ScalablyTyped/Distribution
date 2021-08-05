package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AckBatchOptions extends StObject {
  
  var noAckBatchAge: Double | Null
  
  var noAckBatchSize: Double | Null
}
object AckBatchOptions {
  
  inline def apply(): AckBatchOptions = {
    val __obj = js.Dynamic.literal(noAckBatchAge = null, noAckBatchSize = null)
    __obj.asInstanceOf[AckBatchOptions]
  }
  
  extension [Self <: AckBatchOptions](x: Self) {
    
    inline def setNoAckBatchAge(value: Double): Self = StObject.set(x, "noAckBatchAge", value.asInstanceOf[js.Any])
    
    inline def setNoAckBatchAgeNull: Self = StObject.set(x, "noAckBatchAge", null)
    
    inline def setNoAckBatchSize(value: Double): Self = StObject.set(x, "noAckBatchSize", value.asInstanceOf[js.Any])
    
    inline def setNoAckBatchSizeNull: Self = StObject.set(x, "noAckBatchSize", null)
  }
}
