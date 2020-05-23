package typings.graphqlTools.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait From extends js.Object {
  var from: js.Array[String]
  var to: js.Array[String]
}

object From {
  @scala.inline
  def apply(from: js.Array[String], to: js.Array[String]): From = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[From]
  }
}

