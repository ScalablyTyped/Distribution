package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsumerGroupStreamOptions extends ConsumerGroupOptions {
  
  var highWaterMark: js.UndefOr[Double] = js.native
}
object ConsumerGroupStreamOptions {
  
  @scala.inline
  def apply(groupId: String): ConsumerGroupStreamOptions = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerGroupStreamOptions]
  }
  
  @scala.inline
  implicit class ConsumerGroupStreamOptionsMutableBuilder[Self <: ConsumerGroupStreamOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
  }
}
