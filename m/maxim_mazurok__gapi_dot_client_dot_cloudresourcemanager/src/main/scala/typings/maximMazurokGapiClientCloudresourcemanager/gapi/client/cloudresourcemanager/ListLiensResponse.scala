package typings.maximMazurokGapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLiensResponse extends StObject {
  
  /** A list of Liens. */
  var liens: js.UndefOr[js.Array[Lien]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListLiensResponse {
  
  inline def apply(): ListLiensResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLiensResponse]
  }
  
  extension [Self <: ListLiensResponse](x: Self) {
    
    inline def setLiens(value: js.Array[Lien]): Self = StObject.set(x, "liens", value.asInstanceOf[js.Any])
    
    inline def setLiensUndefined: Self = StObject.set(x, "liens", js.undefined)
    
    inline def setLiensVarargs(value: Lien*): Self = StObject.set(x, "liens", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
