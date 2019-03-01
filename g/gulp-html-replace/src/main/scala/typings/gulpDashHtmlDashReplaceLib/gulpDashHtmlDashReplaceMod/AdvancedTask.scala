package typings
package gulpDashHtmlDashReplaceLib.gulpDashHtmlDashReplaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdvancedTask extends js.Object {
  var src: java.lang.String | js.Array[java.lang.String]
  var tpl: java.lang.String
}

object AdvancedTask {
  @scala.inline
  def apply(src: java.lang.String | js.Array[java.lang.String], tpl: java.lang.String): AdvancedTask = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    __obj.updateDynamic("tpl")(tpl)
    __obj.asInstanceOf[AdvancedTask]
  }
}

