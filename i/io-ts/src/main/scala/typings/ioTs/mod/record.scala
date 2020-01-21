package typings.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "record")
@js.native
object record extends js.Object {
  def apply[D /* <: Mixed_ */, C /* <: Mixed_ */](domain: D, codomain: C): RecordC[D, C] = js.native
  def apply[D /* <: Mixed_ */, C /* <: Mixed_ */](domain: D, codomain: C, name: String): RecordC[D, C] = js.native
}

