package typings.knockoutPreRendered

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutComputedContext extends js.Object {
  var isSleeping: Boolean
  def getDependenciesCount(): Double
  def isInitial(): Boolean
}

object KnockoutComputedContext {
  @scala.inline
  def apply(getDependenciesCount: () => Double, isInitial: () => Boolean, isSleeping: Boolean): KnockoutComputedContext = {
    val __obj = js.Dynamic.literal(getDependenciesCount = js.Any.fromFunction0(getDependenciesCount), isInitial = js.Any.fromFunction0(isInitial), isSleeping = isSleeping.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KnockoutComputedContext]
  }
}

