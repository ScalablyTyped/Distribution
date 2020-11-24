package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * InfoType description.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InfoTypeDescription extends js.Object {
  
  /**
    * Description of the infotype. Translated when language is provided in the
    * request.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Human readable form of the infoType name.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * Internal name of the infoType.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Which parts of the API supports this InfoType.
    */
  var supportedBy: js.UndefOr[js.Array[String]] = js.native
}
object SchemaGooglePrivacyDlpV2InfoTypeDescription {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InfoTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeDescription]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InfoTypeDescriptionOps[Self <: SchemaGooglePrivacyDlpV2InfoTypeDescription] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSupportedByVarargs(value: String*): Self = this.set("supportedBy", js.Array(value :_*))
    
    @scala.inline
    def setSupportedBy(value: js.Array[String]): Self = this.set("supportedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedBy: Self = this.set("supportedBy", js.undefined)
  }
}
