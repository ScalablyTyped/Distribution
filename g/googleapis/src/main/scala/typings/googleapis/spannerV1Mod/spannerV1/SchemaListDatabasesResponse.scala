package typings.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response for ListDatabases.
  */
@js.native
trait SchemaListDatabasesResponse extends js.Object {
  /**
    * Databases that matched the request.
    */
  var databases: js.UndefOr[js.Array[SchemaDatabase]] = js.native
  /**
    * `next_page_token` can be sent in a subsequent ListDatabases call to fetch
    * more of the matching databases.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListDatabasesResponse {
  @scala.inline
  def apply(): SchemaListDatabasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDatabasesResponse]
  }
  @scala.inline
  implicit class SchemaListDatabasesResponseOps[Self <: SchemaListDatabasesResponse] (val x: Self) extends AnyVal {
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
    def setDatabasesVarargs(value: SchemaDatabase*): Self = this.set("databases", js.Array(value :_*))
    @scala.inline
    def setDatabases(value: js.Array[SchemaDatabase]): Self = this.set("databases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabases: Self = this.set("databases", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

