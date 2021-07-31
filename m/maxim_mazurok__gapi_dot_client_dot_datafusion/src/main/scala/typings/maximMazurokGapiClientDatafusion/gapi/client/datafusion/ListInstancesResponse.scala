package typings.maximMazurokGapiClientDatafusion.gapi.client.datafusion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstancesResponse extends StObject {
  
  /** Represents a list of Data Fusion instances. */
  var instances: js.UndefOr[js.Array[Instance]] = js.undefined
  
  /** Token to retrieve the next page of results or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Locations that could not be reached. */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListInstancesResponse {
  
  @scala.inline
  def apply(): ListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstancesResponse]
  }
  
  @scala.inline
  implicit class ListInstancesResponseMutableBuilder[Self <: ListInstancesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstances(value: js.Array[Instance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
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
