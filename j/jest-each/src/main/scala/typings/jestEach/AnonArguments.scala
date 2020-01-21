package typings.jestEach

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArguments extends js.Object {
  var arguments: js.Array[_]
  var title: String
}

object AnonArguments {
  @scala.inline
  def apply(arguments: js.Array[_], title: String): AnonArguments = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArguments]
  }
}

