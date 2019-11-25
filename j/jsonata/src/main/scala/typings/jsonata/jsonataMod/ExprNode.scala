package typings.jsonata.jsonataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExprNode extends js.Object {
  var position: Double
  var `type`: String
  var value: js.Any
}

object ExprNode {
  @scala.inline
  def apply(position: Double, `type`: String, value: js.Any): ExprNode = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExprNode]
  }
}

