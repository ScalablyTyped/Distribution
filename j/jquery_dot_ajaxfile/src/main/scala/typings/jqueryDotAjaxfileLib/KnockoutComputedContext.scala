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
    getDependenciesCount: js.Function0[scala.Double],
    isInitial: js.Function0[scala.Boolean],
    isSleeping: scala.Boolean
  ): KnockoutComputedContext = {
    val __obj = js.Dynamic.literal(getDependenciesCount = getDependenciesCount, isInitial = isInitial, isSleeping = isSleeping)
  
    __obj.asInstanceOf[KnockoutComputedContext]
  }
}

