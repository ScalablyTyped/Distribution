package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Message representing a single file or path in Cloud Storage.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CloudStoragePath extends js.Object {
  
  /**
    * A url representing a file or path (no wildcards) in Cloud Storage.
    * Example: gs://[BUCKET_NAME]/dictionary.txt
    */
  var path: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2CloudStoragePath {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CloudStoragePath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CloudStoragePath]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CloudStoragePathOps[Self <: SchemaGooglePrivacyDlpV2CloudStoragePath] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
}
