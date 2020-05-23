package typings.jestReporters.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clear extends js.Object {
  var clear: String
  var content: String
}

object Clear {
  @scala.inline
  def apply(clear: String, content: String): Clear = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clear]
  }
}

