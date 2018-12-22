package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "TaggedUnionType")
@js.native
class TaggedUnionType[Tag /* <: java.lang.String */, RTS /* <: fpDashTsLib.libArrayMod.Global.Array[Tagged[Tag, _, _]] */, A, O, I] protected () extends UnionType[RTS, A, O, I] {
  def this(name: java.lang.String, is: Is[A], validate: Validate[I, A], encode: Encode[A, O], types: RTS, tag: Tag) = this()
  val tag: Tag = js.native
}

