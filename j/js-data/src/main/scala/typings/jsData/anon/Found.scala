package typings.jsData.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Found extends js.Object {
  var found: scala.Boolean
  var index: js.Any
}

object Found {
  @scala.inline
  def apply(found: scala.Boolean, index: js.Any): Found = {
    val __obj = js.Dynamic.literal(found = found.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[Found]
  }
}

