package typings.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("io-ts", "taggedUnion")
@js.native
object taggedUnion extends js.Object {
  def apply[Tag /* <: String */, CS /* <: js.Array[Mixed_] */](tag: Tag, codecs: CS): TaggedUnionC[Tag, CS] = js.native
  def apply[Tag /* <: String */, CS /* <: js.Array[Mixed_] */](tag: Tag, codecs: CS, name: String): TaggedUnionC[Tag, CS] = js.native
}

