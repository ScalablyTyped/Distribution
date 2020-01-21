package typings.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mutation to apply to an entity.
  */
@js.native
trait SchemaMutation extends js.Object {
  /**
    * The version of the entity that this mutation is being applied to. If this
    * does not match the current version on the server, the mutation conflicts.
    */
  var baseVersion: js.UndefOr[String] = js.native
  /**
    * The key of the entity to delete. The entity may or may not already exist.
    * Must have a complete key path and must not be reserved/read-only.
    */
  var delete: js.UndefOr[SchemaKey] = js.native
  /**
    * The entity to insert. The entity must not already exist. The entity
    * key&#39;s final path element may be incomplete.
    */
  var insert: js.UndefOr[SchemaEntity] = js.native
  /**
    * The entity to update. The entity must already exist. Must have a complete
    * key path.
    */
  var update: js.UndefOr[SchemaEntity] = js.native
  /**
    * The entity to upsert. The entity may or may not already exist. The entity
    * key&#39;s final path element may be incomplete.
    */
  var upsert: js.UndefOr[SchemaEntity] = js.native
}

object SchemaMutation {
  @scala.inline
  def apply(
    baseVersion: String = null,
    delete: SchemaKey = null,
    insert: SchemaEntity = null,
    update: SchemaEntity = null,
    upsert: SchemaEntity = null
  ): SchemaMutation = {
    val __obj = js.Dynamic.literal()
    if (baseVersion != null) __obj.updateDynamic("baseVersion")(baseVersion.asInstanceOf[js.Any])
    if (delete != null) __obj.updateDynamic("delete")(delete.asInstanceOf[js.Any])
    if (insert != null) __obj.updateDynamic("insert")(insert.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (upsert != null) __obj.updateDynamic("upsert")(upsert.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMutation]
  }
}

