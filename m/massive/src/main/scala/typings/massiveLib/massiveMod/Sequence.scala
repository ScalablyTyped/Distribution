package typings
package massiveLib.massiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("massive", "Sequence")
@js.native
class Sequence protected () extends js.Object {
  /** A database sequence. */
  def this(db: Database, name: java.lang.String, schema: java.lang.String) = this()
  /**
    * Get the last value the sequence returned.
    * The return value will be a stringified number.
    */
  def lastValue(): js.Promise[java.lang.String] = js.native
  /**
    * Increment the sequence counter and return the next value.
    * The return value will be a stringified number.
    */
  def nextValue(): js.Promise[java.lang.String] = js.native
  /** Reset the sequence. */
  def reset(initialValue: scala.Double): js.Promise[scala.Unit] = js.native
}

