package typings.log4js.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAppender
  extends /* key */ StringDictionary[js.Any]
     with Appender {
  var `type`: String | AppenderModule = js.native
}

object CustomAppender {
  @scala.inline
  def apply(`type`: String | AppenderModule): CustomAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAppender]
  }
  @scala.inline
  implicit class CustomAppenderOps[Self <: CustomAppender] (val x: Self) extends AnyVal {
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
    def setType(value: String | AppenderModule): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

