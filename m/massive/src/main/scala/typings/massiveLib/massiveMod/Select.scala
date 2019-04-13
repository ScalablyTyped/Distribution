package typings
package massiveLib.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a SELECT query. */
@JSImport("massive", "Select")
@js.native
class Select protected () extends js.Object {
  /** Represents an SELECT query. */
  def this(source: Readable, criteria: AnyObject[_]) = this()
  def this(source: Readable, criteria: UUID) = this()
  def this(source: Readable, criteria: AnyObject[_], options: RetrievalOptions with ResultProcessingOptions) = this()
  def this(source: Readable, criteria: UUID, options: RetrievalOptions with ResultProcessingOptions) = this()
  /** Format this object into a SQL SELECT. */
  def format(): java.lang.String = js.native
}

