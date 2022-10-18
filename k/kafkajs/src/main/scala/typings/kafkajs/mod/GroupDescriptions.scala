package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupDescriptions extends StObject {
  
  var groups: js.Array[GroupDescription]
}
object GroupDescriptions {
  
  inline def apply(groups: js.Array[GroupDescription]): GroupDescriptions = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupDescriptions]
  }
  
  extension [Self <: GroupDescriptions](x: Self) {
    
    inline def setGroups(value: js.Array[GroupDescription]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: GroupDescription*): Self = StObject.set(x, "groups", js.Array(value*))
  }
}
