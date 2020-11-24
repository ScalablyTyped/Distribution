package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2BatchDeleteEntitiesRequest extends js.Object {
  
  /** Required. The reference `values` of the entities to delete. Note that these are not fully-qualified names, i.e. they don't start with `projects/`. */
  var entityValues: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The language used to access language-specific data. If not specified, the agent's default language is used. For more information, see [Multilingual intent and entity
    * data](https://cloud.google.com/dialogflow/docs/agents-multilingual#intent-entity).
    */
  var languageCode: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2BatchDeleteEntitiesRequest {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2BatchDeleteEntitiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2BatchDeleteEntitiesRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2BatchDeleteEntitiesRequestOps[Self <: GoogleCloudDialogflowV2BatchDeleteEntitiesRequest] (val x: Self) extends AnyVal {
    
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
    def setEntityValuesVarargs(value: String*): Self = this.set("entityValues", js.Array(value :_*))
    
    @scala.inline
    def setEntityValues(value: js.Array[String]): Self = this.set("entityValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityValues: Self = this.set("entityValues", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
  }
}
