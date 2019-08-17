package typings.libraDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libraDashCoreMod {
  import typings.std.Uint8Array

  type AccountAddressLike = AccountAddress | String | Uint8Array
  type AccountStates = js.Array[AccountState]
  type Signature = Uint8Array
}
