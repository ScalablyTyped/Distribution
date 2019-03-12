package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutComputedContext extends js.Object {
  var isSleeping: scala.Boolean
  def getDependenciesCount(): scala.Double
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

