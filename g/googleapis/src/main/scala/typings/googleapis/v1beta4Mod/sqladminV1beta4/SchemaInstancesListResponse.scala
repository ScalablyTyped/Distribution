package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database instances list response.
  */
trait SchemaInstancesListResponse extends StObject {
  
  /**
    * List of database instance resources.
    */
  var items: js.UndefOr[js.Array[SchemaDatabaseInstance]] = js.undefined
  
  /**
    * This is always sql#instancesList.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The continuation token, used to page through large result sets. Provide
    * this value in a subsequent request to return the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * List of warnings that ocurred while handling the request.
    */
  var warnings: js.UndefOr[js.Array[SchemaApiWarning]] = js.undefined
}
object SchemaInstancesListResponse {
  
  @scala.inline
  def apply(): SchemaInstancesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesListResponse]
  }
  
  @scala.inline
  implicit class SchemaInstancesListResponseMutableBuilder[Self <: SchemaInstancesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaDatabaseInstance]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaDatabaseInstance*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setWarnings(value: js.Array[SchemaApiWarning]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: SchemaApiWarning*): Self = StObject.set(x, "warnings", js.Array(value :_*))
  }
}
