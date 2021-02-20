package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creative Group List Response
  */
@js.native
trait SchemaCreativeGroupsListResponse extends StObject {
  
  /**
    * Creative group collection.
    */
  var creativeGroups: js.UndefOr[js.Array[SchemaCreativeGroup]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativeGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaCreativeGroupsListResponse {
  
  @scala.inline
  def apply(): SchemaCreativeGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeGroupsListResponse]
  }
  
  @scala.inline
  implicit class SchemaCreativeGroupsListResponseMutableBuilder[Self <: SchemaCreativeGroupsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreativeGroups(value: js.Array[SchemaCreativeGroup]): Self = StObject.set(x, "creativeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreativeGroupsUndefined: Self = StObject.set(x, "creativeGroups", js.undefined)
    
    @scala.inline
    def setCreativeGroupsVarargs(value: SchemaCreativeGroup*): Self = StObject.set(x, "creativeGroups", js.Array(value :_*))
    
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
