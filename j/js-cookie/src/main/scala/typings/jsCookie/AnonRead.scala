package typings.jsCookie

import typings.jsCookie.mod.CookieReadConverter
import typings.jsCookie.mod.CookieWriteConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRead[TConv /* <: js.Object */] extends js.Object {
  var read: js.UndefOr[CookieReadConverter] = js.undefined
  var write: js.UndefOr[CookieWriteConverter[TConv]] = js.undefined
}

object AnonRead {
  @scala.inline
  def apply[TConv /* <: js.Object */](
    read: (/* value */ String, /* name */ String) => String = null,
    write: (/* value */ String | TConv, /* name */ String) => String = null
  ): AnonRead[TConv] = {
    val __obj = js.Dynamic.literal()
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction2(read))
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction2(write))
    __obj.asInstanceOf[AnonRead[TConv]]
  }
}

