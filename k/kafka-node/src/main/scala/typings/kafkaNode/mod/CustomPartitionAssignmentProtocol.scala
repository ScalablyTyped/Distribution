package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPartitionAssignmentProtocol extends StObject {
  
  def assign(
    topicPattern: js.Any,
    groupMembers: js.Any,
    cb: js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]
  ): Unit
  
  var name: String
  
  var version: Double
}
object CustomPartitionAssignmentProtocol {
  
  @scala.inline
  def apply(
    assign: (js.Any, js.Any, js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]) => Unit,
    name: String,
    version: Double
  ): CustomPartitionAssignmentProtocol = {
    val __obj = js.Dynamic.literal(assign = js.Any.fromFunction3(assign), name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPartitionAssignmentProtocol]
  }
  
  @scala.inline
  implicit class CustomPartitionAssignmentProtocolMutableBuilder[Self <: CustomPartitionAssignmentProtocol] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssign(value: (js.Any, js.Any, js.Function2[/* error */ js.Any, /* result */ js.Any, Unit]) => Unit): Self = StObject.set(x, "assign", js.Any.fromFunction3(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
