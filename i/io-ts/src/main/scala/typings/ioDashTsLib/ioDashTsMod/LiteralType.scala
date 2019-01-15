package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "LiteralType")
@js.native
class LiteralType[V /* <: ioDashTsLib.LiteralValue */] protected ()
  extends Type[V, V, js.Any] {
  def this(name: java.lang.String, is: Is[V], validate: Validate[_, V], encode: Encode[V, V], value: V) = this()
  val _tag: ioDashTsLib.ioDashTsLibStrings.LiteralType = js.native
  val value: V = js.native
}

