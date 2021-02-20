package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `Directory` represents a directory node in a file tree, containing zero
  * or more children FileNodes, DirectoryNodes and SymlinkNodes. Each `Node`
  * contains its name in the directory, either the digest of its content
  * (either a file blob or a `Directory` proto) or a symlink target, as well as
  * possibly some metadata about the file or directory.  In order to ensure
  * that two equivalent directory trees hash to the same value, the following
  * restrictions MUST be obeyed when constructing a a `Directory`:  * Every
  * child in the directory must have a path of exactly one segment.   Multiple
  * levels of directory hierarchy may not be collapsed. * Each child in the
  * directory must have a unique path segment (file name). * The files,
  * directories and symlinks in the directory must each be sorted   in
  * lexicographical order by path. The path strings must be sorted by code
  * point, equivalently, by UTF-8 bytes.  A `Directory` that obeys the
  * restrictions is said to be in canonical form.  As an example, the following
  * could be used for a file named `bar` and a directory named `foo` with an
  * executable file named `baz` (hashes shortened for readability):  ```json //
  * (Directory proto) {   files: [     {       name: &quot;bar&quot;, digest: {
  * hash: &quot;4a73bc9d03...&quot;,         size: 65534       }     }   ],
  * directories: [     {       name: &quot;foo&quot;,       digest: { hash:
  * &quot;4cf2eda940...&quot;,         size: 43       }     }   ] }  //
  * (Directory proto with hash &quot;4cf2eda940...&quot; and size 43) { files:
  * [     {       name: &quot;baz&quot;,       digest: {         hash:
  * &quot;b2c941073e...&quot;,         size: 1294,       }, is_executable: true
  * }   ] } ```
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2Directory extends StObject {
  
  /**
    * The subdirectories in the directory.
    */
  var directories: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2DirectoryNode]] = js.native
  
  /**
    * The files in the directory.
    */
  var files: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2FileNode]] = js.native
  
  /**
    * The symlinks in the directory.
    */
  var symlinks: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2SymlinkNode]] = js.native
}
object SchemaBuildBazelRemoteExecutionV2Directory {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2Directory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2Directory]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2DirectoryMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2Directory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectories(value: js.Array[SchemaBuildBazelRemoteExecutionV2DirectoryNode]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
    
    @scala.inline
    def setDirectoriesVarargs(value: SchemaBuildBazelRemoteExecutionV2DirectoryNode*): Self = StObject.set(x, "directories", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[SchemaBuildBazelRemoteExecutionV2FileNode]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: SchemaBuildBazelRemoteExecutionV2FileNode*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setSymlinks(value: js.Array[SchemaBuildBazelRemoteExecutionV2SymlinkNode]): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
    
    @scala.inline
    def setSymlinksVarargs(value: SchemaBuildBazelRemoteExecutionV2SymlinkNode*): Self = StObject.set(x, "symlinks", js.Array(value :_*))
  }
}
