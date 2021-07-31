package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User list response.
  */
trait SchemaUsersListResponse extends StObject {
  
  /**
    * List of user resources in the instance.
    */
  var items: js.UndefOr[js.Array[SchemaUser]] = js.undefined
  
  /**
    * This is always sql#usersList.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * An identifier that uniquely identifies the operation. You can use this
    * identifier to retrieve the Operations resource that has information about
    * the operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaUsersListResponse {
  
  @scala.inline
  def apply(): SchemaUsersListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsersListResponse]
  }
  
  @scala.inline
  implicit class SchemaUsersListResponseMutableBuilder[Self <: SchemaUsersListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaUser]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaUser*): Self = StObject.set(x, "items", js.Array(value :_*))
    
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
