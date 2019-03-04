package typings
package log4jsLib.log4jsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardOutputAppender extends Appender {
  // (defaults to colouredLayout)
  var layout: js.UndefOr[Layout] = js.undefined
  var `type`: log4jsLib.log4jsLibStrings.stdout
}

object StandardOutputAppender {
  @scala.inline
  def apply(`type`: log4jsLib.log4jsLibStrings.stdout, layout: Layout = null): StandardOutputAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    __obj.asInstanceOf[StandardOutputAppender]
  }
}

