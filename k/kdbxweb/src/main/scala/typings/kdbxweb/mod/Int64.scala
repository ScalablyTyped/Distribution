package typings.kdbxweb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("kdbxweb", "Int64")
@js.native
class Int64 protected () extends js.Object {
  def this(lo: Double, hi: Double) = this()
  var hi: Double = js.native
  var lo: Double = js.native
}

/* static members */
@JSImport("kdbxweb", "Int64")
@js.native
object Int64 extends js.Object {
  def from(value: Double): Int64 = js.native
}

