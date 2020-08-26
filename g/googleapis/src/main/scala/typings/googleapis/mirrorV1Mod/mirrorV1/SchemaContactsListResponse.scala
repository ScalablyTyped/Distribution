package typings.googleapis.mirrorV1Mod.mirrorV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Contacts representing contacts. This is the response from the
  * server to GET requests on the contacts collection.
  */
@js.native
trait SchemaContactsListResponse extends js.Object {
  /**
    * Contact list.
    */
  var items: js.UndefOr[js.Array[SchemaContact]] = js.native
  /**
    * The type of resource. This is always mirror#contacts.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaContactsListResponse {
  @scala.inline
  def apply(): SchemaContactsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaContactsListResponse]
  }
  @scala.inline
  implicit class SchemaContactsListResponseOps[Self <: SchemaContactsListResponse] (val x: Self) extends AnyVal {
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
    def setItemsVarargs(value: SchemaContact*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[SchemaContact]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
  
}

