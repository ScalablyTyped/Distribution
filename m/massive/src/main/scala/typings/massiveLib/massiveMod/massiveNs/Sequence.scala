package typings
package massiveLib.massiveMod.massiveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Sequence extends js.Object {
  /**
           * Get the last value the sequence returned.
           * The return value will be a stringified number.
           */
  def lastValue(): js.Promise[java.lang.String]
  /**
           * Increment the sequence counter and return the next value.
           * The return value will be a stringified number.
           */
  def nextValue(): js.Promise[java.lang.String]
  /** Reset the sequence. */
  def reset(initialValue: scala.Double): js.Promise[scala.Unit]
}

