package typings.matrixJsSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("matrix-js-sdk", "createClient")
@js.native
object createClient extends js.Object {
  def apply(ops: String): MatrixClient = js.native
  def apply(ops: CreateClientOption): MatrixClient = js.native
}

