package typings.maximMazurokGapiClientCloudbilling.gapi.client.cloudbilling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSkusResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. To retrieve the next page, call `ListSkus` again with the `page_token` field set to this value. This field is empty if there are no
    * more results to retrieve.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of public SKUs of the given service. */
  var skus: js.UndefOr[js.Array[Sku]] = js.undefined
}
object ListSkusResponse {
  
  inline def apply(): ListSkusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSkusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSkusResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSkus(value: js.Array[Sku]): Self = StObject.set(x, "skus", value.asInstanceOf[js.Any])
    
    inline def setSkusUndefined: Self = StObject.set(x, "skus", js.undefined)
    
    inline def setSkusVarargs(value: Sku*): Self = StObject.set(x, "skus", js.Array(value*))
  }
}
