package typings.k6.k6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def check[VT](`val`: VT, sets: Checkers[VT]): Boolean = js.native
  def check[VT](`val`: VT, sets: Checkers[VT], tags: js.Object): Boolean = js.native
  def fail(): scala.Nothing = js.native
  def fail(err: String): scala.Nothing = js.native
  def group[RT](name: String, fn: js.Function0[RT]): RT = js.native
  def sleep(t: Double): Unit = js.native
}

