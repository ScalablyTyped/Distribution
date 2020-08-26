package typings.jdenticon.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jdenticon", "toPng")
@js.native
object toPng extends js.Object {
  def apply(hashOrValue: js.Any, size: Double): Buffer = js.native
  def apply(hashOrValue: js.Any, size: Double, config: Double): Buffer = js.native
  def apply(hashOrValue: js.Any, size: Double, config: JdenticonConfig): Buffer = js.native
}

