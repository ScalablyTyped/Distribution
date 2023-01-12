package typings.kafkajs.anon

import typings.kafkajs.mod.GroupMember
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Members extends StObject {
  
  var members: js.Array[GroupMember]
  
  var topics: js.Array[String]
}
object Members {
  
  inline def apply(members: js.Array[GroupMember], topics: js.Array[String]): Members = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[Members]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Members] (val x: Self) extends AnyVal {
    
    inline def setMembers(value: js.Array[GroupMember]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
    
    inline def setMembersVarargs(value: GroupMember*): Self = StObject.set(x, "members", js.Array(value*))
    
    inline def setTopics(value: js.Array[String]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    inline def setTopicsVarargs(value: String*): Self = StObject.set(x, "topics", js.Array(value*))
  }
}
