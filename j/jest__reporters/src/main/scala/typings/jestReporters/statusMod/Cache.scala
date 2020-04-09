package typings.jestReporters.statusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  var clear: String
  var content: String
}

object Cache {
  @scala.inline
  def apply(clear: String, content: String): Cache = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Cache]
  }
}

