package typings.kafkajs.mod

import typings.kafkajs.anon.Members
import typings.kafkajs.anon.TopicsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Assigner extends StObject {
  
  def assign(group: Members): js.Promise[js.Array[GroupMemberAssignment]]
  
  var name: String
  
  def protocol(subscription: TopicsArray): GroupState
  
  var version: Double
}
object Assigner {
  
  inline def apply(
    assign: Members => js.Promise[js.Array[GroupMemberAssignment]],
    name: String,
    protocol: TopicsArray => GroupState,
    version: Double
  ): Assigner = {
    val __obj = js.Dynamic.literal(assign = js.Any.fromFunction1(assign), name = name.asInstanceOf[js.Any], protocol = js.Any.fromFunction1(protocol), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assigner]
  }
  
  extension [Self <: Assigner](x: Self) {
    
    inline def setAssign(value: Members => js.Promise[js.Array[GroupMemberAssignment]]): Self = StObject.set(x, "assign", js.Any.fromFunction1(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: TopicsArray => GroupState): Self = StObject.set(x, "protocol", js.Any.fromFunction1(value))
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
