package typings.jss.jssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleOptions extends js.Object {
  var className: String
  var index: Double
}

object RuleOptions {
  @scala.inline
  def apply(className: String, index: Double): RuleOptions = {
    val __obj = js.Dynamic.literal(className = className, index = index)
  
    __obj.asInstanceOf[RuleOptions]
  }
}

