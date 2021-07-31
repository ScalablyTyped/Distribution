package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Floodlight Activity Group List Response
  */
trait SchemaFloodlightActivityGroupsListResponse extends StObject {
  
  /**
    * Floodlight activity group collection.
    */
  var floodlightActivityGroups: js.UndefOr[js.Array[SchemaFloodlightActivityGroup]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightActivityGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaFloodlightActivityGroupsListResponse {
  
  @scala.inline
  def apply(): SchemaFloodlightActivityGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightActivityGroupsListResponse]
  }
  
  @scala.inline
  implicit class SchemaFloodlightActivityGroupsListResponseMutableBuilder[Self <: SchemaFloodlightActivityGroupsListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFloodlightActivityGroups(value: js.Array[SchemaFloodlightActivityGroup]): Self = StObject.set(x, "floodlightActivityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightActivityGroupsUndefined: Self = StObject.set(x, "floodlightActivityGroups", js.undefined)
    
    @scala.inline
    def setFloodlightActivityGroupsVarargs(value: SchemaFloodlightActivityGroup*): Self = StObject.set(x, "floodlightActivityGroups", js.Array(value :_*))
    
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
