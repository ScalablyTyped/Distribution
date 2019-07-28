package typings.ioDashTs.es6Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts/es6", "TaggedUnionType")
@js.native
class TaggedUnionType[Tag /* <: String */, CS /* <: js.Array[Mixed] */, A, O, I] protected () extends UnionType[CS, A, O, I] {
  def this(name: String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], codecs: CS, tag: Tag) = this()
  val tag: Tag = js.native
}

