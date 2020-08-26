package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an entity type. Entity types serve as a tool for extracting
  * parameter values from natural language queries.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2beta1EntityType extends js.Object {
  /**
    * Optional. Indicates whether the entity type can be automatically
    * expanded.
    */
  var autoExpansionMode: js.UndefOr[String] = js.native
  /**
    * Required. The name of the entity type.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of entity entries associated with the entity
    * type.
    */
  var entities: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity]] = js.native
  /**
    * Required. Indicates the kind of entity type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The unique identifier of the entity type. Required for
    * EntityTypes.UpdateEntityType and EntityTypes.BatchUpdateEntityTypes
    * methods. Format: `projects/&lt;Project
    * ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2beta1EntityType {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2beta1EntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1EntityType]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2beta1EntityTypeOps[Self <: SchemaGoogleCloudDialogflowV2beta1EntityType] (val x: Self) extends AnyVal {
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
    def setEntitiesVarargs(value: SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity*): Self = this.set("entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: js.Array[SchemaGoogleCloudDialogflowV2beta1EntityTypeEntity]): Self = this.set("entities", value.asInstanceOf[js.Any])
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

