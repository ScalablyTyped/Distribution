package typings.libratoNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("librato-node", "measure")
@js.native
object measure extends js.Object {
  def apply(name: String, value: Double): Unit = js.native
  def apply(name: String, value: Double, opts: CustomSource): Unit = js.native
}

