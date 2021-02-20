package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The contents of a directory. Similar to the equivalent message in the
  * Remote Execution API.
  */
@js.native
trait SchemaGoogleDevtoolsRemoteworkersV1test2Directory extends StObject {
  
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
  implicit class SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMutableBuilder[Self <: SchemaGoogleDevtoolsRemoteworkersV1test2Directory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectories(value: js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMetadata]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
    
    @scala.inline
    def setDirectoriesVarargs(value: SchemaGoogleDevtoolsRemoteworkersV1test2DirectoryMetadata*): Self = StObject.set(x, "directories", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadata]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: SchemaGoogleDevtoolsRemoteworkersV1test2FileMetadata*): Self = StObject.set(x, "files", js.Array(value :_*))
  }
}
