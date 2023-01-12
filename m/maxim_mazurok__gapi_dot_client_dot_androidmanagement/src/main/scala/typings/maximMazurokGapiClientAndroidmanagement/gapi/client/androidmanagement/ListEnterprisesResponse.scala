package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEnterprisesResponse extends StObject {
  
  /** The list of enterprises. */
  var enterprises: js.UndefOr[js.Array[Enterprise]] = js.undefined
  
  /** If there are more results, a token to retrieve next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListEnterprisesResponse {
  
  inline def apply(): ListEnterprisesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEnterprisesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEnterprisesResponse] (val x: Self) extends AnyVal {
    
    inline def setEnterprises(value: js.Array[Enterprise]): Self = StObject.set(x, "enterprises", value.asInstanceOf[js.Any])
    
    inline def setEnterprisesUndefined: Self = StObject.set(x, "enterprises", js.undefined)
    
    inline def setEnterprisesVarargs(value: Enterprise*): Self = StObject.set(x, "enterprises", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
