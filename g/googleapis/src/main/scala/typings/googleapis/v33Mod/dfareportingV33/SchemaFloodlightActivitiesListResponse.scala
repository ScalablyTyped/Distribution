package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Floodlight Activity List Response
  */
trait SchemaFloodlightActivitiesListResponse extends StObject {
  
  /**
    * Floodlight activity collection.
    */
  var floodlightActivities: js.UndefOr[js.Array[SchemaFloodlightActivity]] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightActivitiesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaFloodlightActivitiesListResponse {
  
  inline def apply(): SchemaFloodlightActivitiesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightActivitiesListResponse]
  }
  
  extension [Self <: SchemaFloodlightActivitiesListResponse](x: Self) {
    
    inline def setFloodlightActivities(value: js.Array[SchemaFloodlightActivity]): Self = StObject.set(x, "floodlightActivities", value.asInstanceOf[js.Any])
    
    inline def setFloodlightActivitiesUndefined: Self = StObject.set(x, "floodlightActivities", js.undefined)
    
    inline def setFloodlightActivitiesVarargs(value: SchemaFloodlightActivity*): Self = StObject.set(x, "floodlightActivities", js.Array(value :_*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
