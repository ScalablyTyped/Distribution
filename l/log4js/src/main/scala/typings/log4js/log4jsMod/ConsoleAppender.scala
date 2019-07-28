package typings.log4js.log4jsMod

import typings.log4js.log4jsStrings.console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsoleAppender extends Appender {
  // defaults to colouredLayout
  var layout: js.UndefOr[Layout] = js.undefined
  var `type`: console
}

object ConsoleAppender {
  @scala.inline
  def apply(`type`: console, layout: Layout = null): ConsoleAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    __obj.asInstanceOf[ConsoleAppender]
  }
}

