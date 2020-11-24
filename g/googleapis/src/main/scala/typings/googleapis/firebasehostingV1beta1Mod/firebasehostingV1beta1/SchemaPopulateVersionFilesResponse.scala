package typings.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPopulateVersionFilesResponse extends js.Object {
  
  /**
    * The content hashes of the specified files that need to be uploaded to the
    * specified endpoint.
    */
  var uploadRequiredHashes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The URL to which the files should be uploaded, in the format:
    * &lt;br&gt;&quot;https://upload-firebasehosting.googleapis.com/upload/sites/&lt;var&gt;site-name&lt;/var&gt;/versions/&lt;var&gt;versionID&lt;/var&gt;/files&quot;.
    * &lt;br&gt;Perform a multipart `POST` of the Gzipped file contents to the
    * URL using a forward slash and the hash of the file appended to the end.
    */
  var uploadUrl: js.UndefOr[String] = js.native
}
object SchemaPopulateVersionFilesResponse {
  
  @scala.inline
  def apply(): SchemaPopulateVersionFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPopulateVersionFilesResponse]
  }
  
  @scala.inline
  implicit class SchemaPopulateVersionFilesResponseOps[Self <: SchemaPopulateVersionFilesResponse] (val x: Self) extends AnyVal {
    
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
    def setUploadRequiredHashesVarargs(value: String*): Self = this.set("uploadRequiredHashes", js.Array(value :_*))
    
    @scala.inline
    def setUploadRequiredHashes(value: js.Array[String]): Self = this.set("uploadRequiredHashes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadRequiredHashes: Self = this.set("uploadRequiredHashes", js.undefined)
    
    @scala.inline
    def setUploadUrl(value: String): Self = this.set("uploadUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadUrl: Self = this.set("uploadUrl", js.undefined)
  }
}
