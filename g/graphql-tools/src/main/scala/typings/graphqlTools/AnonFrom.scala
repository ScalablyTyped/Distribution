package typings.graphqlTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFrom extends js.Object {
  var from: js.Array[String]
  var to: js.Array[String]
}

object AnonFrom {
  @scala.inline
  def apply(from: js.Array[String], to: js.Array[String]): AnonFrom = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFrom]
  }
}

