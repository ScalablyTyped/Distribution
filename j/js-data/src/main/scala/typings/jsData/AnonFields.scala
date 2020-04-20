package typings.jsData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFields extends js.Object {
  var fields: js.Array[_]
  var ops: js.Array[_]
  var predicates: js.Array[_]
}

object AnonFields {
  @scala.inline
  def apply(fields: js.Array[_], ops: js.Array[_], predicates: js.Array[_]): AnonFields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], predicates = predicates.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFields]
  }
}

