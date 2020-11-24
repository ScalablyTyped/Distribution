package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2BatchUpdateEntitiesRequest extends js.Object {
  
  /** Required. The entities to update or create. */
  var entities: js.UndefOr[js.Array[GoogleCloudDialogflowV2EntityTypeEntity]] = js.native
  
  /**
    * Optional. The language used to access language-specific data. If not specified, the agent's default language is used. For more information, see [Multilingual intent and entity
    * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /** Optional. The mask to control which fields get updated. */
  var updateMask: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2BatchUpdateEntitiesRequest {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2BatchUpdateEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2BatchUpdateEntitiesRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2BatchUpdateEntitiesRequestOps[Self <: GoogleCloudDialogflowV2BatchUpdateEntitiesRequest] (val x: Self) extends AnyVal {
    
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
    def setEntitiesVarargs(value: GoogleCloudDialogflowV2EntityTypeEntity*): Self = this.set("entities", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: js.Array[GoogleCloudDialogflowV2EntityTypeEntity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = this.set("updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMask: Self = this.set("updateMask", js.undefined)
  }
}
