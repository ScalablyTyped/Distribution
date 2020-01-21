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
  def apply(
    entities: js.Array[SchemaGoogleCloudDialogflowV2EntityTypeEntity] = null,
    entityOverrideMode: String = null,
    name: String = null
  ): SchemaGoogleCloudDialogflowV2SessionEntityType = {
    val __obj = js.Dynamic.literal()
    if (entities != null) __obj.updateDynamic("entities")(entities.asInstanceOf[js.Any])
    if (entityOverrideMode != null) __obj.updateDynamic("entityOverrideMode")(entityOverrideMode.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2SessionEntityType]
  }
}

