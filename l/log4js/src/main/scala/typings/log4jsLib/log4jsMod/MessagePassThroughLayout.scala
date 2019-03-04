package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagePassThroughLayout extends Layout {
  var `type`: log4jsLib.log4jsLibStrings.messagePassThrough
}

object MessagePassThroughLayout {
  @scala.inline
  def apply(`type`: log4jsLib.log4jsLibStrings.messagePassThrough): MessagePassThroughLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MessagePassThroughLayout]
  }
}

