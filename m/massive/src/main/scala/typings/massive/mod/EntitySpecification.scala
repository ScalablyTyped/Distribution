package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntitySpecification extends js.Object {
  /** A Database. */
  var db: Database
  /** Name of the loader that discovered the entity. */
  var loader: String
  /** The entity's name. */
  var name: String
  /** Path to the entity, if a file. */
  var path: String
  /** Entity's owning schema, if a database object. */
  var schema: String
}

object EntitySpecification {
  @scala.inline
  def apply(db: Database, loader: String, name: String, path: String, schema: String): EntitySpecification = {
    val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntitySpecification]
  }
}

