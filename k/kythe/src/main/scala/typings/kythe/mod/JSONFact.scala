package typings.kythe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONFact extends js.Object {
  var fact_name: FactName
  var fact_value: String
  var source: VName
}

object JSONFact {
  @scala.inline
  def apply(fact_name: FactName, fact_value: String, source: VName): JSONFact = {
    val __obj = js.Dynamic.literal(fact_name = fact_name.asInstanceOf[js.Any], fact_value = fact_value.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONFact]
  }
}

