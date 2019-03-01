package typings
package hibpLib.hibpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PwnedPasswordSuffix extends js.Object {
  var count: scala.Double
  var suffix: java.lang.String
}

object PwnedPasswordSuffix {
  @scala.inline
  def apply(count: scala.Double, suffix: java.lang.String): PwnedPasswordSuffix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[PwnedPasswordSuffix]
  }
}

