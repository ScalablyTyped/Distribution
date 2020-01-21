package typings.jqueryAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutComputed[T]
  extends KnockoutObservable[T]
     with KnockoutComputedFunctions[T] {
  var fn: KnockoutComputedFunctions[_] = js.native
  def dispose(): Unit = js.native
  def getDependenciesCount(): Double = js.native
  def isActive(): Boolean = js.native
}

