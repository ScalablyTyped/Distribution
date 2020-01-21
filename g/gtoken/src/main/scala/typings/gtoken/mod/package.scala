package typings.gtoken

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GetTokenCallback = js.Function2[
    /* err */ typings.std.Error | scala.Null, 
    /* token */ js.UndefOr[typings.gtoken.mod.TokenData], 
    scala.Unit
  ]
}
