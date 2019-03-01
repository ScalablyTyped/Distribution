package typings
package gulpDashConcatLib.gulpDashConcatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var newLine: java.lang.String
}

object IOptions {
  @scala.inline
  def apply(newLine: java.lang.String): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("newLine")(newLine)
    __obj.asInstanceOf[IOptions]
  }
}

