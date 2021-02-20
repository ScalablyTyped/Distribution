package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPollItemsResponse extends StObject {
  
  /**
    * Set of items from the queue available for connector to process. &lt;br
    * /&gt;These items have the following subset of fields populated: &lt;br
    * /&gt; &lt;br /&gt;version &lt;br /&gt;metadata.hash &lt;br
    * /&gt;structured_data.hash &lt;br /&gt;content.hash &lt;br /&gt;payload
    * &lt;br /&gt;status &lt;br /&gt;queue
    */
  var items: js.UndefOr[js.Array[SchemaItem]] = js.native
}
object SchemaPollItemsResponse {
  
  @scala.inline
  def apply(): SchemaPollItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPollItemsResponse]
  }
  
  @scala.inline
  implicit class SchemaPollItemsResponseMutableBuilder[Self <: SchemaPollItemsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SchemaItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
