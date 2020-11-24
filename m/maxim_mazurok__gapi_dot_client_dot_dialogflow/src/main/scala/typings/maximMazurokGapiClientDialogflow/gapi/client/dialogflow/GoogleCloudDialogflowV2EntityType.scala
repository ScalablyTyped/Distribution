package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2EntityType extends js.Object {
  
  /** Optional. Indicates whether the entity type can be automatically expanded. */
  var autoExpansionMode: js.UndefOr[String] = js.native
  
  /** Required. The name of the entity type. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Optional. Enables fuzzy entity extraction during classification. */
  var enableFuzzyExtraction: js.UndefOr[Boolean] = js.native
  
  /** Optional. The collection of entity entries associated with the entity type. */
  var entities: js.UndefOr[js.Array[GoogleCloudDialogflowV2EntityTypeEntity]] = js.native
  
  /** Required. Indicates the kind of entity type. */
  var kind: js.UndefOr[String] = js.native
  
  /** The unique identifier of the entity type. Required for EntityTypes.UpdateEntityType and EntityTypes.BatchUpdateEntityTypes methods. Format: `projects//agent/entityTypes/`. */
  var name: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2EntityType {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2EntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2EntityType]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2EntityTypeOps[Self <: GoogleCloudDialogflowV2EntityType] (val x: Self) extends AnyVal {
    
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
    def setAutoExpansionMode(value: String): Self = this.set("autoExpansionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoExpansionMode: Self = this.set("autoExpansionMode", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setEnableFuzzyExtraction(value: Boolean): Self = this.set("enableFuzzyExtraction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableFuzzyExtraction: Self = this.set("enableFuzzyExtraction", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: GoogleCloudDialogflowV2EntityTypeEntity*): Self = this.set("entities", js.Array(value :_*))
    
    @scala.inline
    def setEntities(value: js.Array[GoogleCloudDialogflowV2EntityTypeEntity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
