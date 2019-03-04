package typings
package massiveLib.massiveMod.massiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntitySpecification extends js.Object {
  /** A Database. */
  var db: Database
  /** Name of the loader that discovered the entity. */
  var loader: java.lang.String
  /** The entity's name. */
  var name: java.lang.String
  /** Path to the entity, if a file. */
  var path: java.lang.String
  /** Entity's owning schema, if a database object. */
  var schema: java.lang.String
}

object EntitySpecification {
  @scala.inline
  def apply(
    db: Database,
    loader: java.lang.String,
    name: java.lang.String,
    path: java.lang.String,
    schema: java.lang.String
  ): EntitySpecification = {
    val __obj = js.Dynamic.literal(db = db, loader = loader, name = name, path = path, schema = schema)
  
    __obj.asInstanceOf[EntitySpecification]
  }
}

