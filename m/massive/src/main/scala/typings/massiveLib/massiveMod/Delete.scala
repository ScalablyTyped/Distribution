package typings
package massiveLib.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a UPDATE query. */
@JSImport("massive", "Delete")
@js.native
class Delete protected () extends js.Object {
  /** Represents a DELETE query. */
  def this(source: Readable) = this()
  def this(source: Readable, criteria: AnyObject[_]) = this()
  def this(source: Readable, criteria: UUID) = this()
  def this(source: Readable, criteria: scala.Double) = this()
  def this(source: Readable, criteria: AnyObject[_], options: ResultProcessingOptions with InheritanceOptions) = this()
  def this(source: Readable, criteria: UUID, options: ResultProcessingOptions with InheritanceOptions) = this()
  def this(source: Readable, criteria: scala.Double, options: ResultProcessingOptions with InheritanceOptions) = this()
  /** Format this object into a SQL SELECT. */
  def format(): java.lang.String = js.native
}

