package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for google.datastore.admin.v1.DatastoreAdmin.ListIndexes.
  */
@js.native
trait SchemaGoogleDatastoreAdminV1ListIndexesResponse extends js.Object {
  /**
    * The indexes.
    */
  var indexes: js.UndefOr[js.Array[SchemaGoogleDatastoreAdminV1Index]] = js.native
  /**
    * The standard List next-page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleDatastoreAdminV1ListIndexesResponse {
  @scala.inline
  def apply(): SchemaGoogleDatastoreAdminV1ListIndexesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDatastoreAdminV1ListIndexesResponse]
  }
  @scala.inline
  implicit class SchemaGoogleDatastoreAdminV1ListIndexesResponseOps[Self <: SchemaGoogleDatastoreAdminV1ListIndexesResponse] (val x: Self) extends AnyVal {
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
    def setIndexesVarargs(value: SchemaGoogleDatastoreAdminV1Index*): Self = this.set("indexes", js.Array(value :_*))
    @scala.inline
    def setIndexes(value: js.Array[SchemaGoogleDatastoreAdminV1Index]): Self = this.set("indexes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexes: Self = this.set("indexes", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

