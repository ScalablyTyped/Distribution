package typings.googleapis.v12Mod.adexchangebuyerV12

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The creatives feed lists the active creatives for the Ad Exchange buyer
  * accounts that the user has access to. Each entry in the feed corresponds to
  * a single creative.
  */
@js.native
trait SchemaCreativesList extends js.Object {
  /**
    * A list of creatives.
    */
  var items: js.UndefOr[js.Array[SchemaCreative]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Continuation token used to page through creatives. To retrieve the next
    * page of results, set the next request&#39;s &quot;pageToken&quot; value
    * to this.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaCreativesList {
  @scala.inline
  def apply(): SchemaCreativesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativesList]
  }
  @scala.inline
  implicit class SchemaCreativesListOps[Self <: SchemaCreativesList] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaCreative*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaCreative]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

