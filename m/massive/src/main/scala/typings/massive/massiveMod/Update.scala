package typings.massive.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a UPDATE query. */
@JSImport("massive", "Update")
@js.native
class Update protected () extends js.Object {
  /** Represents an UPDATE query. */
  def this(source: Readable, changes: AnyObject[_], criteria: AnyObject[_]) = this()
  def this(
    source: Readable,
    changes: AnyObject[_],
    criteria: AnyObject[_],
    options: ResultProcessingOptions with PersistenceUpdateDocOptions
  ) = this()
  /** Format this object into a SQL SELECT. */
  def format(): String = js.native
}

