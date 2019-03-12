package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutComputedContext extends js.Object {
  var isSleeping: scala.Boolean
  /**
    * Returns the number of dependencies of the computed observable detected so far during the current evaluation.
    */
  def getDependenciesCount(): scala.Double
  /**
    * A function that returns true if called during the first ever evaluation of the current computed observable, or false otherwise.
    * For pure computed observables, isInitial() is always undefined.
    */
  def isInitial(): scala.Boolean
}

object KnockoutComputedContext {
  @scala.inline
  def apply(
    getDependenciesCount: () => scala.Double,
    isInitial: () => scala.Boolean,
    isSleeping: scala.Boolean
  ): KnockoutComputedContext = {
    val __obj = js.Dynamic.literal(getDependenciesCount = js.Any.fromFunction0(getDependenciesCount), isInitial = js.Any.fromFunction0(isInitial), isSleeping = isSleeping)
  
    __obj.asInstanceOf[KnockoutComputedContext]
  }
}

