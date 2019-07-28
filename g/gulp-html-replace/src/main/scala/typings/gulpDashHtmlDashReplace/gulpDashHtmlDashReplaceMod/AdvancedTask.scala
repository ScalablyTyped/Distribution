package typings.gulpDashHtmlDashReplace.gulpDashHtmlDashReplaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvancedTask extends js.Object {
  var src: String | js.Array[String]
  var tpl: String
}

object AdvancedTask {
  @scala.inline
  def apply(src: String | js.Array[String], tpl: String): AdvancedTask = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any], tpl = tpl)
  
    __obj.asInstanceOf[AdvancedTask]
  }
}

