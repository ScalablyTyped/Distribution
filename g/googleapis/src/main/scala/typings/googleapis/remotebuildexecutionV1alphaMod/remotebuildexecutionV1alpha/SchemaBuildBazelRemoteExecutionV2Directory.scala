package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2Directory extends StObject {
  
  /**
    * The subdirectories in the directory.
    */
  var directories: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2DirectoryNode]] = js.undefined
  
  /**
    * The files in the directory.
    */
  var files: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2FileNode]] = js.undefined
  
  var nodeProperties: js.UndefOr[SchemaBuildBazelRemoteExecutionV2NodeProperties] = js.undefined
  
  /**
    * The symlinks in the directory.
    */
  var symlinks: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2SymlinkNode]] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2Directory {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2Directory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2Directory]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2Directory](x: Self) {
    
    inline def setDirectories(value: js.Array[SchemaBuildBazelRemoteExecutionV2DirectoryNode]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
    
    inline def setDirectoriesVarargs(value: SchemaBuildBazelRemoteExecutionV2DirectoryNode*): Self = StObject.set(x, "directories", js.Array(value*))
    
    inline def setFiles(value: js.Array[SchemaBuildBazelRemoteExecutionV2FileNode]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: SchemaBuildBazelRemoteExecutionV2FileNode*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setNodeProperties(value: SchemaBuildBazelRemoteExecutionV2NodeProperties): Self = StObject.set(x, "nodeProperties", value.asInstanceOf[js.Any])
    
    inline def setNodePropertiesUndefined: Self = StObject.set(x, "nodeProperties", js.undefined)
    
    inline def setSymlinks(value: js.Array[SchemaBuildBazelRemoteExecutionV2SymlinkNode]): Self = StObject.set(x, "symlinks", value.asInstanceOf[js.Any])
    
    inline def setSymlinksUndefined: Self = StObject.set(x, "symlinks", js.undefined)
    
    inline def setSymlinksVarargs(value: SchemaBuildBazelRemoteExecutionV2SymlinkNode*): Self = StObject.set(x, "symlinks", js.Array(value*))
  }
}
