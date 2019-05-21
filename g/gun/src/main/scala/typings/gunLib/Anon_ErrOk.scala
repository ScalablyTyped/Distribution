package typings
package gunLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrOk extends js.Object {
  var err: js.UndefOr[scala.Nothing] = js.undefined
  var ok: java.lang.String
}

object Anon_ErrOk {
  @scala.inline
  def apply(ok: java.lang.String, err: js.UndefOr[scala.Nothing] = js.undefined): Anon_ErrOk = {
    val __obj = js.Dynamic.literal(ok = ok)
    if (!js.isUndefined(err)) __obj.updateDynamic("err")(err)
    __obj.asInstanceOf[Anon_ErrOk]
  }
}

