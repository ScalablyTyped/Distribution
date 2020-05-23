package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.operator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operator extends js.Object {
  var id: String
  var name: String
  var `type`: operator
}

object Operator {
  @scala.inline
  def apply(id: String, name: String, `type`: operator): Operator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operator]
  }
}

