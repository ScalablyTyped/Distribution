package typings.graphqlTools.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Left extends js.Object {
  var left: Schema
  var right: Schema
}

object Left {
  @scala.inline
  def apply(left: Schema, right: Schema): Left = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
}

