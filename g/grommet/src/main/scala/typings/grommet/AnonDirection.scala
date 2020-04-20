package typings.grommet

import typings.grommet.grommetStrings.asc
import typings.grommet.grommetStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDirection extends js.Object {
  var direction: asc | desc
  var property: String
}

object AnonDirection {
  @scala.inline
  def apply(direction: asc | desc, property: String): AnonDirection = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDirection]
  }
}

