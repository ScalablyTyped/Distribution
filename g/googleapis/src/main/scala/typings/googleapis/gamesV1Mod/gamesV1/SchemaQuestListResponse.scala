package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a list of quest objects.
  */
@js.native
trait SchemaQuestListResponse extends StObject {
  
  /**
    * The quests.
    */
  var items: js.UndefOr[js.Array[SchemaQuest]] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#questListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Token corresponding to the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaQuestListResponse {
  
  @scala.inline
  def apply(): SchemaQuestListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuestListResponse]
  }
  
  @scala.inline
  implicit class SchemaQuestListResponseMutableBuilder[Self <: SchemaQuestListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaQuest]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaQuest*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
