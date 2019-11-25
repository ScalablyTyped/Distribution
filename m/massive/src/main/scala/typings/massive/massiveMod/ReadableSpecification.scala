package typings.massive.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableSpecification extends js.Object {
  /** A Database. */
  var db: Database
  /** Whether the object is a materialized view (default false). */
  var is_matview: js.UndefOr[Boolean] = js.undefined
  /** The table or view's name. */
  var name: String
  /** The name of the schema owning the table or view. */
  var schema: String
}

object ReadableSpecification {
  @scala.inline
  def apply(db: Database, name: String, schema: String, is_matview: js.UndefOr[Boolean] = js.undefined): ReadableSpecification = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    if (!js.isUndefined(is_matview)) __obj.updateDynamic("is_matview")(is_matview.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableSpecification]
  }
}

