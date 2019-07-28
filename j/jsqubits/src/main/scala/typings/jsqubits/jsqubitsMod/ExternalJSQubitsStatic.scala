package typings.jsqubits.jsqubitsMod

import typings.jsqubits.jsqubitsMod.jsqubitsNs.QState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalJSQubitsStatic extends js.Object {
  @JSName("jsqubits")
  var jsqubits_Original: JSQubitsStatic = js.native
  def jsqubits(bitString: String): QState = js.native
}

