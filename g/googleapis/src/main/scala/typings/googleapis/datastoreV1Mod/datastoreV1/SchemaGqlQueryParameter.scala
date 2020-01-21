package typings.googleapis.datastoreV1Mod.datastoreV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A binding parameter for a GQL query.
  */
@js.native
trait SchemaGqlQueryParameter extends js.Object {
  /**
    * A query cursor. Query cursors are returned in query result batches.
    */
  var cursor: js.UndefOr[String] = js.native
  /**
    * A value parameter.
    */
  var value: js.UndefOr[SchemaValue] = js.native
}

object SchemaGqlQueryParameter {
  @scala.inline
  def apply(cursor: String = null, value: SchemaValue = null): SchemaGqlQueryParameter = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGqlQueryParameter]
  }
}

