package typings.googleapis.driveV3Mod.driveV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of files.
  */
@js.native
trait SchemaFileList extends js.Object {
  /**
    * The list of files. If nextPageToken is populated, then this list may be
    * incomplete and an additional page of results should be fetched.
    */
  var files: js.UndefOr[js.Array[SchemaFile]] = js.native
  /**
    * Whether the search process was incomplete. If true, then some search
    * results may be missing, since all documents were not searched. This may
    * occur when searching multiple Team Drives with the
    * &quot;user,allTeamDrives&quot; corpora, but all corpora could not be
    * searched. When this happens, it is suggested that clients narrow their
    * query by choosing a different corpus such as &quot;user&quot; or
    * &quot;teamDrive&quot;.
    */
  var incompleteSearch: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;drive#fileList&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The page token for the next page of files. This will be absent if the end
    * of the files list has been reached. If the token is rejected for any
    * reason, it should be discarded, and pagination should be restarted from
    * the first page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaFileList {
  @scala.inline
  def apply(): SchemaFileList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileList]
  }
  @scala.inline
  implicit class SchemaFileListOps[Self <: SchemaFileList] (val x: Self) extends AnyVal {
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
    def setFilesVarargs(value: SchemaFile*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[SchemaFile]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
    @scala.inline
    def setIncompleteSearch(value: Boolean): Self = this.set("incompleteSearch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncompleteSearch: Self = this.set("incompleteSearch", js.undefined)
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

