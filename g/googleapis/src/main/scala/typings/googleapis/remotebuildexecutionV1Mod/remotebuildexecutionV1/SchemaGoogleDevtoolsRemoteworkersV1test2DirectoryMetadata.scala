package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metadata for a directory. Similar to the equivalent message in the
  * Remote Execution API.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMetadata extends js.Object {
  /**
    * A pointer to the contents of the directory, in the form of a marshalled
    * Directory message.
    */
  var digest: js.UndefOr[SchemaGoogleDevtoolsRemoteworkersV1test2Digest] = js.native
  /**
    * The path of the directory, as in FileMetadata.path.
    */
  var path: js.UndefOr[String] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMetadata {
  @scala.inline
  def apply(digest: SchemaGoogleDevtoolsRemoteworkersV1test2Digest = null, path: String = null): SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMetadata = {
    val __obj = js.Dynamic.literal()
    if (digest != null) __obj.updateDynamic("digest")(digest.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMetadata]
  }
}

