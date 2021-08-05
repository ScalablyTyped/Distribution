package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for multiple quests reset all request.
  */
trait SchemaQuestsResetMultipleForAllRequest extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesManagement#questsResetMultipleForAllRequest.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of quests to reset.
    */
  var quest_ids: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaQuestsResetMultipleForAllRequest {
  
  inline def apply(): SchemaQuestsResetMultipleForAllRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuestsResetMultipleForAllRequest]
  }
  
  extension [Self <: SchemaQuestsResetMultipleForAllRequest](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setQuest_ids(value: js.Array[String]): Self = StObject.set(x, "quest_ids", value.asInstanceOf[js.Any])
    
    inline def setQuest_idsUndefined: Self = StObject.set(x, "quest_ids", js.undefined)
    
    inline def setQuest_idsVarargs(value: String*): Self = StObject.set(x, "quest_ids", js.Array(value :_*))
  }
}
