package typings
package knockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutReadonlyComputed[T] extends KnockoutReadonlyObservable[T] {
  def getDependenciesCount(): scala.Double = js.native
  def isActive(): scala.Boolean = js.native
}

