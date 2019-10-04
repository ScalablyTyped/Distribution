package typings.jsonDashRulesDashEngine.jsonDashRulesDashEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FactOptions extends js.Object {
  var cache: Boolean
  var priority: Double
}

object FactOptions {
  @scala.inline
  def apply(cache: Boolean, priority: Double): FactOptions = {
    val __obj = js.Dynamic.literal(cache = cache, priority = priority)
  
    __obj.asInstanceOf[FactOptions]
  }
}

