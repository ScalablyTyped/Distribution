package typings.hexo.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Autodetect extends js.Object {
  val auto_detect: Boolean
  val enable: Boolean
  val line_number: Boolean
  val tab_replace: String | Null
}

object Autodetect {
  @scala.inline
  def apply(auto_detect: Boolean, enable: Boolean, line_number: Boolean, tab_replace: String = null): Autodetect = {
    val __obj = js.Dynamic.literal(auto_detect = auto_detect.asInstanceOf[js.Any], enable = enable.asInstanceOf[js.Any], line_number = line_number.asInstanceOf[js.Any], tab_replace = tab_replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autodetect]
  }
}

