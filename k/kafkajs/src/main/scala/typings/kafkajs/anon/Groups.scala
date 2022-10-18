package typings.kafkajs.anon

import typings.kafkajs.mod.GroupOverview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groups extends StObject {
  
  var groups: js.Array[GroupOverview]
}
object Groups {
  
  inline def apply(groups: js.Array[GroupOverview]): Groups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
  
  extension [Self <: Groups](x: Self) {
    
    inline def setGroups(value: js.Array[GroupOverview]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: GroupOverview*): Self = StObject.set(x, "groups", js.Array(value*))
  }
}
