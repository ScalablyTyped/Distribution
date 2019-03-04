package typings
package hexoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Autodetect extends js.Object {
  val auto_detect: scala.Boolean
  val enable: scala.Boolean
  val line_number: scala.Boolean
  val tab_replace: java.lang.String | scala.Null
}

object Anon_Autodetect {
  @scala.inline
  def apply(
    auto_detect: scala.Boolean,
    enable: scala.Boolean,
    line_number: scala.Boolean,
    tab_replace: java.lang.String = null
  ): Anon_Autodetect = {
    val __obj = js.Dynamic.literal(auto_detect = auto_detect, enable = enable, line_number = line_number)
    if (tab_replace != null) __obj.updateDynamic("tab_replace")(tab_replace)
    __obj.asInstanceOf[Anon_Autodetect]
  }
}

