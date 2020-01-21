package typings.graphqlTools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeft extends js.Object {
  var left: AnonSchema
  var right: AnonSchema
}

object AnonLeft {
  @scala.inline
  def apply(left: AnonSchema, right: AnonSchema): AnonLeft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLeft]
  }
}

