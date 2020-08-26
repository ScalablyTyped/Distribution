package typings.googleapis.v32Mod.dfareportingV32

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Directory Site Contact List Response
  */
@js.native
trait SchemaDirectorySiteContactsListResponse extends js.Object {
  /**
    * Directory site contact collection
    */
  var directorySiteContacts: js.UndefOr[js.Array[SchemaDirectorySiteContact]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#directorySiteContactsListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaDirectorySiteContactsListResponse {
  @scala.inline
  def apply(): SchemaDirectorySiteContactsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDirectorySiteContactsListResponse]
  }
  @scala.inline
  implicit class SchemaDirectorySiteContactsListResponseOps[Self <: SchemaDirectorySiteContactsListResponse] (val x: Self) extends AnyVal {
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
    def setDirectorySiteContactsVarargs(value: SchemaDirectorySiteContact*): Self = this.set("directorySiteContacts", js.Array(value :_*))
    @scala.inline
    def setDirectorySiteContacts(value: js.Array[SchemaDirectorySiteContact]): Self = this.set("directorySiteContacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectorySiteContacts: Self = this.set("directorySiteContacts", js.undefined)
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

