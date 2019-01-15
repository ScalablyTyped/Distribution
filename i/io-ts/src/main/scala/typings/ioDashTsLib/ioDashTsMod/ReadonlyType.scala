package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "ReadonlyType")
@js.native
class ReadonlyType[C /* <: Any */, A, O, I] protected () extends Type[A, O, I] {
  def this(name: java.lang.String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], `type`: C) = this()
  val _tag: ioDashTsLib.ioDashTsLibStrings.ReadonlyType = js.native
  val `type`: C = js.native
}

