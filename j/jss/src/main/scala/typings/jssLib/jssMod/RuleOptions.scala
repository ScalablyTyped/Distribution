package typings
package jssLib.jssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleOptions extends js.Object {
  var className: java.lang.String
  var index: scala.Double
}

object RuleOptions {
  @scala.inline
  def apply(className: java.lang.String, index: scala.Double): RuleOptions = {
    val __obj = js.Dynamic.literal(className = className, index = index)
  
    __obj.asInstanceOf[RuleOptions]
  }
}

