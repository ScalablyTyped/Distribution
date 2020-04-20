package typings.jsonRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EngineOptions extends js.Object {
  var allowUndefinedFacts: Boolean
}

object EngineOptions {
  @scala.inline
  def apply(allowUndefinedFacts: Boolean): EngineOptions = {
    val __obj = js.Dynamic.literal(allowUndefinedFacts = allowUndefinedFacts.asInstanceOf[js.Any])
    __obj.asInstanceOf[EngineOptions]
  }
}

