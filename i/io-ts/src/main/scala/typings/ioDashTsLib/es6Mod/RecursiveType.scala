package typings
package ioDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/es6", "RecursiveType")
@js.native
class RecursiveType[C /* <: Any */, A, O, I] protected () extends Type[A, O, I] {
  def this(name: java.lang.String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], runDefinition: js.Function0[C]) = this()
  val _tag: ioDashTsLib.ioDashTsLibStrings.RecursiveType = js.native
  var runDefinition: js.Any = js.native
  val `type`: C = js.native
}

