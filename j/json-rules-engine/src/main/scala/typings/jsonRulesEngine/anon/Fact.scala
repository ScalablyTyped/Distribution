package typings.jsonRulesEngine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fact extends js.Object {
  var fact: String
}

object Fact {
  @scala.inline
  def apply(fact: String): Fact = {
    val __obj = js.Dynamic.literal(fact = fact.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fact]
  }
}

