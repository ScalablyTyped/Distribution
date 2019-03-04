package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutObservableFunctions[T] extends js.Object {
  /**
    * Used by knockout to decide if value of observable has changed and should notify subscribers. Returns true if instances are primitives, and false if are objects.
    * If your observable holds an object, this can be overwritten to return equality based on your needs.
    * @param a previous value.
    * @param b next value.
    */
  def equalityComparer(a: T, b: T): scala.Boolean
}

object KnockoutObservableFunctions {
  @scala.inline
  def apply[T](equalityComparer: js.Function2[T, T, scala.Boolean]): KnockoutObservableFunctions[T] = {
    val __obj = js.Dynamic.literal(equalityComparer = equalityComparer)
  
    __obj.asInstanceOf[KnockoutObservableFunctions[T]]
  }
}

