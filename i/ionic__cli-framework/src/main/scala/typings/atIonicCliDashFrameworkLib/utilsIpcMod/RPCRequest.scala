package typings
package atIonicCliDashFrameworkLib.utilsIpcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RPCRequest[P /* <: java.lang.String */, A /* <: js.Array[_] */] extends js.Object {
  var args: A
  var id: java.lang.String
  var procedure: P
  var `type`: atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.`rpc-request`
}

