package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of fetching an entity from Datastore.
  */
@js.native
trait SchemaEntityResult extends js.Object {
  /**
    * A cursor that points to the position after the result entity. Set only
    * when the `EntityResult` is part of a `QueryResultBatch` message.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * The resulting entity.
    */
  var entity: js.UndefOr[SchemaEntity] = js.native
  /**
    * The version of the entity, a strictly positive number that monotonically
    * increases with changes to the entity.  This field is set for `FULL`
    * entity results.  For missing entities in `LookupResponse`, this is the
    * version of the snapshot that was used to look up the entity, and it is
    * always set except for eventually consistent reads.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaEntityResult {
  @scala.inline
  def apply(cursor: String = null, entity: SchemaEntity = null, version: String = null): SchemaEntityResult = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEntityResult]
  }
}

