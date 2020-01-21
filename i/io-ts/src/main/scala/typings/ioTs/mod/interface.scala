package typings.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "interface")
@js.native
object interface extends js.Object {
  def apply[P /* <: Props */](props: P): TypeC[P] = js.native
  def apply[P /* <: Props */](props: P, name: String): TypeC[P] = js.native
}

