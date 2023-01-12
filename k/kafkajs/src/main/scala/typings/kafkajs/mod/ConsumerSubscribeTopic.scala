package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerSubscribeTopic extends StObject {
  
  var fromBeginning: js.UndefOr[Boolean] = js.undefined
  
  var topic: String | js.RegExp
}
object ConsumerSubscribeTopic {
  
  inline def apply(topic: String | js.RegExp): ConsumerSubscribeTopic = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerSubscribeTopic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConsumerSubscribeTopic] (val x: Self) extends AnyVal {
    
    inline def setFromBeginning(value: Boolean): Self = StObject.set(x, "fromBeginning", value.asInstanceOf[js.Any])
    
    inline def setFromBeginningUndefined: Self = StObject.set(x, "fromBeginning", js.undefined)
    
    inline def setTopic(value: String | js.RegExp): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
