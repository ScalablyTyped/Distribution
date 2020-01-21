package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a INSERT query. */
@JSImport("massive", "Insert")
@js.native
class Insert protected () extends js.Object {
  def this(source: Readable, record: js.Array[_]) = this()
  /** Represents an INSERT query. */
  def this(source: Readable, record: AnyObject[_]) = this()
  def this(
    source: Readable,
    record: js.Array[_],
    options: ResultProcessingOptions with PersistenceInsertOptions
  ) = this()
  def this(
    source: Readable,
    record: AnyObject[_],
    options: ResultProcessingOptions with PersistenceInsertOptions
  ) = this()
  /** Format this object into a SQL SELECT. */
  def format(): String = js.native
}

