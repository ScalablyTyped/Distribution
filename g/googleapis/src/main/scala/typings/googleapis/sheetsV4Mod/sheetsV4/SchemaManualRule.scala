package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManualRule extends StObject {
  
  /**
    * The list of group names and the corresponding items from the source data that map to each group name.
    */
  var groups: js.UndefOr[js.Array[SchemaManualRuleGroup]] = js.undefined
}
object SchemaManualRule {
  
  inline def apply(): SchemaManualRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManualRule]
  }
  
  extension [Self <: SchemaManualRule](x: Self) {
    
    inline def setGroups(value: js.Array[SchemaManualRuleGroup]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setGroupsVarargs(value: SchemaManualRuleGroup*): Self = StObject.set(x, "groups", js.Array(value*))
  }
}
