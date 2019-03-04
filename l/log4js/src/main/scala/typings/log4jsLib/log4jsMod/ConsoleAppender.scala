package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleAppender extends Appender {
  // defaults to colouredLayout
  var layout: js.UndefOr[Layout] = js.undefined
  var `type`: log4jsLib.log4jsLibStrings.console
}

object ConsoleAppender {
  @scala.inline
  def apply(`type`: log4jsLib.log4jsLibStrings.console, layout: Layout = null): ConsoleAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    __obj.asInstanceOf[ConsoleAppender]
  }
}

