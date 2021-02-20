package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FloodlightActivitiesListResponse extends StObject {
  
  /** Floodlight activity collection. */
  var floodlightActivities: js.UndefOr[js.Array[FloodlightActivity]] = js.native
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#floodlightActivitiesListResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object FloodlightActivitiesListResponse {
  
  @scala.inline
  def apply(): FloodlightActivitiesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FloodlightActivitiesListResponse]
  }
  
  @scala.inline
  implicit class FloodlightActivitiesListResponseMutableBuilder[Self <: FloodlightActivitiesListResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFloodlightActivities(value: js.Array[FloodlightActivity]): Self = StObject.set(x, "floodlightActivities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodlightActivitiesUndefined: Self = StObject.set(x, "floodlightActivities", js.undefined)
    
    @scala.inline
    def setFloodlightActivitiesVarargs(value: FloodlightActivity*): Self = StObject.set(x, "floodlightActivities", js.Array(value :_*))
    
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
