package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The contents of a directory. Similar to the equivalent message in the
  * Remote Execution API.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2Directory extends js.Object {
  /**
    * Any subdirectories
    */
  var directories: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMetadata]] = js.native
  /**
    * The files in this directory
    */
  var files: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadata]] = js.native
}

object SchemaGoogleDevtoolsRemoteworkersV1test2Directory {
  @scala.inline
  def apply(
    directories: js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMetadata] = null,
    files: js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadata] = null
  ): SchemaGoogleDevtoolsRemoteworkersV1test2Directory = {
    val __obj = js.Dynamic.literal()
    if (directories != null) __obj.updateDynamic("directories")(directories.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2Directory]
  }
}

