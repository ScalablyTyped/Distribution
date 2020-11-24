package typings.maximMazurokGapiClientCloudbuild.gapi.client.cloudbuild

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileHashes extends js.Object {
  
  /** Collection of file hashes. */
  var fileHash: js.UndefOr[js.Array[Hash]] = js.native
}
object FileHashes {
  
  @scala.inline
  def apply(): FileHashes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileHashes]
  }
  
  @scala.inline
  implicit class FileHashesOps[Self <: FileHashes] (val x: Self) extends AnyVal {
    
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
    def setFileHashVarargs(value: Hash*): Self = this.set("fileHash", js.Array(value :_*))
    
    @scala.inline
    def setFileHash(value: js.Array[Hash]): Self = this.set("fileHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileHash: Self = this.set("fileHash", js.undefined)
  }
}
