package typings.log4js.mod

import typings.log4js.log4jsStrings.colored
import typings.log4js.log4jsStrings.coloured
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColoredLayout extends Layout {
  var `type`: colored | coloured = js.native
}

object ColoredLayout {
  @scala.inline
  def apply(`type`: colored | coloured): ColoredLayout = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColoredLayout]
  }
  @scala.inline
  implicit class ColoredLayoutOps[Self <: ColoredLayout] (val x: Self) extends AnyVal {
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
    def setType(value: colored | coloured): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

