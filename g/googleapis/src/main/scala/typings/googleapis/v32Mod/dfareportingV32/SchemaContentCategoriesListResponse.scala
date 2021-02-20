package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Content Category List Response
  */
@js.native
trait SchemaContentCategoriesListResponse extends StObject {
  
  /**
    * Content category collection.
    */
  var contentCategories: js.UndefOr[js.Array[SchemaContentCategory]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#contentCategoriesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaContentCategoriesListResponse {
  
  @scala.inline
  def apply(): SchemaContentCategoriesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContentCategoriesListResponse]
  }
  
  @scala.inline
  implicit class SchemaContentCategoriesListResponseMutableBuilder[Self <: SchemaContentCategoriesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentCategories(value: js.Array[SchemaContentCategory]): Self = StObject.set(x, "contentCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentCategoriesUndefined: Self = StObject.set(x, "contentCategories", js.undefined)
    
    @scala.inline
    def setContentCategoriesVarargs(value: SchemaContentCategory*): Self = StObject.set(x, "contentCategories", js.Array(value :_*))
    
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
