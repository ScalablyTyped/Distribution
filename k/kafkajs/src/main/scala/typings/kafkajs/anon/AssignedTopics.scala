package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignedTopics extends StObject {
  
  var assignedTopics: js.Array[String]
  
  var generationId: Double
  
  var groupId: String
  
  var memberId: String
  
  var topicsNotSubscribed: js.Array[String]
  
  var topicsSubscribed: js.Array[String]
}
object AssignedTopics {
  
  inline def apply(
    assignedTopics: js.Array[String],
    generationId: Double,
    groupId: String,
    memberId: String,
    topicsNotSubscribed: js.Array[String],
    topicsSubscribed: js.Array[String]
  ): AssignedTopics = {
    val __obj = js.Dynamic.literal(assignedTopics = assignedTopics.asInstanceOf[js.Any], generationId = generationId.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], memberId = memberId.asInstanceOf[js.Any], topicsNotSubscribed = topicsNotSubscribed.asInstanceOf[js.Any], topicsSubscribed = topicsSubscribed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignedTopics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssignedTopics] (val x: Self) extends AnyVal {
    
    inline def setAssignedTopics(value: js.Array[String]): Self = StObject.set(x, "assignedTopics", value.asInstanceOf[js.Any])
    
    inline def setAssignedTopicsVarargs(value: String*): Self = StObject.set(x, "assignedTopics", js.Array(value*))
    
    inline def setGenerationId(value: Double): Self = StObject.set(x, "generationId", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setMemberId(value: String): Self = StObject.set(x, "memberId", value.asInstanceOf[js.Any])
    
    inline def setTopicsNotSubscribed(value: js.Array[String]): Self = StObject.set(x, "topicsNotSubscribed", value.asInstanceOf[js.Any])
    
    inline def setTopicsNotSubscribedVarargs(value: String*): Self = StObject.set(x, "topicsNotSubscribed", js.Array(value*))
    
    inline def setTopicsSubscribed(value: js.Array[String]): Self = StObject.set(x, "topicsSubscribed", value.asInstanceOf[js.Any])
    
    inline def setTopicsSubscribedVarargs(value: String*): Self = StObject.set(x, "topicsSubscribed", js.Array(value*))
  }
}
