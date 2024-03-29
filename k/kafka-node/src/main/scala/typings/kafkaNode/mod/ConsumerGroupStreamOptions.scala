package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerGroupStreamOptions
  extends StObject
     with ConsumerGroupOptions {
  
  var highWaterMark: js.UndefOr[Double] = js.undefined
}
object ConsumerGroupStreamOptions {
  
  inline def apply(groupId: String): ConsumerGroupStreamOptions = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerGroupStreamOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsumerGroupStreamOptions] (val x: Self) extends AnyVal {
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
  }
}
