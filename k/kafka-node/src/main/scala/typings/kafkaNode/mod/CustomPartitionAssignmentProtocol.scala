package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPartitionAssignmentProtocol extends StObject {
  
  def assign(topicPattern: Any, groupMembers: Any, cb: js.Function2[/* error */ Any, /* result */ Any, Unit]): Unit
  
  var name: String
  
  var version: Double
}
object CustomPartitionAssignmentProtocol {
  
  inline def apply(
    assign: (Any, Any, js.Function2[/* error */ Any, /* result */ Any, Unit]) => Unit,
    name: String,
    version: Double
  ): CustomPartitionAssignmentProtocol = {
    val __obj = js.Dynamic.literal(assign = js.Any.fromFunction3(assign), name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPartitionAssignmentProtocol]
  }
  
  extension [Self <: CustomPartitionAssignmentProtocol](x: Self) {
    
    inline def setAssign(value: (Any, Any, js.Function2[/* error */ Any, /* result */ Any, Unit]) => Unit): Self = StObject.set(x, "assign", js.Any.fromFunction3(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
