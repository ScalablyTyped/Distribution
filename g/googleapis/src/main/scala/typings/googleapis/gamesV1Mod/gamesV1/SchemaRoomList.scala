package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a list of rooms.
  */
@js.native
trait SchemaRoomList extends StObject {
  
  /**
    * The rooms.
    */
  var items: js.UndefOr[js.Array[SchemaRoom]] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#roomList.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The pagination token for the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaRoomList {
  
  @scala.inline
  def apply(): SchemaRoomList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRoomList]
  }
  
  @scala.inline
  implicit class SchemaRoomListMutableBuilder[Self <: SchemaRoomList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaRoom]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaRoom*): Self = StObject.set(x, "items", js.Array(value :_*))
    
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
