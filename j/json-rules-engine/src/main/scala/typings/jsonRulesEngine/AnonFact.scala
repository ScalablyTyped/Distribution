package typings.jsonRulesEngine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFact extends js.Object {
  var fact: String
}

object AnonFact {
  @scala.inline
  def apply(fact: String): AnonFact = {
    val __obj = js.Dynamic.literal(fact = fact.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFact]
  }
}

