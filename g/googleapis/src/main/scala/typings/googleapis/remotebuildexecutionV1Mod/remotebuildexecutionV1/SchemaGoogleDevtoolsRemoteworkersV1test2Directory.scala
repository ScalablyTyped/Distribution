package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

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
  def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2Directory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2Directory]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryOps[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2Directory] (val x: Self) extends AnyVal {
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
    def setDirectoriesVarargs(value: SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMetadata*): Self = this.set("directories", js.Array(value :_*))
    @scala.inline
    def setDirectories(value: js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMetadata]): Self = this.set("directories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectories: Self = this.set("directories", js.undefined)
    @scala.inline
    def setFilesVarargs(value: SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadata*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadata]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
  }
  
}

