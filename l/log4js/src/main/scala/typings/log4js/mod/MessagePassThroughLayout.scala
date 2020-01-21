package typings.log4js.mod

import typings.log4js.log4jsStrings.messagePassThrough
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePassThroughLayout extends Layout {
  var `type`: messagePassThrough
}

object MessagePassThroughLayout {
  @scala.inline
  def apply(`type`: messagePassThrough): MessagePassThroughLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagePassThroughLayout]
  }
}

