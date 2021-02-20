package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFunctionsResponse extends StObject {
  
  /** The functions that match the request. */
  var functions: js.UndefOr[js.Array[CloudFunction]] = js.native
  
  /**
    * If not empty, indicates that there may be more functions that match the request; this value should be passed in a new google.cloud.functions.v1.ListFunctionsRequest to get more
    * functions.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** Locations that could not be reached. The response does not include any functions from these locations. */
  var unreachable: js.UndefOr[js.Array[String]] = js.native
}
object ListFunctionsResponse {
  
  @scala.inline
  def apply(): ListFunctionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFunctionsResponse]
  }
  
  @scala.inline
  implicit class ListFunctionsResponseMutableBuilder[Self <: ListFunctionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFunctions(value: js.Array[CloudFunction]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    @scala.inline
    def setFunctionsVarargs(value: CloudFunction*): Self = StObject.set(x, "functions", js.Array(value :_*))
    
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
