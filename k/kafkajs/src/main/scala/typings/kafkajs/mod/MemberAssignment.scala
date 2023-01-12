package typings.kafkajs.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberAssignment extends StObject {
  
  var assignment: Assignment
  
  var userData: Buffer
  
  var version: Double
}
object MemberAssignment {
  
  inline def apply(assignment: Assignment, userData: Buffer, version: Double): MemberAssignment = {
    val __obj = js.Dynamic.literal(assignment = assignment.asInstanceOf[js.Any], userData = userData.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberAssignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberAssignment] (val x: Self) extends AnyVal {
    
    inline def setAssignment(value: Assignment): Self = StObject.set(x, "assignment", value.asInstanceOf[js.Any])
    
    inline def setUserData(value: Buffer): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
