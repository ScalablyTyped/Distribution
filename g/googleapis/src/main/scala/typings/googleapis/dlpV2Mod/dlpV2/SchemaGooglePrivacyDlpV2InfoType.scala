package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Type of information detected by the API.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InfoType extends js.Object {
  
  /**
    * Name of the information type. Either a name of your choosing when
    * creating a CustomInfoType, or one of the names listed at
    * https://cloud.google.com/dlp/docs/infotypes-reference when specifying a
    * built-in type. InfoType names should conform to the pattern
    * [a-zA-Z0-9_]{1,64}.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2InfoType {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InfoType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoType]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InfoTypeOps[Self <: SchemaGooglePrivacyDlpV2InfoType] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
