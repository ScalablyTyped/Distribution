package typings.jointjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "env")
@js.native
object env extends js.Object {
  def addTest(name: String, fn: js.Function0[Boolean]): Unit = js.native
  def test(name: String): Boolean = js.native
}

