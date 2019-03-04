package typings
package jsendLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  var code: js.UndefOr[scala.Double] = js.undefined
  var data: js.UndefOr[js.Object] = js.undefined
  var message: java.lang.String
}

object Anon_Code {
  @scala.inline
  def apply(message: java.lang.String, code: scala.Int | scala.Double = null, data: js.Object = null): Anon_Code = {
    val __obj = js.Dynamic.literal(message = message)
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[Anon_Code]
  }
}

