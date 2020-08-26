package typings.log4js.mod

import typings.log4js.log4jsStrings.console
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsoleAppender extends Appender {
  // defaults to colouredLayout
  var layout: js.UndefOr[Layout] = js.native
  var `type`: console = js.native
}

object ConsoleAppender {
  @scala.inline
  def apply(`type`: console): ConsoleAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConsoleAppender]
  }
  @scala.inline
  implicit class ConsoleAppenderOps[Self <: ConsoleAppender] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: console): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
  }
  
}

