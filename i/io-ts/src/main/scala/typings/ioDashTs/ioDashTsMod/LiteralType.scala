package typings.ioDashTs.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "LiteralType")
@js.native
class LiteralType[V /* <: LiteralValue */] protected ()
  extends Type[V, V, js.Any] {
  def this(name: String, is: Is[V], validate: Validate[_, V], encode: Encode[V, V], value: V) = this()
  val _tag: typings.ioDashTs.ioDashTsStrings.LiteralType = js.native
  val value: V = js.native
}

