package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSearchItemsByViewUrlResponse extends StObject {
  
  var items: js.UndefOr[js.Array[SchemaItem]] = js.native
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaSearchItemsByViewUrlResponse {
  
  @scala.inline
  def apply(): SchemaSearchItemsByViewUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSearchItemsByViewUrlResponse]
  }
  
  @scala.inline
  implicit class SchemaSearchItemsByViewUrlResponseMutableBuilder[Self <: SchemaSearchItemsByViewUrlResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
