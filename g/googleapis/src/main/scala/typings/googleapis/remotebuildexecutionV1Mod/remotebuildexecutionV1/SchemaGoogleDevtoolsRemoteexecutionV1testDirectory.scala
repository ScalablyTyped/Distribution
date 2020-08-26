package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Directory` represents a directory node in a file tree, containing zero
  * or more children FileNodes and DirectoryNodes. Each `Node` contains its
  * name in the directory, the digest of its content (either a file blob or a
  * `Directory` proto), as well as possibly some metadata about the file or
  * directory.  In order to ensure that two equivalent directory trees hash to
  * the same value, the following restrictions MUST be obeyed when constructing
  * a a `Directory`:   - Every child in the directory must have a path of
  * exactly one segment.     Multiple levels of directory hierarchy may not be
  * collapsed.   - Each child in the directory must have a unique path segment
  * (file name).   - The files and directories in the directory must each be
  * sorted in     lexicographical order by path. The path strings must be
  * sorted by code     point, equivalently, by UTF-8 bytes.  A `Directory` that
  * obeys the restrictions is said to be in canonical form.  As an example, the
  * following could be used for a file named `bar` and a directory named `foo`
  * with an executable file named `baz` (hashes shortened for readability):
  * ```json // (Directory proto) {   files: [     {       name:
  * &quot;bar&quot;,       digest: {         hash: &quot;4a73bc9d03...&quot;,
  * size: 65534       }     }   ],   directories: [     {       name:
  * &quot;foo&quot;,       digest: {         hash: &quot;4cf2eda940...&quot;,
  * size: 43       }     }   ] }  // (Directory proto with hash
  * &quot;4cf2eda940...&quot; and size 43) {   files: [     {       name:
  * &quot;baz&quot;,       digest: {         hash: &quot;b2c941073e...&quot;,
  * size: 1294,       },       is_executable: true     }   ] } ```
  */
@js.native
trait SchemaGoogleDevtoolsRemoteexecutionV1testDirectory extends js.Object {
  /**
    * The subdirectories in the directory.
    */
  var directories: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemoteexecutionV1testDirectoryNode]] = js.native
  /**
    * The files in the directory.
    */
  var files: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemoteexecutionV1testFileNode]] = js.native
}

object SchemaGoogleDevtoolsRemoteexecutionV1testDirectory {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testDirectory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testDirectory]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testDirectoryOps[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testDirectory] (val x: Self) extends AnyVal {
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
    def setDirectoriesVarargs(value: SchemaGoogleDevtoolsRemoteexecutionV1testDirectoryNode*): Self = this.set("directories", js.Array(value :_*))
    @scala.inline
    def setDirectories(value: js.Array[SchemaGoogleDevtoolsRemoteexecutionV1testDirectoryNode]): Self = this.set("directories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectories: Self = this.set("directories", js.undefined)
    @scala.inline
    def setFilesVarargs(value: SchemaGoogleDevtoolsRemoteexecutionV1testFileNode*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[SchemaGoogleDevtoolsRemoteexecutionV1testFileNode]): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
  }
  
}

