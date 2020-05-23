package typings.jsData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fields extends js.Object {
  var fields: js.Array[_]
  var ops: js.Array[_]
  var predicates: js.Array[_]
}

object Fields {
  @scala.inline
  def apply(fields: js.Array[_], ops: js.Array[_], predicates: js.Array[_]): Fields = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], predicates = predicates.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fields]
  }
}

