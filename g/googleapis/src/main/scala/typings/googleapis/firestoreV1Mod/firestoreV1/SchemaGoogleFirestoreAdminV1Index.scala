package typings.googleapis.firestoreV1Mod.firestoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Firestore indexes enable simple and complex queries against documents
  * in a database.
  */
@js.native
trait SchemaGoogleFirestoreAdminV1Index extends js.Object {
  /**
    * The fields supported by this index.  For composite indexes, this is
    * always 2 or more fields. The last field entry is always for the field
    * path `__name__`. If, on creation, `__name__` was not specified as the
    * last field, it will be added automatically with the same direction as
    * that of the last field defined. If the final field in a composite index
    * is not directional, the `__name__` will be ordered ASCENDING (unless
    * explicitly specified).  For single field indexes, this will always be
    * exactly one entry with a field path equal to the field path of the
    * associated field.
    */
  var fields: js.UndefOr[js.Array[SchemaGoogleFirestoreAdminV1IndexField]] = js.native
  /**
    * Output only. A server defined name for this index. The form of this name
    * for composite indexes will be:
    * `projects/{project_id}/databases/{database_id}/collectionGroups/{collection_id}/indexes/{composite_index_id}`
    * For single field indexes, this field will be empty.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Indexes with a collection query scope specified allow queries against a
    * collection that is the child of a specific document, specified at query
    * time, and that has the same collection id.  Indexes with a collection
    * group query scope specified allow queries against all collections
    * descended from a specific document, specified at query time, and that
    * have the same collection id as this index.
    */
  var queryScope: js.UndefOr[String] = js.native
  /**
    * Output only. The serving state of the index.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaGoogleFirestoreAdminV1Index {
  @scala.inline
  def apply(
    fields: js.Array[SchemaGoogleFirestoreAdminV1IndexField] = null,
    name: String = null,
    queryScope: String = null,
    state: String = null
  ): SchemaGoogleFirestoreAdminV1Index = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (queryScope != null) __obj.updateDynamic("queryScope")(queryScope.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleFirestoreAdminV1Index]
  }
}

