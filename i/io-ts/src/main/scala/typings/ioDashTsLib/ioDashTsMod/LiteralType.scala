package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "LiteralType")
@js.native
class LiteralType[V /* <: java.lang.String | scala.Double | scala.Boolean */] protected () extends Type[V, V, mixed] {
  def this(name: java.lang.String, is: Is[V], validate: Validate[mixed, V], encode: Encode[V, V], value: V) = this()
  val _tag: ioDashTsLib.ioDashTsLibStrings.LiteralType = js.native
  val value: V = js.native
}

