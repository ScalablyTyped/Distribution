package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPollItemsResponse extends js.Object {
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
  def apply(items: js.Array[SchemaItem] = null): SchemaPollItemsResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPollItemsResponse]
  }
}

