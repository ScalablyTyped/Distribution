package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardErrorAppender extends Appender {
  // (defaults to colouredLayout)
  var layout: js.UndefOr[Layout] = js.undefined
  var `type`: log4jsLib.log4jsLibStrings.stderr
}

object StandardErrorAppender {
  @scala.inline
  def apply(`type`: log4jsLib.log4jsLibStrings.stderr, layout: Layout = null): StandardErrorAppender = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    __obj.asInstanceOf[StandardErrorAppender]
  }
}

