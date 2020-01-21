package typings.log4js.mod

import typings.log4js.log4jsStrings.stdout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardOutputAppender extends Appender {
  // (defaults to colouredLayout)
  var layout: js.UndefOr[Layout] = js.undefined
  var `type`: stdout
}

object StandardOutputAppender {
  @scala.inline
  def apply(`type`: stdout, layout: Layout = null): StandardOutputAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardOutputAppender]
  }
}

