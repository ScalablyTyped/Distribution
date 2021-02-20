package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a list of category data objects.
  */
@js.native
trait SchemaCategoryListResponse extends StObject {
  
  /**
    * The list of categories with usage data.
    */
  var items: js.UndefOr[js.Array[SchemaCategory]] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#categoryListResponse.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Token corresponding to the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaCategoryListResponse {
  
  @scala.inline
  def apply(): SchemaCategoryListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCategoryListResponse]
  }
  
  @scala.inline
  implicit class SchemaCategoryListResponseMutableBuilder[Self <: SchemaCategoryListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaCategory]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaCategory*): Self = StObject.set(x, "items", js.Array(value :_*))
    
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
