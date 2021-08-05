package typings.maximMazurokGapiClientCloudfunctions.gapi.client.cloudfunctions

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFunctionsResponse extends StObject {
  
  /** The functions that match the request. */
  var functions: js.UndefOr[js.Array[CloudFunction]] = js.undefined
  
  /**
    * If not empty, indicates that there may be more functions that match the request; this value should be passed in a new google.cloud.functions.v1.ListFunctionsRequest to get more
    * functions.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Locations that could not be reached. The response does not include any functions from these locations. */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object ListFunctionsResponse {
  
  inline def apply(): ListFunctionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFunctionsResponse]
  }
  
  extension [Self <: ListFunctionsResponse](x: Self) {
    
    inline def setFunctions(value: js.Array[CloudFunction]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsUndefined: Self = StObject.set(x, "functions", js.undefined)
    
    inline def setFunctionsVarargs(value: CloudFunction*): Self = StObject.set(x, "functions", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value :_*))
  }
}
