package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColoredLayout extends Layout {
  var `type`: log4jsLib.log4jsLibStrings.colored | log4jsLib.log4jsLibStrings.coloured
}

object ColoredLayout {
  @scala.inline
  def apply(`type`: log4jsLib.log4jsLibStrings.colored | log4jsLib.log4jsLibStrings.coloured): ColoredLayout = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColoredLayout]
  }
}

