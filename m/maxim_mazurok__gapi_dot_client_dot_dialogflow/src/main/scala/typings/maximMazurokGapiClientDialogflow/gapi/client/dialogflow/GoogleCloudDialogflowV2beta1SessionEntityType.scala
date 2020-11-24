package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1SessionEntityType extends js.Object {
  
  /** Required. The collection of entities associated with this session entity type. */
  var entities: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1EntityTypeEntity]] = js.native
  
  /** Required. Indicates whether the additional data should override or supplement the custom entity type definition. */
  var entityOverrideMode: js.UndefOr[String] = js.native
  
  /**
    * Required. The unique identifier of this session entity type. Supported formats: - `projects//agent/sessions//entityTypes/` - `projects//locations//agent/sessions//entityTypes/` -
    * `projects//agent/environments//users//sessions//entityTypes/` - `projects//locations//agent/environments/ /users//sessions//entityTypes/` If `Location ID` is not specified we assume
    * default 'us' location. If `Environment ID` is not specified, we assume default 'draft' environment. If `User ID` is not specified, we assume default '-' user. `` must be the display
    * name of an existing entity type in the same agent that will be overridden or supplemented.
    */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1SessionEntityType {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1SessionEntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1SessionEntityType]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1SessionEntityTypeOps[Self <: GoogleCloudDialogflowV2beta1SessionEntityType] (val x: Self) extends AnyVal {
    
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
    def setEntitiesVarargs(value: GoogleCloudDialogflowV2beta1EntityTypeEntity*): Self = this.set("entities", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: js.Array[GoogleCloudDialogflowV2beta1EntityTypeEntity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    
    @scala.inline
    def setEntityOverrideMode(value: String): Self = this.set("entityOverrideMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityOverrideMode: Self = this.set("entityOverrideMode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
