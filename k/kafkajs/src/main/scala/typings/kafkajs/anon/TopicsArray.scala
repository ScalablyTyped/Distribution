package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicsArray extends StObject {
  
  var topics: js.Array[String]
}
object TopicsArray {
  
  inline def apply(topics: js.Array[String]): TopicsArray = {
    val __obj = js.Dynamic.literal(topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicsArray]
  }
  
  extension [Self <: TopicsArray](x: Self) {
    
    inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
