package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupId extends StObject {
  
  var groupId: String
}
object GroupId {
  
  inline def apply(groupId: String): GroupId = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroupId] (val x: Self) extends AnyVal {
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
  }
}
