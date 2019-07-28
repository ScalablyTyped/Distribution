package typings.log4js.log4jsMod

import typings.log4js.log4jsStrings.stderr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardErrorAppender extends Appender {
  // (defaults to colouredLayout)
  var layout: js.UndefOr[Layout] = js.undefined
  var `type`: stderr
}

object StandardErrorAppender {
  @scala.inline
  def apply(`type`: stderr, layout: Layout = null): StandardErrorAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    __obj.asInstanceOf[StandardErrorAppender]
  }
}

