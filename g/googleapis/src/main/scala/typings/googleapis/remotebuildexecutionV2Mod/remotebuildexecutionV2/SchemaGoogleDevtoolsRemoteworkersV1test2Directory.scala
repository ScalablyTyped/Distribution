package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemoteworkersV1test2Directory extends StObject {
  
  /**
    * Any subdirectories
    */
  var directories: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMetadata]] = js.undefined
  
  /**
    * The files in this directory
    */
  var files: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadata]] = js.undefined
}
object SchemaGoogleDevtoolsRemoteworkersV1test2Directory {
  
  inline def apply(): SchemaGoogleDevtoolsRemoteworkersV1test2Directory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteworkersV1test2Directory]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemoteworkersV1test2Directory](x: Self) {
    
    inline def setDirectories(value: js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMetadata]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
    
    inline def setDirectoriesVarargs(value: SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMetadata*): Self = StObject.set(x, "directories", js.Array(value*))
    
    inline def setFiles(value: js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadata]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadata*): Self = StObject.set(x, "files", js.Array(value*))
  }
}
