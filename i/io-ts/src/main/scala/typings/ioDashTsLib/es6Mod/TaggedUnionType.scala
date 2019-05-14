package typings
package ioDashTsLib.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/es6", "TaggedUnionType")
@js.native
class TaggedUnionType[Tag /* <: java.lang.String */, CS /* <: js.Array[Mixed] */, A, O, I] protected () extends UnionType[CS, A, O, I] {
  def this(name: java.lang.String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], codecs: CS, tag: Tag) = this()
  val tag: Tag = js.native
}

