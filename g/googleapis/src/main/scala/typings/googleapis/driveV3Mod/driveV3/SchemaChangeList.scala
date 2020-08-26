package typings.googleapis.driveV3Mod.driveV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of changes for a user.
  */
@js.native
trait SchemaChangeList extends js.Object {
  /**
    * The list of changes. If nextPageToken is populated, then this list may be
    * incomplete and an additional page of results should be fetched.
    */
  var changes: js.UndefOr[js.Array[SchemaChange]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#changeList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The starting page token for future changes. This will be present only if
    * the end of the current changes list has been reached.
    */
  var newStartPageToken: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of changes. This will be absent if the
    * end of the changes list has been reached. If the token is rejected for
    * any reason, it should be discarded, and pagination should be restarted
    * from the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaChangeList {
  @scala.inline
  def apply(): SchemaChangeList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChangeList]
  }
  @scala.inline
  implicit class SchemaChangeListOps[Self <: SchemaChangeList] (val x: Self) extends AnyVal {
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
    def setChangesVarargs(value: SchemaChange*): Self = this.set("changes", js.Array(value :_*))
    @scala.inline
    def setChanges(value: js.Array[SchemaChange]): Self = this.set("changes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChanges: Self = this.set("changes", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNewStartPageToken(value: String): Self = this.set("newStartPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewStartPageToken: Self = this.set("newStartPageToken", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

