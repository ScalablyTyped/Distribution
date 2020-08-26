package typings.googleapis.storageV1beta2Mod.storageV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of buckets.
  */
@js.native
trait SchemaBuckets extends js.Object {
  /**
    * The list of items.
    */
  var items: js.UndefOr[js.Array[SchemaBucket]] = js.native
  /**
    * The kind of item this is. For lists of buckets, this is always
    * storage#buckets.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The continuation token, used to page through large result sets. Provide
    * this value in a subsequent request to return the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaBuckets {
  @scala.inline
  def apply(): SchemaBuckets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuckets]
  }
  @scala.inline
  implicit class SchemaBucketsOps[Self <: SchemaBuckets] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaBucket*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaBucket]): Self = this.set("items", value.asInstanceOf[js.Any])
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

