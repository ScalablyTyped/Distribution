package typings.hexoUtil.anon

import typings.hexoUtil.hexoUtilNumbers.`1`
import typings.hexoUtil.hexoUtilNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Separator extends js.Object {
  var separator: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[`1` | `2`] = js.undefined
}

object Separator {
  @scala.inline
  def apply(separator: String = null, transform: `1` | `2` = null): Separator = {
    val __obj = js.Dynamic.literal()
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Separator]
  }
}

