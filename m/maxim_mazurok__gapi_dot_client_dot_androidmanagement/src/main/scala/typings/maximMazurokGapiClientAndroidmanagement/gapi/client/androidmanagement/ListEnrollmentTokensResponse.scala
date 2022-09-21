package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnrollmentTokensResponse extends StObject {
  
  /** The list of enrollment tokens. */
  var enrollmentTokens: js.UndefOr[js.Array[EnrollmentToken]] = js.undefined
  
  /** If there are more results, a token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListEnrollmentTokensResponse {
  
  inline def apply(): ListEnrollmentTokensResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnrollmentTokensResponse]
  }
  
  extension [Self <: ListEnrollmentTokensResponse](x: Self) {
    
    inline def setEnrollmentTokens(value: js.Array[EnrollmentToken]): Self = StObject.set(x, "enrollmentTokens", value.asInstanceOf[js.Any])
    
    inline def setEnrollmentTokensUndefined: Self = StObject.set(x, "enrollmentTokens", js.undefined)
    
    inline def setEnrollmentTokensVarargs(value: EnrollmentToken*): Self = StObject.set(x, "enrollmentTokens", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
