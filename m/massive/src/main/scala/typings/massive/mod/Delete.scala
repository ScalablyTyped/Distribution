package typings.massive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a UPDATE query. */
@JSImport("massive", "Delete")
@js.native
class Delete protected () extends js.Object {
  /** Represents a DELETE query. */
  def this(source: Readable) = this()
  def this(source: Readable, criteria: Double) = this()
  def this(source: Readable, criteria: AnyObject[_]) = this()
  def this(source: Readable, criteria: UUID) = this()
  def this(
    source: Readable,
    criteria: js.UndefOr[scala.Nothing],
    options: ResultProcessingOptions with InheritanceOptions
  ) = this()
  def this(source: Readable, criteria: Double, options: ResultProcessingOptions with InheritanceOptions) = this()
  def this(source: Readable, criteria: AnyObject[_], options: ResultProcessingOptions with InheritanceOptions) = this()
  def this(source: Readable, criteria: UUID, options: ResultProcessingOptions with InheritanceOptions) = this()
  /** Format this object into a SQL SELECT. */
  def format(): String = js.native
}

