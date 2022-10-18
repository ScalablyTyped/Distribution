package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConsumerSubscribeTopics extends StObject {
  
  var fromBeginning: js.UndefOr[Boolean] = js.undefined
  
  var topics: js.Array[String | js.RegExp]
}
object ConsumerSubscribeTopics {
  
  inline def apply(topics: js.Array[String | js.RegExp]): ConsumerSubscribeTopics = {
    val __obj = js.Dynamic.literal(topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsumerSubscribeTopics]
  }
  
  extension [Self <: ConsumerSubscribeTopics](x: Self) {
    
    inline def setFromBeginning(value: Boolean): Self = StObject.set(x, "fromBeginning", value.asInstanceOf[js.Any])
    
    inline def setFromBeginningUndefined: Self = StObject.set(x, "fromBeginning", js.undefined)
    
    inline def setTopics(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
