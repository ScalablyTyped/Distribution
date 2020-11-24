package typings.googleapis.vaultV1Mod.vaultV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Export sink for cloud storage files.
  */
@js.native
trait SchemaCloudStorageSink extends js.Object {
  
  /**
    * Output only. The exported files on cloud storage.
    */
  var files: js.UndefOr[js.Array[SchemaCloudStorageFile]] = js.native
}
object SchemaCloudStorageSink {
  
  @scala.inline
  def apply(): SchemaCloudStorageSink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudStorageSink]
  }
  
  @scala.inline
  implicit class SchemaCloudStorageSinkOps[Self <: SchemaCloudStorageSink] (val x: Self) extends AnyVal {
    
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
    def setFilesVarargs(value: SchemaCloudStorageFile*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[SchemaCloudStorageFile]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiles: Self = this.set("files", js.undefined)
  }
}
