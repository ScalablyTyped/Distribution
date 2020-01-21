package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WritableSpecification extends js.Object {
  /** A Database. */
  var db: Database
  /** The table or view's name. */
  var name: String
  /** The table's primary key. */
  var pk: String
  /** The name of the schema owning the table. */
  var schema: String
}

object WritableSpecification {
  @scala.inline
  def apply(db: Database, name: String, pk: String, schema: String): WritableSpecification = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pk = pk.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WritableSpecification]
  }
}

