package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Earliest extends StObject {
  
  var earliest: Boolean
  
  var groupId: String
  
  var topic: String
}
object Earliest {
  
  inline def apply(earliest: Boolean, groupId: String, topic: String): Earliest = {
    val __obj = js.Dynamic.literal(earliest = earliest.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Earliest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Earliest] (val x: Self) extends AnyVal {
    
    inline def setEarliest(value: Boolean): Self = StObject.set(x, "earliest", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
