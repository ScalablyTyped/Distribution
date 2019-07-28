package typings.jsDashCookie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsDashCookieMod {
  type CookieReadConverter = js.Function2[/* value */ String, /* name */ String, String]
  type CookieWriteConverter[T /* <: js.Object */] = js.Function2[/* value */ String | T, /* name */ String, String]
}
