package typings.jestEach.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arguments extends js.Object {
  var arguments: js.Array[_]
  var title: String
}

object Arguments {
  @scala.inline
  def apply(arguments: js.Array[_], title: String): Arguments = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arguments]
  }
}

