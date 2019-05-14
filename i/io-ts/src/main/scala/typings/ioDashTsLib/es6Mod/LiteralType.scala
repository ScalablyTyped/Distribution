package typings
package ioDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/es6", "LiteralType")
@js.native
class LiteralType[V /* <: LiteralValue */] protected ()
  extends Type[V, V, js.Any] {
  def this(name: java.lang.String, is: Is[V], validate: Validate[_, V], encode: Encode[V, V], value: V) = this()
  val _tag: ioDashTsLib.ioDashTsLibStrings.LiteralType = js.native
  val value: V = js.native
}

