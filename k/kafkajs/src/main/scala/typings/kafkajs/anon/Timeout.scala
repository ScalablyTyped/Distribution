package typings.kafkajs.anon

import typings.kafkajs.mod.ITopicConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timeout extends StObject {
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var topics: js.Array[ITopicConfig]
  
  var validateOnly: js.UndefOr[Boolean] = js.undefined
  
  var waitForLeaders: js.UndefOr[Boolean] = js.undefined
}
object Timeout {
  
  inline def apply(topics: js.Array[ITopicConfig]): Timeout = {
    val __obj = js.Dynamic.literal(topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timeout]
  }
  
  extension [Self <: Timeout](x: Self) {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setTopics(value: js.Array[ITopicConfig]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsVarargs(value: ITopicConfig*): Self = StObject.set(x, "topics", js.Array(value*))
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
    
    inline def setWaitForLeaders(value: Boolean): Self = StObject.set(x, "waitForLeaders", value.asInstanceOf[js.Any])
    
    inline def setWaitForLeadersUndefined: Self = StObject.set(x, "waitForLeaders", js.undefined)
  }
}
