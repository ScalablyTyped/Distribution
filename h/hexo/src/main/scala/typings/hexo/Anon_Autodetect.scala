package typings.hexo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Autodetect extends js.Object {
  val auto_detect: Boolean
  val enable: Boolean
  val line_number: Boolean
  val tab_replace: String | Null
}

object Anon_Autodetect {
  @scala.inline
  def apply(auto_detect: Boolean, enable: Boolean, line_number: Boolean, tab_replace: String = null): Anon_Autodetect = {
    val __obj = js.Dynamic.literal(auto_detect = auto_detect.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], line_number = line_number.asInstanceOf[js.Any])
    if (tab_replace != null) __obj.updateDynamic("tab_replace")(tab_replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Autodetect]
  }
}

