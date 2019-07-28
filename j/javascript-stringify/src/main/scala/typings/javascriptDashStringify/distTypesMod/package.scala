package typings.javascriptDashStringify

import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distTypesMod {
  type Next = js.Function2[/* value */ js.Any, /* key */ js.UndefOr[PropertyKey], js.UndefOr[String]]
  type ToString = js.Function3[/* value */ js.Any, /* space */ String, /* next */ Next, js.UndefOr[String]]
}
