package typings.googleapis.vaultV1Mod.vaultV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Export sink for cloud storage files.
  */
trait SchemaCloudStorageSink extends StObject {
  
  /**
    * Output only. The exported files on cloud storage.
    */
  var files: js.UndefOr[js.Array[SchemaCloudStorageFile]] = js.undefined
}
object SchemaCloudStorageSink {
  
  @scala.inline
  def apply(): SchemaCloudStorageSink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudStorageSink]
  }
  
  @scala.inline
  implicit class SchemaCloudStorageSinkMutableBuilder[Self <: SchemaCloudStorageSink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: js.Array[SchemaCloudStorageFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    @scala.inline
    def setFilesVarargs(value: SchemaCloudStorageFile*): Self = StObject.set(x, "files", js.Array(value :_*))
  }
}
