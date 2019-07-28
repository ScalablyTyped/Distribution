package typings.libraDashCore

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libraDashCoreMod {
  type AccountAddressLike = AccountAddress | String | Uint8Array
  type AccountStates = js.Array[AccountState]
  type Signature = Uint8Array
}
