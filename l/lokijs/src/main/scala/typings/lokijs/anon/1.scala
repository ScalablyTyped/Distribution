package typings.lokijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1` extends js.Object {
  var serializationMethod: js.UndefOr[String | Null] = js.undefined
}

object `1` {
  @scala.inline
  def apply(serializationMethod: js.UndefOr[Null | String] = js.undefined): `1` = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(serializationMethod)) __obj.updateDynamic("serializationMethod")(serializationMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
}

