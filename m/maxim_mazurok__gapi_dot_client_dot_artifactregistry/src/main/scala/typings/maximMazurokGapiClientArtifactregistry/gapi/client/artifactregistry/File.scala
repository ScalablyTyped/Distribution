package typings.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait File extends js.Object {
  
  /** The time when the File was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** The hashes of the file content. */
  var hashes: js.UndefOr[js.Array[Hash]] = js.native
  
  /** The name of the file, for example: "projects/p1/locations/us-central1/repositories/repo1/files/a/b/c.txt". */
  var name: js.UndefOr[String] = js.native
  
  /** The name of the Package or Version that owns this file, if any. */
  var owner: js.UndefOr[String] = js.native
  
  /** The size of the File in bytes. */
  var sizeBytes: js.UndefOr[String] = js.native
  
  /** The time when the File was last updated. */
  var updateTime: js.UndefOr[String] = js.native
}
object File {
  
  @scala.inline
  def apply(): File = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[File]
  }
  
  @scala.inline
  implicit class FileOps[Self <: File] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setHashesVarargs(value: Hash*): Self = this.set("hashes", js.Array(value :_*))
    
    @scala.inline
    def setHashes(value: js.Array[Hash]): Self = this.set("hashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashes: Self = this.set("hashes", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setSizeBytes(value: String): Self = this.set("sizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeBytes: Self = this.set("sizeBytes", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
  }
}
