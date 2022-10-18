package typings.kafkajs.anon

import typings.kafkajs.mod.ITopicMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var topics: js.Array[ITopicMetadata]
}
object `0` {
  
  inline def apply(topics: js.Array[ITopicMetadata]): `0` = {
    val __obj = js.Dynamic.literal(topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setTopics(value: js.Array[ITopicMetadata]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsVarargs(value: ITopicMetadata*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
