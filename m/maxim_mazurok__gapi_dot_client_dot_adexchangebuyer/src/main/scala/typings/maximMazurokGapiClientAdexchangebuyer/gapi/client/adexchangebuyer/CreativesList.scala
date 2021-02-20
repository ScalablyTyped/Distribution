package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreativesList extends StObject {
  
  /** A list of creatives. */
  var items: js.UndefOr[js.Array[Creative]] = js.native
  
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  
  /** Continuation token used to page through creatives. To retrieve the next page of results, set the next request's "pageToken" value to this. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object CreativesList {
  
  @scala.inline
  def apply(): CreativesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreativesList]
  }
  
  @scala.inline
  implicit class CreativesListMutableBuilder[Self <: CreativesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[Creative]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Creative*): Self = StObject.set(x, "items", js.Array(value :_*))
    
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
