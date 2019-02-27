package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutReadonlyComputed[T] extends KnockoutReadonlyObservable[T] {
  /**
    * Returns the current number of dependencies of the computed observable.
    */
  def getDependenciesCount(): scala.Double = js.native
  /**
    * Returns whether the computed observable may be updated in the future. A computed observable is inactive if it has no dependencies.
    */
  def isActive(): scala.Boolean = js.native
}

