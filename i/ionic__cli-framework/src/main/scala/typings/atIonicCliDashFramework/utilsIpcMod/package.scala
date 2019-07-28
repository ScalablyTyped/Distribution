package typings.atIonicCliDashFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsIpcMod {
  type RPC[P /* <: String */, A /* <: js.Array[_] */, D /* <: js.Object */] = RPCResponse[RPCRequest[P, A], D]
}
