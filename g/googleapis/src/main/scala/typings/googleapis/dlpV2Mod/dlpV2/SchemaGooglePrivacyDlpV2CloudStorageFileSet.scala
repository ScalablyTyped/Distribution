package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message representing a set of files in Cloud Storage.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CloudStorageFileSet extends js.Object {
  
  /**
    * The url, in the format `gs://&lt;bucket&gt;/&lt;path&gt;`. Trailing
    * wildcard in the path is allowed.
    */
  var url: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2CloudStorageFileSet {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CloudStorageFileSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CloudStorageFileSet]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CloudStorageFileSetOps[Self <: SchemaGooglePrivacyDlpV2CloudStorageFileSet] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
