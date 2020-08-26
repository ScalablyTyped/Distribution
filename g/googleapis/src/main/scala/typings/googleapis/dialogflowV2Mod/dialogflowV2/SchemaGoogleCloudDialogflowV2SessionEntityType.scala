package typings.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a session entity type.  Extends or replaces a developer entity
  * type at the user session level (we refer to the entity types defined at the
  * agent level as &quot;developer entity types&quot;).  Note: session entity
  * types apply to all queries, regardless of the language.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2SessionEntityType extends js.Object {
  /**
    * Required. The collection of entities associated with this session entity
    * type.
    */
  var entities: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2EntityTypeEntity]] = js.native
  /**
    * Required. Indicates whether the additional data should override or
    * supplement the developer entity type definition.
    */
  var entityOverrideMode: js.UndefOr[String] = js.native
  /**
    * Required. The unique identifier of this session entity type. Format:
    * `projects/&lt;Project ID&gt;/agent/sessions/&lt;Session
    * ID&gt;/entityTypes/&lt;Entity Type Display Name&gt;`.  `&lt;Entity Type
    * Display Name&gt;` must be the display name of an existing entity type in
    * the same agent that will be overridden or supplemented.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2SessionEntityType {
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2SessionEntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SessionEntityType]
  }
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2SessionEntityTypeOps[Self <: SchemaGoogleCloudDialogflowV2SessionEntityType] (val x: Self) extends AnyVal {
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
    def setEntitiesVarargs(value: SchemaGoogleCloudDialogflowV2EntityTypeEntity*): Self = this.set("entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: js.Array[SchemaGoogleCloudDialogflowV2EntityTypeEntity]): Self = this.set("entities", value.asInstanceOf[js.Any])
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

