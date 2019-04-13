package typings
package massiveLib.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadableSpecification extends js.Object {
  /** A Database. */
  var db: Database
  /** Whether the object is a materialized view (default false). */
  var is_matview: js.UndefOr[scala.Boolean] = js.undefined
  /** The table or view's name. */
  var name: java.lang.String
  /** The name of the schema owning the table or view. */
  var schema: java.lang.String
}

object ReadableSpecification {
  @scala.inline
  def apply(
    db: Database,
    name: java.lang.String,
    schema: java.lang.String,
    is_matview: js.UndefOr[scala.Boolean] = js.undefined
  ): ReadableSpecification = {
    val __obj = js.Dynamic.literal(db = db, name = name, schema = schema)
    if (!js.isUndefined(is_matview)) __obj.updateDynamic("is_matview")(is_matview)
    __obj.asInstanceOf[ReadableSpecification]
  }
}

