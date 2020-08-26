package typings.kythe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONFact extends js.Object {
  var fact_name: FactName = js.native
  var fact_value: String = js.native
  var source: VName = js.native
}

object JSONFact {
  @scala.inline
  def apply(fact_name: FactName, fact_value: String, source: VName): JSONFact = {
    val __obj = js.Dynamic.literal(fact_name = fact_name.asInstanceOf[js.Any], fact_value = fact_value.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONFact]
  }
  @scala.inline
  implicit class JSONFactOps[Self <: JSONFact] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFact_name(value: FactName): Self = this.set("fact_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setFact_value(value: String): Self = this.set("fact_value", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: VName): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

