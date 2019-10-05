package typings.jsDashCookie

import typings.jsDashCookie.jsDashCookieMod.CookieReadConverter
import typings.jsDashCookie.jsDashCookieMod.CookieWriteConverter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Read[TConv /* <: js.Object */] extends js.Object {
  var read: js.UndefOr[CookieReadConverter] = js.undefined
  var write: js.UndefOr[CookieWriteConverter[TConv]] = js.undefined
}

object Anon_Read {
  @scala.inline
  def apply[TConv /* <: js.Object */](
    read: (/* value */ String, /* name */ String) => String = null,
    write: (/* value */ String | TConv, /* name */ String) => String = null
  ): Anon_Read[TConv] = {
    val __obj = js.Dynamic.literal()
    if (read != null) __obj.updateDynamic("read")(js.Any.fromFunction2(read))
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction2(write))
    __obj.asInstanceOf[Anon_Read[TConv]]
  }
}

