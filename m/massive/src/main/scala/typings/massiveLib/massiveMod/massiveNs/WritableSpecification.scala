package typings
package massiveLib.massiveMod.massiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WritableSpecification extends js.Object {
  /** A Database. */
  var db: Database
  /** The table or view's name. */
  var name: java.lang.String
  /** The table's primary key. */
  var pk: java.lang.String
  /** The name of the schema owning the table. */
  var schema: java.lang.String
}

object WritableSpecification {
  @scala.inline
  def apply(db: Database, name: java.lang.String, pk: java.lang.String, schema: java.lang.String): WritableSpecification = {
    val __obj = js.Dynamic.literal(db = db, name = name, pk = pk, schema = schema)
  
    __obj.asInstanceOf[WritableSpecification]
  }
}

