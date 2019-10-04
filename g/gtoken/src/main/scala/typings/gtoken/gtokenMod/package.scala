package typings.gtoken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gtokenMod {
  import typings.std.Error

  type GetTokenCallback = js.Function2[/* err */ Error | Null, /* token */ js.UndefOr[TokenData], Unit]
}
