package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creative Group List Response
  */
trait SchemaCreativeGroupsListResponse extends StObject {
  
  /**
    * Creative group collection.
    */
  var creativeGroups: js.UndefOr[js.Array[SchemaCreativeGroup]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#creativeGroupsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaCreativeGroupsListResponse {
  
  inline def apply(): SchemaCreativeGroupsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeGroupsListResponse]
  }
  
  extension [Self <: SchemaCreativeGroupsListResponse](x: Self) {
    
    inline def setCreativeGroups(value: js.Array[SchemaCreativeGroup]): Self = StObject.set(x, "creativeGroups", value.asInstanceOf[js.Any])
    
    inline def setCreativeGroupsUndefined: Self = StObject.set(x, "creativeGroups", js.undefined)
    
    inline def setCreativeGroupsVarargs(value: SchemaCreativeGroup*): Self = StObject.set(x, "creativeGroups", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
