package typings
package ioDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/es6", "ReadonlyArrayType")
@js.native
class ReadonlyArrayType[C /* <: Any */, A, O, I] protected () extends Type[A, O, I] {
  def this(name: java.lang.String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], `type`: C) = this()
  val _tag: ioDashTsLib.ioDashTsLibStrings.ReadonlyArrayType = js.native
  val `type`: C = js.native
}

