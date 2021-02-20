package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Floodlight Activity List Response
  */
@js.native
trait SchemaFloodlightActivitiesListResponse extends StObject {
  
  /**
    * Floodlight activity collection.
    */
  var floodlightActivities: js.UndefOr[js.Array[SchemaFloodlightActivity]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#floodlightActivitiesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaFloodlightActivitiesListResponse {
  
  @scala.inline
  def apply(): SchemaFloodlightActivitiesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightActivitiesListResponse]
  }
  
  @scala.inline
  implicit class SchemaFloodlightActivitiesListResponseMutableBuilder[Self <: SchemaFloodlightActivitiesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFloodlightActivities(value: js.Array[SchemaFloodlightActivity]): Self = StObject.set(x, "floodlightActivities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightActivitiesUndefined: Self = StObject.set(x, "floodlightActivities", js.undefined)
    
    @scala.inline
    def setFloodlightActivitiesVarargs(value: SchemaFloodlightActivity*): Self = StObject.set(x, "floodlightActivities", js.Array(value :_*))
    
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
