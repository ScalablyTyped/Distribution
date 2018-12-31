package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutComputedDefine[T] extends KnockoutComputedOptions[T] {
  /**
    * A function that is used to evaluate the computed observable’s current value.
    */
  def read(): T
}

