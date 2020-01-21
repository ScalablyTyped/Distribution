package typings.instabugReactnative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Survey extends js.Object {
  var title: String
}

object Survey {
  @scala.inline
  def apply(title: String): Survey = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Survey]
  }
}

