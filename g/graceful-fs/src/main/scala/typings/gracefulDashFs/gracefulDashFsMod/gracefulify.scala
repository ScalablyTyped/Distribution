package typings.gracefulDashFs.gracefulDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "gracefulify")
@js.native
object gracefulify extends js.Object {
  def apply[T](fsModule: T): T with Lutimes = js.native
}

