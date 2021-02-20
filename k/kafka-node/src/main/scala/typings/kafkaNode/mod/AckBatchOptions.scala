package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AckBatchOptions extends StObject {
  
  var noAckBatchAge: Double | Null = js.native
  
  var noAckBatchSize: Double | Null = js.native
}
object AckBatchOptions {
  
  @scala.inline
  def apply(): AckBatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AckBatchOptions]
  }
  
  @scala.inline
  implicit class AckBatchOptionsMutableBuilder[Self <: AckBatchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNoAckBatchAge(value: Double): Self = StObject.set(x, "noAckBatchAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoAckBatchAgeNull: Self = StObject.set(x, "noAckBatchAge", null)
    
    @scala.inline
    def setNoAckBatchSize(value: Double): Self = StObject.set(x, "noAckBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoAckBatchSizeNull: Self = StObject.set(x, "noAckBatchSize", null)
  }
}
