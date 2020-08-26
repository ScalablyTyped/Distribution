package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message for ContentAddressableStorage.GetTree.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2GetTreeResponse extends js.Object {
  /**
    * The directories descended from the requested root.
    */
  var directories: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2Directory]] = js.native
  /**
    * If present, signifies that there are more results which the client can
    * retrieve by passing this as the page_token in a subsequent request. If
    * empty, signifies that this is the last page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaBuildBazelRemoteExecutionV2GetTreeResponse {
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2GetTreeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2GetTreeResponse]
  }
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2GetTreeResponseOps[Self <: SchemaBuildBazelRemoteExecutionV2GetTreeResponse] (val x: Self) extends AnyVal {
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
    def setDirectoriesVarargs(value: SchemaBuildBazelRemoteExecutionV2Directory*): Self = this.set("directories", js.Array(value :_*))
    @scala.inline
    def setDirectories(value: js.Array[SchemaBuildBazelRemoteExecutionV2Directory]): Self = this.set("directories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectories: Self = this.set("directories", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

