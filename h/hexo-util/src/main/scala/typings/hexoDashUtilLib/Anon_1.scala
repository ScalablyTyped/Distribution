package typings
package hexoDashUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1 extends js.Object {
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var transform: js.UndefOr[
    hexoDashUtilLib.hexoDashUtilLibNumbers.`1` | hexoDashUtilLib.hexoDashUtilLibNumbers.`2`
  ] = js.undefined
}

object Anon_1 {
  @scala.inline
  def apply(
    separator: java.lang.String = null,
    transform: hexoDashUtilLib.hexoDashUtilLibNumbers.`1` | hexoDashUtilLib.hexoDashUtilLibNumbers.`2` = null
  ): Anon_1 = {
    val __obj = js.Dynamic.literal()
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_1]
  }
}

