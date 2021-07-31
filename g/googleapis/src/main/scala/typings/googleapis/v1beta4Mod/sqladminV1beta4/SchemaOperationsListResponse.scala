package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instance list operations response.
  */
trait SchemaOperationsListResponse extends StObject {
  
  /**
    * List of operation resources.
    */
  var items: js.UndefOr[js.Array[SchemaOperation]] = js.undefined
  
  /**
    * This is always sql#operationsList.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The continuation token, used to page through large result sets. Provide
    * this value in a subsequent request to return the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaOperationsListResponse {
  
  @scala.inline
  def apply(): SchemaOperationsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationsListResponse]
  }
  
  @scala.inline
  implicit class SchemaOperationsListResponseMutableBuilder[Self <: SchemaOperationsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaOperation]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaOperation*): Self = StObject.set(x, "items", js.Array(value :_*))
    
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
