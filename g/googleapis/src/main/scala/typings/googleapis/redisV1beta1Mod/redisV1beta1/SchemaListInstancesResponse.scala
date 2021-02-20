package typings.googleapis.redisV1beta1Mod.redisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for ListInstances.
  */
@js.native
trait SchemaListInstancesResponse extends StObject {
  
  /**
    * A list of Redis instances in the project in the specified location, or
    * across all locations.  If the `location_id` in the parent field of the
    * request is &quot;-&quot;, all regions available to the project are
    * queried, and the results aggregated. If in such an aggregated query a
    * location is unavailable, a dummy Redis entry is included in the response
    * with the &quot;name&quot; field set to a value of the form
    * projects/{project_id}/locations/{location_id}/instances/- and the
    * &quot;status&quot; field set to ERROR and &quot;status_message&quot;
    * field set to &quot;location not available for ListInstances&quot;.
    */
  var instances: js.UndefOr[js.Array[SchemaInstance]] = js.native
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Locations that could not be reached.
    */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}
object SchemaListInstancesResponse {
  
  @scala.inline
  def apply(): SchemaListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListInstancesResponse]
  }
  
  @scala.inline
  implicit class SchemaListInstancesResponseMutableBuilder[Self <: SchemaListInstancesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: js.Array[SchemaInstance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: SchemaInstance*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    @scala.inline
    def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
