package typings.jsCookie.anon

import typings.jsCookie.mod.CookieReadConverter
import typings.jsCookie.mod.CookieWriteConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Read[TConv /* <: js.Object */] extends js.Object {
  var read: js.UndefOr[CookieReadConverter] = js.undefined
  var write: js.UndefOr[CookieWriteConverter[TConv]] = js.undefined
}

object Read {
  @scala.inline
  def apply[/* <: js.Object */ TConv](
    read: (/* value */ String, /* name */ String) => String = null,
    write: (/* value */ String | TConv, /* name */ String) => String = null
  ): Read[TConv] = {
    val __obj = js.Dynamic.literal()
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction2(read))
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction2(write))
    __obj.asInstanceOf[Read[TConv]]
  }
}

