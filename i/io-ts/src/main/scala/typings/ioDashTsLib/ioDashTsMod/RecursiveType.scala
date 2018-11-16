package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "RecursiveType")
@js.native
class RecursiveType[RT /* <: Any */, A, O, I] protected () extends Type[A, O, I] {
  def this(name: java.lang.String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], runDefinition: js.Function0[RT]) = this()
  val _tag: ioDashTsLib.ioDashTsLibStrings.RecursiveType = js.native
  var runDefinition: js.Any = js.native
  val `type`: RT = js.native
}

