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
  
  @scala.inline
  def apply(): ListSkusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSkusResponse]
  }
  
  @scala.inline
  implicit class ListSkusResponseMutableBuilder[Self <: ListSkusResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setSkus(value: js.Array[Sku]): Self = StObject.set(x, "skus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkusUndefined: Self = StObject.set(x, "skus", js.undefined)
    
    @scala.inline
    def setSkusVarargs(value: Sku*): Self = StObject.set(x, "skus", js.Array(value :_*))
  }
}
