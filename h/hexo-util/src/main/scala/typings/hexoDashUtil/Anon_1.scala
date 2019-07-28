package typings.hexoDashUtil

import typings.hexoDashUtil.hexoDashUtilNumbers.`1`
import typings.hexoDashUtil.hexoDashUtilNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_1 extends js.Object {
  var separator: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[`1` | `2`] = js.undefined
}

object Anon_1 {
  @scala.inline
  def apply(separator: String = null, transform: `1` | `2` = null): Anon_1 = {
    val __obj = js.Dynamic.literal()
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_1]
  }
}

