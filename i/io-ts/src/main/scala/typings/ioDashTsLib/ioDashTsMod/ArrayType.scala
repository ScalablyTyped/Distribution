package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "ArrayType")
@js.native
class ArrayType[RT /* <: Any */, A, O, I] protected () extends Type[A, O, I] {
  def this(name: java.lang.String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], `type`: RT) = this()
  val _tag: ioDashTsLib.ioDashTsLibStrings.ArrayType = js.native
  val `type`: RT = js.native
}

