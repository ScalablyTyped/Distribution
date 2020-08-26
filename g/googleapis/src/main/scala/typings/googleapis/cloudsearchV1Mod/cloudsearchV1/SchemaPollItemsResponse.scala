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
  def apply(): SchemaPollItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPollItemsResponse]
  }
  @scala.inline
  implicit class SchemaPollItemsResponseOps[Self <: SchemaPollItemsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItemsVarargs(value: SchemaItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
  
}

