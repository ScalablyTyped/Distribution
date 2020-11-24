package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * General identifier of a data field in a storage service.
  */
@js.native
trait SchemaGooglePrivacyDlpV2FieldId extends js.Object {
  
  /**
    * Name describing the field.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaGooglePrivacyDlpV2FieldId {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2FieldId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2FieldId]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2FieldIdOps[Self <: SchemaGooglePrivacyDlpV2FieldId] (val x: Self) extends AnyVal {
    
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
