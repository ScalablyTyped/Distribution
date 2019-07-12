package typings
package kytheLib.kytheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONFact extends js.Object {
  var fact_name: FactName
  var fact_value: java.lang.String
  var source: VName
}

object JSONFact {
  @scala.inline
  def apply(fact_name: FactName, fact_value: java.lang.String, source: VName): JSONFact = {
    val __obj = js.Dynamic.literal(fact_name = fact_name, fact_value = fact_value, source = source)
  
    __obj.asInstanceOf[JSONFact]
  }
}

