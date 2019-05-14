package typings
package ioDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/es6", "DictionaryType")
@js.native
class DictionaryType[D /* <: Any */, C /* <: Any */, A, O, I] protected () extends Type[A, O, I] {
  def this(name: java.lang.String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], domain: D, codomain: C) = this()
  val _tag: ioDashTsLib.ioDashTsLibStrings.DictionaryType = js.native
  val codomain: C = js.native
  val domain: D = js.native
}

