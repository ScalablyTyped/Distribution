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

